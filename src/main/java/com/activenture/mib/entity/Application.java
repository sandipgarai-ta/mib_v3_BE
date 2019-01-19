package com.activenture.mib.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="application")
public class Application {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_application", nullable = false, length = 19, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date dtApplication;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="city")
	private String city;
	
	@Column(name="product_id")
	private int productId;
	
	
	
	public Application() {}
	
	public Application(Date dtApplication) {
		this.dtApplication=dtApplication;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDtApplication() {
		return dtApplication;
	}

	public void setDtApplication(Date dtApplication) {
		this.dtApplication = dtApplication;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	

}
