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
import fr.formation.services.EmployesService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
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
		System.out.println("afpaEmp=>"+afpaEmp);
		empServ.add(afpaEmp);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody AfpaEmployes afpaEmp) {
		empServ.update(afpaEmp);
	}
	
	@DeleteMapping("/delete/{idemploye}")
	public void delete(@PathVariable(name = "idemploye") BigDecimal idEmp) {
		System.out.println("idEmp==>"+idEmp);
		AfpaEmployes afpaEmp = empServ.findById(idEmp);
		empServ.delete(afpaEmp);
	}
	
	 @GetMapping("/find/{idemploye}")
		public AfpaEmployes findById(@PathVariable(name = "idemploye") BigDecimal idemployes) {
			
			return empServ.findById(idemployes);
		}
	 
	 @GetMapping("/search/{nom}")
	 public List<AfpaEmployes> searchEmpByName(String nom){
		return empServ.findByNomContains(nom);
		 
	 }
}
