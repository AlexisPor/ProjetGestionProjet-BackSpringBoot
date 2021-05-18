package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import fr.formation.entities.AfpaRoles;


public interface RolesService {

	public void add(AfpaRoles afpaRoles);
	
	public void delete(AfpaRoles afpaRoles);
	
	public void update(AfpaRoles afpaRoles);
	
	public List<AfpaRoles> findAll();
	
	AfpaRoles findById(BigDecimal idRoles);
}
