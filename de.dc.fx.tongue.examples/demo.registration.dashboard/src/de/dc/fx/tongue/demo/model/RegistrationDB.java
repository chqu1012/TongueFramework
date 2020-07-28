package de.dc.fx.tongue.demo.model;

	import javax.persistence.*;

	@Entity
	@Table(name="REGISTRATIONDB")
	public class RegistrationDB {

		@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;
	    
	    private String username;
	    private String name;
	    private String familyname;
	    private String email;
	    
	     public String getUsername(){ return this.username;}
	     public void setUsername(String username){ this.username=username;};
	     public String getName(){ return this.name;}
	     public void setName(String name){ this.name=name;};
	     public String getFamilyname(){ return this.familyname;}
	     public void setFamilyname(String familyname){ this.familyname=familyname;};
	     public String getEmail(){ return this.email;}
	     public void setEmail(String email){ this.email=email;};
	    
	    
	    public RegistrationDB() {}
	    
	    @Override
	    public String toString() {
	      return String.format(
	          "RegistrationDB[id=%d, username=%s, name=%s, familyname=%s, email=%s]",
	          id, username, name, familyname, email);
	    }
	}
