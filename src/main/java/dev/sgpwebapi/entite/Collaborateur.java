package dev.sgpwebapi.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COLLABORATEUR")
public class Collaborateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "MATRICULE")
	private String matricule;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "PRENOM")
	private String prenom;
	
	@Column(name = "DATENAISSANCE")
	private LocalDate datenaissance;
	
	@Column(name = "ADRESSE")
	private String adresse;
	
	@Column(name = "NUMSECUSOCIALE")
	private String numsecusociale;
	
	@Column(name = "EMAILPRO")
	private String emailpro;
	
	@Column(name = "PHOTO")
	private String photo;
	
	@Column(name = "DATEHEURECREATION")
	private ZonedDateTime dateheurecreation;
	
	@Column(name = "ACTIF")
	private Boolean actif;
	
	@Column(name = "INTITULEPOSTE")
	private String intitulePoste;
	
	@ManyToOne
	@JoinColumn(name = "IDDEPARTEMENT")
	private Departement departement;
	
	@Column(name = "BANQUE")
	private String banque;
	
	@Column(name = "BIC")
	private String bic;
	
	@Column(name = "IBAN")
	private String iban;

	public Collaborateur() {
		super();
	}

	public Collaborateur(String matricule, String nom, String prenom, LocalDate datenaissance, String adresse,
			String numsecusociale, String emailpro, String photo, ZonedDateTime dateheurecreation, Boolean actif,
			String intitulePoste, Departement departement, String banque, String bic, String iban) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.adresse = adresse;
		this.numsecusociale = numsecusociale;
		this.emailpro = emailpro;
		this.photo = photo;
		this.dateheurecreation = dateheurecreation;
		this.actif = actif;
		this.intitulePoste = intitulePoste;
		this.departement = departement;
		this.banque = banque;
		this.bic = bic;
		this.iban = iban;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the datenaissance
	 */
	public LocalDate getDatenaissance() {
		return datenaissance;
	}

	/**
	 * @param datenaissance the datenaissance to set
	 */
	public void setDatenaissance(LocalDate datenaissance) {
		this.datenaissance = datenaissance;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the numsecusociale
	 */
	public String getNumsecusociale() {
		return numsecusociale;
	}

	/**
	 * @param numsecusociale the numsecusociale to set
	 */
	public void setNumsecusociale(String numsecusociale) {
		this.numsecusociale = numsecusociale;
	}

	/**
	 * @return the emailpro
	 */
	public String getEmailpro() {
		return emailpro;
	}

	/**
	 * @param emailpro the emailpro to set
	 */
	public void setEmailpro(String emailpro) {
		this.emailpro = emailpro;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the dateheurecreation
	 */
	public ZonedDateTime getDateheurecreation() {
		return dateheurecreation;
	}

	/**
	 * @param dateheurecreation the dateheurecreation to set
	 */
	public void setDateheurecreation(ZonedDateTime dateheurecreation) {
		this.dateheurecreation = dateheurecreation;
	}

	/**
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}

	/**
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	/**
	 * @return the intitulePoste
	 */
	public String getIntitulePoste() {
		return intitulePoste;
	}

	/**
	 * @param intitulePoste the intitulePoste to set
	 */
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	/**
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}

	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	/**
	 * @return the banque
	 */
	public String getBanque() {
		return banque;
	}

	/**
	 * @param banque the banque to set
	 */
	public void setBanque(String banque) {
		this.banque = banque;
	}

	/**
	 * @return the bic
	 */
	public String getBic() {
		return bic;
	}

	/**
	 * @param bic the bic to set
	 */
	public void setBic(String bic) {
		this.bic = bic;
	}

	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	

}
