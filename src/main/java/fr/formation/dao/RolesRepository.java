package fr.formation.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.entities.AfpaRoles;

public interface RolesRepository extends JpaRepository<AfpaRoles, BigDecimal>{

}
