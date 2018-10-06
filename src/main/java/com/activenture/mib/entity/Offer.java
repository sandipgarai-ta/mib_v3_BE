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
 * Offer generated by hbm2java
 */
@Entity
@Table(name = "offer", catalog = "activent_mib_dev")
public class Offer implements java.io.Serializable {

	private Long offerId;
	private Date dtCreate;
	private Date dtModify;
	private Integer actionBy;
	private String offerName;
	private String offerImgLink;
	private Integer isActive;

	public Offer() {
	}

	public Offer(Date dtCreate, Date dtModify) {
		this.dtCreate = dtCreate;
		this.dtModify = dtModify;
	}

	public Offer(Date dtCreate, Date dtModify, Integer actionBy, String offerName, String offerImgLink,
			Integer isActive) {
		this.dtCreate = dtCreate;
		this.dtModify = dtModify;
		this.actionBy = actionBy;
		this.offerName = offerName;
		this.offerImgLink = offerImgLink;
		this.isActive = isActive;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "offer_id", unique = true, nullable = false)
	public Long getOfferId() {
		return this.offerId;
	}

	public void setOfferId(Long offerId) {
		this.offerId = offerId;
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

	@Column(name = "offer_name")
	public String getOfferName() {
		return this.offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	@Column(name = "offer_img_link")
	public String getOfferImgLink() {
		return this.offerImgLink;
	}

	public void setOfferImgLink(String offerImgLink) {
		this.offerImgLink = offerImgLink;
	}

	@Column(name = "is_active")
	public Integer getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

}
