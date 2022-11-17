package com.nadhem.etudiants.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Classe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClasse;
	private String nomClasse;
	private String departement;
	@JsonIgnore
	@OneToMany(mappedBy = "classe")
	private List<Etudiant> etudiant;
	public Classe() {
		// TODO Auto-generated constructor stub
	}
	public Classe( String nomClasse, String departement, List<Etudiant> etudiant) {
		super();
		
		this.nomClasse = nomClasse;
		this.departement = departement;
		this.etudiant = etudiant;
	}
	public Long getIdClasse() {
		return idClasse;
	}
	public void setIdClasse(Long idClasse) {
		this.idClasse = idClasse;
	}
	public String getNomClasse() {
		return nomClasse;
	}
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public List<Etudiant> getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(List<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}
	
	
	
}
