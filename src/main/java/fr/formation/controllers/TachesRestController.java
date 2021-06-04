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

import fr.formation.entities.AfpaTaches;
import fr.formation.services.TachesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/tache")
public class TachesRestController {

	@Autowired
	TachesService tachServ;
	
	@GetMapping("/list")
	public List<AfpaTaches> findAll(){
		return tachServ.findAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody AfpaTaches afpaTach) {
		tachServ.add(afpaTach);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody AfpaTaches afpaTach) {
		tachServ.update(afpaTach);
	}
	
	@DeleteMapping("/delete/{idtache}")
	public void delete(@PathVariable(name = "idtache") BigDecimal idTach) {
		AfpaTaches afpaTache = tachServ.findById(idTach);
		tachServ.delete(afpaTache);
	}
	
	@GetMapping("/find/{idtache}")
	public AfpaTaches findById(@PathVariable(name = "idtache") BigDecimal idTaches) {
		
		return tachServ.findById(idTaches);
	}
	
	
}
