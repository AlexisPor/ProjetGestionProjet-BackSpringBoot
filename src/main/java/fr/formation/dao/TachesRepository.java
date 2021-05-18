package fr.formation.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.entities.AfpaTaches;

public interface TachesRepository extends JpaRepository<AfpaTaches, BigDecimal>{

}
