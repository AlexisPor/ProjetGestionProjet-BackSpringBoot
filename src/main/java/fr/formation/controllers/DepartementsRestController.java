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

import fr.formation.entities.AfpaDepartements;
import fr.formation.entities.AfpaEmployes;
import fr.formation.services.DepartementsService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/departement")
public class DepartementsRestController {
	
	@Autowired
	DepartementsService depServ;

	@GetMapping("/list")
	public List<AfpaDepartements> findAll(){
		return depServ.findAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody AfpaDepartements afpaDepartements) {
		depServ.add(afpaDepartements);
		System.out.println("id dep = "+afpaDepartements.getIddepartements());
	}
	
	@PutMapping("/update")
	public void update(@RequestBody AfpaDepartements afpaDepartements) {
		depServ.update(afpaDepartements);
	}
	
	@DeleteMapping("/delete/{iddepartements}")
	public void delete(@PathVariable(name="iddepartements") BigDecimal id) {
		AfpaDepartements afpaDep = depServ.findById(id);
		depServ.delete(afpaDep);
	}
	
	 @GetMapping("/find/{iddepartements}")
		public AfpaDepartements findById(@PathVariable(name = "iddepartements") BigDecimal idDepartements) {
			
			return depServ.findById(idDepartements);
		}
}
