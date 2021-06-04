package fr.formation.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.entities.AfpaEmployes;
import java.lang.String;
import java.util.List;

public interface EmployesRepository extends JpaRepository<AfpaEmployes, BigDecimal>{
	
	List<AfpaEmployes> findByNomContains(String nom);
}
