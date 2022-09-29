package com.crosby.listdemo;

public class Job {
	
	private String id;
	private String staffMemberName;
	private String description;
	private boolean isResolved;
	
	public Job(String id, String staffMemberName, String description, boolean isResolved) {
		super();
		this.id = id;
		this.staffMemberName = staffMemberName;
		this.description = description;
		this.isResolved = isResolved;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStaffMemberName() {
		return staffMemberName;
	}

	public void setStaffMemberName(String staffMemberName) {
		this.staffMemberName = staffMemberName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isResolved() {
		return isResolved;
	}

	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}
	
}
