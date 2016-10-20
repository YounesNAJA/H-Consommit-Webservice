package com.hc.model;
// Generated 11 mai 2016 03:02:00 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * AleatoireElec generated by hbm2java
 */
public class AleatoireElec implements java.io.Serializable {

	private Integer id;
	private int idCompte;
	private Date dateConsultation;
	private long chiffreCompteur;
	private long quantite;

	public AleatoireElec() {
	}

	public AleatoireElec(int idCompte, long chiffreCompteur, long quantite) {
		this.idCompte = idCompte;
		this.chiffreCompteur = chiffreCompteur;
		this.dateConsultation = new Date();
		this.quantite = quantite;
	}

	public AleatoireElec(int idCompte, Date dateConsultation, long chiffreCompteur, long quantite) {
		this.idCompte = idCompte;
		this.dateConsultation = dateConsultation;
		this.chiffreCompteur = chiffreCompteur;
		this.quantite = quantite;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdCompte() {
		return this.idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public Date getDateConsultation() {
		return this.dateConsultation;
	}

	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

	public long getChiffreCompteur() {
		return this.chiffreCompteur;
	}

	public void setChiffreCompteur(long chiffreCompteur) {
		this.chiffreCompteur = chiffreCompteur;
	}

	public long getQuantite() {
		return this.quantite;
	}

	public void setQuantite(long quantite) {
		this.quantite = quantite;
	}

}
