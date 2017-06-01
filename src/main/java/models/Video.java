package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video {

	private String name;
	private String lastModified;

	public Video() {

	}

	public String getLastModified() {
		return lastModified;
	}

	public String getName() {
		return name;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + " ,last modified: " + lastModified;
	}
}
