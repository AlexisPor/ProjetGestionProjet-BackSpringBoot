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

import fr.formation.entities.AfpaEmployes;
import fr.formation.entities.AfpaModules;
import fr.formation.services.ModulesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/module")
public class ModulesRestController {

	@Autowired
	ModulesService modServ;
	
	@GetMapping("/list")
	public List<AfpaModules> findAll() {
		return modServ.findAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody AfpaModules afpaMod) {
		modServ.add(afpaMod);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody AfpaModules afpaMod) {
		modServ.update(afpaMod);
	}
	
	@DeleteMapping("/delete/{idmodule}")
	public void delete(@PathVariable(name="idmodule") BigDecimal idMod) {
		AfpaModules afpaMod = modServ.findById(idMod);
		modServ.delete(afpaMod);
	}
	 @GetMapping("/find/{idmodule}")
		public AfpaModules findById(@PathVariable(name = "idmodule") BigDecimal idModules) {
			
			return modServ.findById(idModules);
		}
	
}
