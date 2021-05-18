package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import fr.formation.entities.AfpaDepartements;

public interface DepartementsService {
	
	public void add(AfpaDepartements AfpaDepartements);
	
	public void delete(AfpaDepartements AfpaDepartements);
	
	public void update(AfpaDepartements AfpaDepartements);
	
	public List<AfpaDepartements> findAll();
	
	AfpaDepartements findById(BigDecimal idDepartements);
}
