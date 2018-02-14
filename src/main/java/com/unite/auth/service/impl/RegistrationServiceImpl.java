package com.unite.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unite.auth.model.AssociateUser;
import com.unite.auth.respository.AssociateUserRepository;
import com.unite.auth.service.RegistrationService;
import com.unite.common.dto.AssociateUserDto;
import com.unite.auth.converter.ConverterUtil;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	AssociateUserRepository associateUserRepository;
	
	@Override
	public AssociateUserDto registerAssociate(AssociateUserDto associateUser) {
		AssociateUser associate = ConverterUtil.convertFromDto(associateUser);
		AssociateUserDto resultDto  = null;
		AssociateUser result = associateUserRepository.findOne(associate.getEmployeeId());
		if(result == null) {
			result = associateUserRepository.save(associate);
			resultDto = ConverterUtil.convertFromModel(result);
		}
		return resultDto;
	}

}
