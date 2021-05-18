package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import fr.formation.entities.AfpaTaches;

public interface TachesService {

	public void add(AfpaTaches afpaTaches);
	
	public void delete(AfpaTaches afpaTaches);
	
	public void update(AfpaTaches afpaTaches);
	
	public List<AfpaTaches> findAll();
	
	AfpaTaches findById(BigDecimal idTaches);
}
