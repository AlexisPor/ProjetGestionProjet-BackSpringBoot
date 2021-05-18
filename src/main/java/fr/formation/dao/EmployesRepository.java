package fr.formation.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.entities.AfpaEmployes;

public interface EmployesRepository extends JpaRepository<AfpaEmployes, BigDecimal>{

}
