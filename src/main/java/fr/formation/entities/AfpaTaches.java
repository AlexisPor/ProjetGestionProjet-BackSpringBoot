package fr.formation.entities;
// Generated 17 mai 2021 � 15:50:52 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * AfpaTaches generated by hbm2java
 */
@Entity
@Table(name = "AFPA_TACHES", schema = "PROJETFULLSTACK")
public class AfpaTaches implements java.io.Serializable {

	private BigDecimal idtache;
	private AfpaModules afpaModules;
	private Date datedebut;
	private Date datefinestimee;
	private Date datefinreel;
	private String libelle;

	public AfpaTaches() {
	}

	public AfpaTaches(BigDecimal idtache) {
		this.idtache = idtache;
	}

	public AfpaTaches(BigDecimal idtache, AfpaModules afpaModules, Date datedebut, Date datefinestimee,
			Date datefinreel, String libelle) {
		this.idtache = idtache;
		this.afpaModules = afpaModules;
		this.datedebut = datedebut;
		this.datefinestimee = datefinestimee;
		this.datefinreel = datefinreel;
		this.libelle = libelle;
	}

	@Id
	@SequenceGenerator(name="AFPA_TACHES_SEQ", sequenceName = "AFPA_TACHES_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AFPA_TACHES_SEQ")
	@Column(name = "IDTACHE", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdtache() {
		return this.idtache;
	}

	public void setIdtache(BigDecimal idtache) {
		this.idtache = idtache;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FKTACHMODU")
	public AfpaModules getAfpaModules() {
		return this.afpaModules;
	}

	public void setAfpaModules(AfpaModules afpaModules) {
		this.afpaModules = afpaModules;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATEDEBUT", length = 7)
	public Date getDatedebut() {
		return this.datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATEFINESTIMEE", length = 7)
	public Date getDatefinestimee() {
		return this.datefinestimee;
	}

	public void setDatefinestimee(Date datefinestimee) {
		this.datefinestimee = datefinestimee;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATEFINREEL", length = 7)
	public Date getDatefinreel() {
		return this.datefinreel;
	}

	public void setDatefinreel(Date datefinreel) {
		this.datefinreel = datefinreel;
	}

	@Column(name = "LIBELLE")
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
