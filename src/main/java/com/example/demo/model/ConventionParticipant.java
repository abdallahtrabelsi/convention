package com.example.demo.model;


import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "convention_participant")
public class ConventionParticipant {

	@Id
	@Column(name = "ConventionParticipant_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "participant_id")
	private Participant participant;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "convention_id")
	private Convention convention;

	private LocalDate dateSignature;

	public ConventionParticipant() {
		super();
	}

	public ConventionParticipant(Participant participant, Convention convention, LocalDate localDate) {
		super();
		this.participant = participant;
		this.convention = convention;
		this.dateSignature = localDate;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Convention getConvention() {
		return convention;
	}

	public void setConvention(Convention convention) {
		this.convention = convention;
	}

	public LocalDate getDateSignature() {
		return dateSignature;
	}

	public void setDateSignature(LocalDate dateSignature) {
		this.dateSignature = dateSignature;
	}

}
