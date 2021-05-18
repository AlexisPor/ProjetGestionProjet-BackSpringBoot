package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import fr.formation.entities.AfpaModules;

public interface ModulesService {

	public void add(AfpaModules afpaModule);
	
	public void delete(AfpaModules afpaModules);
	
	public void update(AfpaModules afpaModules);
	
	public List<AfpaModules> findAll();
	
	AfpaModules findById(BigDecimal idModules);
}
