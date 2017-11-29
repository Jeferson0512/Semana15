package com.tecsup.gestion.model;

import javax.validation.constraints.NotEmpty;

public class Role {
	
	String roleId;
	
	String description;
	
	
	
	public Role(String description) {
		super();
		this.description = description;

	}


	public Role() {
		super();
	}


	public String getRoleId() {
		return roleId;
	}


	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", description=" + description + "]";
	}

	
	
	
}
