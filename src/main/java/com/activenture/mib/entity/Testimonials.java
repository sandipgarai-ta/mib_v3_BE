package com.activenture.mib.entity;
// Generated Oct 6, 2018 3:15:49 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Testimonials generated by hbm2java
 */
@Entity
@Table(name = "testimonials", catalog = "activent_mib_dev")
public class Testimonials implements java.io.Serializable {

	private Integer testimonialId;
	private Date dtCreate;
	private Date dtModify;
	private Integer actionBy;
	private String testimonialBody;
	private String clientName;
	private String clientDesignation;
	private Integer isActive;

	public Testimonials() {
	}

	public Testimonials(Date dtCreate, Date dtModify) {
		this.dtCreate = dtCreate;
		this.dtModify = dtModify;
	}

	public Testimonials(Date dtCreate, Date dtModify, Integer actionBy, String testimonialBody, String clientName,
			String clientDesignation, Integer isActive) {
		this.dtCreate = dtCreate;
		this.dtModify = dtModify;
		this.actionBy = actionBy;
		this.testimonialBody = testimonialBody;
		this.clientName = clientName;
		this.clientDesignation = clientDesignation;
		this.isActive = isActive;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "testimonial_id", unique = true, nullable = false)
	public Integer getTestimonialId() {
		return this.testimonialId;
	}

	public void setTestimonialId(Integer testimonialId) {
		this.testimonialId = testimonialId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_create", nullable = false, length = 19)
	public Date getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_modify", nullable = false, length = 19)
	public Date getDtModify() {
		return this.dtModify;
	}

	public void setDtModify(Date dtModify) {
		this.dtModify = dtModify;
	}

	@Column(name = "action_by")
	public Integer getActionBy() {
		return this.actionBy;
	}

	public void setActionBy(Integer actionBy) {
		this.actionBy = actionBy;
	}

	@Column(name = "testimonial_body")
	public String getTestimonialBody() {
		return this.testimonialBody;
	}

	public void setTestimonialBody(String testimonialBody) {
		this.testimonialBody = testimonialBody;
	}

	@Column(name = "client_name")
	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Column(name = "client_designation")
	public String getClientDesignation() {
		return this.clientDesignation;
	}

	public void setClientDesignation(String clientDesignation) {
		this.clientDesignation = clientDesignation;
	}

	@Column(name = "is_active")
	public Integer getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

}
