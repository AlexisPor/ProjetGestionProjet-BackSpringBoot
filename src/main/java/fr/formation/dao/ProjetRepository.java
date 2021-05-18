package fr.formation.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.entities.AfpaProjet;

public interface ProjetRepository extends JpaRepository<AfpaProjet, BigDecimal>{

}
