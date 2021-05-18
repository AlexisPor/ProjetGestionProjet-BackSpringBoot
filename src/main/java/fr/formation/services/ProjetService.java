package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import fr.formation.entities.AfpaProjet;

public interface ProjetService {

	public void add(AfpaProjet afpaProjet);
	
	public void delete(AfpaProjet afpaProjet);
	
	public void update(AfpaProjet afpaProjet);
	
	public List<AfpaProjet> findAll();
	
	AfpaProjet findById(BigDecimal idProjet);
}
