package fr.formation.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.entities.AfpaEmployes;
import fr.formation.services.EmployesService;

@RestController()
@RequestMapping("/employe")
public class EmployesRestController {

	@Autowired
	EmployesService empServ;
	
	@GetMapping("/list")
	public List<AfpaEmployes> findAll() {
		return empServ.findAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody AfpaEmployes afpaEmp) {
		empServ.add(afpaEmp);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody AfpaEmployes afpaEmp) {
		empServ.update(afpaEmp);
	}
	
	@DeleteMapping("/delete/{idemploye}")
	public void delete(@PathVariable BigDecimal idEmp) {
		AfpaEmployes afpaEmp = empServ.findById(idEmp);
		empServ.delete(afpaEmp);
	}
}
