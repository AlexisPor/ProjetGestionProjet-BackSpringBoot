package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import fr.formation.entities.AfpaEmployes;

public interface EmployesService {
	
	public void add(AfpaEmployes AfpaEmployes);
	
	public void delete(AfpaEmployes AfpaEmployes);
	
	public void update(AfpaEmployes AfpaEmployes);
	
	public List<AfpaEmployes> findAll();
	
	AfpaEmployes findById(BigDecimal idemployes);

}
