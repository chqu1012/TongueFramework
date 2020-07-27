package de.dc.fx.tongue.demo.model;

import de.dc.fx.tonque.core.ITongueBindingModel;
import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class Registration implements ITongueBindingModel{
	
	private String username;
	private String name;
	private String familyname;
	private String email;
	private int stars;
	
	public String getUsername(){ return this.username; }
	public void setUsername(String username){ this.username = username; }
	public String getName(){ return this.name; }
	public void setName(String name){ this.name = name; }
	public String getFamilyname(){ return this.familyname; }
	public void setFamilyname(String familyname){ this.familyname = familyname; }
	public String getEmail(){ return this.email; }
	public void setEmail(String email){ this.email = email; }
	public int getStars(){ return this.stars; }
	public void setStars(int stars){ this.stars = stars; }
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Registration[");
		sb.append("username").append(": ").append(this.username).append(", ");
		sb.append("name").append(": ").append(this.name).append(", ");
		sb.append("familyname").append(": ").append(this.familyname).append(", ");
		sb.append("email").append(": ").append(this.email).append(", ");
		sb.append("stars").append(": ").append(this.stars).append(", ");
		sb.append("]").append("\n");
		return sb.toString();
	}
}

