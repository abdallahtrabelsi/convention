package com.example.demo.model;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "conventions")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Convention {
	@Id
	@Column(name = "convention_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public String type;

	public LocalDate dateEditionConvention;

	public String objet;

	public LocalDate dateVigueurConvention;

	public LocalDate dateExpirationConvention;

	@OneToMany(mappedBy = "convention", cascade = CascadeType.ALL)
	private Set<ConventionParticipant> listConventionParticipant = new HashSet<>();

	public Convention() {

		super();
	}

	public Convention(String type, LocalDate dateEditionConvention, String objet, LocalDate dateVigueurConvention,
			LocalDate dateExpirationConvention, Set<ConventionParticipant> listConventionParticipant) {
		super();
		this.type = type;
		this.dateEditionConvention = dateEditionConvention;
		this.objet = objet;
		this.dateVigueurConvention = dateVigueurConvention;
		this.dateExpirationConvention = dateExpirationConvention;
		this.listConventionParticipant = listConventionParticipant;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getDateEditionConvention() {
		return dateEditionConvention;
	}

	public void setDateEditionConvention(LocalDate dateEditionConvention) {
		this.dateEditionConvention = dateEditionConvention;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public LocalDate getDateVigueurConvention() {
		return dateVigueurConvention;
	}

	public void setDateVigueurConvention(LocalDate dateVigueurConvention) {
		this.dateVigueurConvention = dateVigueurConvention;
	}

	public LocalDate getDateExpirationConvention() {
		return dateExpirationConvention;
	}

	public void setDateExpirationConvention(LocalDate dateExpirationConvention) {
		this.dateExpirationConvention = dateExpirationConvention;
	}

	public Set<ConventionParticipant> getListConventionParticipant() {
		return listConventionParticipant;
	}

	public void setListConventionParticipant(Set<ConventionParticipant> listConventionParticipant) {
		this.listConventionParticipant = listConventionParticipant;
	}

}
