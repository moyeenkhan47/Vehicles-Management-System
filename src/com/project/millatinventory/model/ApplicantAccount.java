package com.project.millatinventory.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ApplicantAccount")
public class ApplicantAccount implements Serializable{
private static final long serialVersionUID = 1L;

@EmbeddedId
private AccountTypes accountTypes;

public AccountTypes getAccountTypes() {
	return accountTypes;
}

public void setAccountTypes(AccountTypes accountTypes) {
	this.accountTypes = accountTypes;
}
}