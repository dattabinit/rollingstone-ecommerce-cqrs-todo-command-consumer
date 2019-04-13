package com.rollingstone.command;

import java.sql.Timestamp;

public class GenericCommandHeader {

	private String commandType;
	private String schemaVersion;
	private Timestamp createDate;
	public String getCommandType() {
		return commandType;
	}
	public void setCommandType(String commandType) {
		this.commandType = commandType;
	}
	public String getSchemaVersion() {
		return schemaVersion;
	}
	public void setSchemaVersion(String schemaVersion) {
		this.schemaVersion = schemaVersion;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public GenericCommandHeader(String commandType, String schemaVersion, Timestamp createDate) {
		super();
		this.commandType = commandType;
		this.schemaVersion = schemaVersion;
		this.createDate = createDate;
	}
	public GenericCommandHeader() {
		super();
	}
	@Override
	public String toString() {
		return "GenericCommandHeader [commandType=" + commandType + ", schemaVersion=" + schemaVersion + ", createDate="
				+ createDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commandType == null) ? 0 : commandType.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((schemaVersion == null) ? 0 : schemaVersion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenericCommandHeader other = (GenericCommandHeader) obj;
		if (commandType == null) {
			if (other.commandType != null)
				return false;
		} else if (!commandType.equals(other.commandType))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (schemaVersion == null) {
			if (other.schemaVersion != null)
				return false;
		} else if (!schemaVersion.equals(other.schemaVersion))
			return false;
		return true;
	}
	
	
}
