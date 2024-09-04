package com.project.millatinventory.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

	/* @Value("${rel-version}") */
	@Value("1.0.0")
	private String relVersion;
	
	/* @Value("${rel-Date}") */
	@Value("2024-08-26")
	private String relDate;
	
	/* @Value("${dataFile.storageLocation}") */
	@Value("E:\\VUS\\VehicleUtilization-master")
	private String storageLocation;

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public String getFilesqllocation() {
		return filesqllocation;
	}

	public void setFilesqllocation(String filesqllocation) {
		this.filesqllocation = filesqllocation;
	}

	/* @Value("${mysql.installation.location}") */
	@Value("E:\\Software")
	private String filesqllocation;
	
	/* @Value("${mysql.database.user}") */
	@Value("root")
	private String userName;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/* @Value("${mysql.database.password}") */
	@Value("Abdul@123")
	private String pass; 
	
	/* @Value("${mysql.database.url}") */
	@Value("jdbc:mysql://localhost:3306/v_u_system?useSSL=false;serverTimezone=UTC;")
	private String resource;

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRelDate() {
		return relDate;
	}

	public void setRelDate(String relDate) {
		this.relDate = relDate;
	}

	public String getRelVersion() {
		return relVersion;
	}

	public void setRelVersion(String relVersion) {
		this.relVersion = relVersion;
	}
}
