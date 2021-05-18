package fr.formation.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.entities.AfpaDepartements;

public interface DepartementsRepository extends JpaRepository<AfpaDepartements, BigDecimal>{

}
