package de.dc.fx.tongue.demo.service;

import java.util.*;
import de.dc.fx.tongue.demo.model.*;
import de.dc.fx.tongue.demo.repository.*;

@Service
public class RegistrationDBService{
	@Autowired
	RegistrationDBRepository registrationDBRepository;
	
	public List<RegistrationDB> findAll(){
		this.registrationDBRepository.findAll();
	}
	
	public void create(String username, String name, String familyname, String email){
		RegistrationDB registrationDB = new RegistrationDB();
		registrationDB.setUsername(username);
		registrationDB.setName(name);
		registrationDB.setFamilyname(familyname);
		registrationDB.setEmail(email);
		save(registrationDB);
	}
	
	public void save(RegistrationDB registrationDB){
		this.registrationDBRepository.save(registrationDB);
	}
	
	public void delete(RegistrationDB registrationDB){
		this.registrationDBRepository.delete(registrationDB);
	}
}
