package fr.formation.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.entities.AfpaModules;

public interface ModulesRepository extends JpaRepository<AfpaModules, BigDecimal> {

}
