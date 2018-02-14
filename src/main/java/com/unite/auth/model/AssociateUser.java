package com.unite.auth.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;


@Table(name="associate_user")
@Entity
@DynamicUpdate(value = true)
public class AssociateUser {
	
	@Id
	@Column(name="employee_id")
	private String employeeId;
	
	@Column(name="reference_id", unique=true)
	private String referenceId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="company_email", length=255, unique=true, nullable=false)
	private String companyEmail;
	
	@Column(name="usertype", length=50 , columnDefinition =" String default = associate")
	private String userType;
	
	@Column(name="client_email" , length=255, nullable=true)
	private String clientEmail;
	
	@Column(name="password")
	private String password;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="is_deleted")
	private boolean isDeleted;
	
	@Column(name="is_archived")
	private boolean isArchived;
	
	@Column(name="auth_token")
	private boolean authToken;
	
	@Column(name="is_email_verified", nullable=false)
	private boolean isEmailVerified;
	
	@Column(name="auth_token_expiry")
	@Temporal(TemporalType.TIMESTAMP)
	private Date authTokenExpiry;
	
	

	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public String getReferenceId() {
		return referenceId;
	}



	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getCompanyEmail() {
		return companyEmail;
	}



	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}



	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	public String getClientEmail() {
		return clientEmail;
	}



	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public boolean isActive() {
		return isActive;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	public boolean isDeleted() {
		return isDeleted;
	}



	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}



	public boolean isArchived() {
		return isArchived;
	}



	public void setArchived(boolean isArchived) {
		this.isArchived = isArchived;
	}



	public boolean isAuthToken() {
		return authToken;
	}



	public void setAuthToken(boolean authToken) {
		this.authToken = authToken;
	}



	public boolean isEmailVerified() {
		return isEmailVerified;
	}



	public void setEmailVerified(boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}



	public Date getAuthTokenExpiry() {
		return authTokenExpiry;
	}



	public void setAuthTokenExpiry(Date authTokenExpiry) {
		this.authTokenExpiry = authTokenExpiry;
	}



	@Override
	public String toString() {
		return "AssociateUser [employeeId=" + employeeId + ", referenceId=" + referenceId + ", username=" + username
				+ ", companyEmail=" + companyEmail + ", userType=" + userType + ", clientEmail=" + clientEmail
				+ ", password=" + password + ", isActive=" + isActive + ", isDeleted=" + isDeleted + ", isArchived="
				+ isArchived + ", authToken=" + authToken + ", isEmailVerified=" + isEmailVerified
				+ ", authTokenExpiry=" + authTokenExpiry + "]";
	}
	
}
