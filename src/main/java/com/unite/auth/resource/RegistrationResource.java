package com.unite.auth.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unite.auth.model.AssociateUser;
import com.unite.common.dto.AssociateUserDto;

@RequestMapping("{companyName}/unite")
public interface RegistrationResource {
	
	
	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public ResponseEntity<AssociateUserDto> registerAssociate(@RequestBody AssociateUserDto user);
	
}
