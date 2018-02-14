package com.unite.auth.resource.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unite.auth.resource.RegistrationResource;
import com.unite.auth.service.RegistrationService;
import com.unite.common.dto.AssociateUserDto;
@RestController
public class RegistrationResourceImpl implements RegistrationResource {
	
	@Autowired
	RegistrationService registrationService;
	@Override
	public ResponseEntity<AssociateUserDto> registerAssociate(@RequestBody AssociateUserDto user) {		
		AssociateUserDto response = registrationService.registerAssociate(user);
		return ResponseEntity.ok(response);
	}

}
