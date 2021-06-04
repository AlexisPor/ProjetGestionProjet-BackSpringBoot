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

import fr.formation.entities.AfpaRoles;
import fr.formation.services.RolesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/role")
public class RolesRestController {

	@Autowired
	RolesService roleServ;
	
	@GetMapping("/list")
	public List<AfpaRoles> findAll(){
		return roleServ.findAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody AfpaRoles afpaRole) {
		roleServ.add(afpaRole);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody AfpaRoles afpaRole) {
		roleServ.update(afpaRole);
	}
	
	@DeleteMapping("/delete/{idrole}")
	public void delete(@PathVariable(name="idrole") BigDecimal idRole) {
		AfpaRoles afpaRoles = roleServ.findById(idRole);
		roleServ.delete(afpaRoles);
	}
	@GetMapping("/find/{idrole}")
	public AfpaRoles findById(@PathVariable(name = "idrole") BigDecimal idRoles) {
		
		return roleServ.findById(idRoles);
	}
}
