package fr.formation.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.entities.AfpaModules;
import fr.formation.entities.AfpaProjet;
import fr.formation.services.ProjetService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/projet")
public class ProjetRestController {

	@Autowired
	ProjetService projServ;
	
	@GetMapping("/list")
	public List<AfpaProjet> findAll(){
		return projServ.findAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody AfpaProjet afpaProj) {
		projServ.add(afpaProj);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody AfpaProjet afpaProj) {
		projServ.update(afpaProj);
	}
	
	@DeleteMapping("/delete/{idprojet}")
		public void delete(@PathVariable(name="idprojet") BigDecimal idProj) {
			AfpaProjet afpaProj = projServ.findById(idProj);
			projServ.delete(afpaProj);
		}
	
	@GetMapping("/find/{idprojet}")
	public AfpaProjet findById(@PathVariable(name = "idprojet") BigDecimal idProjet) {
		
		return projServ.findById(idProjet);
	}
}
