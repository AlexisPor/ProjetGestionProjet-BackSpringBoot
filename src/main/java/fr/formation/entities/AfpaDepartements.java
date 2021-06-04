package fr.formation.entities;
// Generated 17 mai 2021 � 15:50:52 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * AfpaDepartements generated by hbm2java
 */
@Entity
@Table(name = "AFPA_DEPARTEMENTS", schema = "PROJETFULLSTACK")
public class AfpaDepartements implements java.io.Serializable {

	private BigDecimal iddepartements;
	private String libelle;
	private Set<AfpaEmployes> afpaEmployeses = new HashSet<AfpaEmployes>(0);

	public AfpaDepartements() {
	}

	public AfpaDepartements(BigDecimal iddepartements) {
		this.iddepartements = iddepartements;
	}

	public AfpaDepartements(BigDecimal iddepartements, String libelle, Set<AfpaEmployes> afpaEmployeses) {
		this.iddepartements = iddepartements;
		this.libelle = libelle;
		this.afpaEmployeses = afpaEmployeses;
	}

	@Override
	public String toString() {
		return "AfpaDepartements [iddepartements=" + iddepartements + ", libelle=" + libelle + "]";
	}	

	@Id
	@SequenceGenerator(name="AFPA_DEPARTEMENTS_SEQ", sequenceName = "AFPA_DEPARTEMENTS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AFPA_DEPARTEMENTS_SEQ")
	@Column(name = "IDDEPARTEMENTS", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIddepartements() {
		return this.iddepartements;
	}

	public void setIddepartements(BigDecimal iddepartements) {
		this.iddepartements = iddepartements;
	}

	@Column(name = "LIBELLE")
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "afpaDepartements")
	@JsonIgnore
	public Set<AfpaEmployes> getAfpaEmployeses() {
		return this.afpaEmployeses;
	}

	public void setAfpaEmployeses(Set<AfpaEmployes> afpaEmployeses) {
		this.afpaEmployeses = afpaEmployeses;
	}

}
