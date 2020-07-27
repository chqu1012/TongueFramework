package de.dc.fx.tongue.demo.person.model;

import de.dc.fx.tonque.core.ITongueBindingModel;
import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class Person implements ITongueBindingModel{
	
	private String name;
	private String familyname;
	private boolean isMan;
	private int age;
	private Person person;
	
	public String getName(){ return this.name; }
	public void setName(String name){ this.name = name; }
	public String getFamilyname(){ return this.familyname; }
	public void setFamilyname(String familyname){ this.familyname = familyname; }
	public boolean getIsMan(){ return this.isMan; }
	public void setIsMan(boolean isMan){ this.isMan = isMan; }
	public int getAge(){ return this.age; }
	public void setAge(int age){ this.age = age; }
	public Person getPerson(){ return this.person; }
	public void setPerson(Person person){ this.person = person; }
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Person[");
		sb.append("name").append(": ").append(this.name).append(", ");
		sb.append("familyname").append(": ").append(this.familyname).append(", ");
		sb.append("isMan").append(": ").append(this.isMan).append(", ");
		sb.append("age").append(": ").append(this.age).append(", ");
		sb.append("person").append(": ").append(this.person).append(", ");
		sb.append("]").append("\n");
		return sb.toString();
	}
}

