package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
	
	@Id
	@GeneratedValue()
	private long portfolioId;
	
	@OneToOne
	@JoinColumn(name = "clientId")
	private Client client;
	
	@Column(nullable = false)
	private String portfolioName;
	
	@Column(nullable = false)
	private String creationDate;
	
	protected Portfolio() {

	}
	
	public Portfolio(Client client, String portfolioName, String creationDate) {
		this.client = client;
		this.portfolioName = portfolioName;
		this.creationDate = creationDate;
	}
	
	public Long getPortfolioId() {
		return portfolioId;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public String getPortfolioName() {
		return portfolioName;
	}
	
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	
	public String getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
}
