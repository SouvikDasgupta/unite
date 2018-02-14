package com.unite.auth.converter;

import com.unite.auth.model.AssociateUser;
import com.unite.auth.util.PasswordEncryptDcrypter;
import com.unite.common.dto.AssociateUserDto;

public class ConverterUtil {
	
	public static AssociateUser convertFromDto(AssociateUserDto associate) {
		AssociateUser associateModel = new AssociateUser();
		if(associate!=null) {
			associateModel.setEmployeeId(associate.getEmployeeId().toLowerCase().trim());
			associateModel.setCompanyEmail(associate.getCompanyEmail().trim());
			associateModel.setPassword(PasswordEncryptDcrypter.encryptPassword(associate.getPassword()));
			}
		return null;
	}
	
	
	public static AssociateUserDto convertFromModel(AssociateUser associate) {
		AssociateUserDto associateDto = new AssociateUserDto();
		if(associate!=null) {
			associateDto.setEmployeeId(associate.getEmployeeId());
			associateDto.setReferenceId(associate.getReferenceId());
			associateDto.setUsername(associate.getUsername());
			associateDto.setCompanyEmail(associate.getCompanyEmail());
			associateDto.setUserType(associate.getUserType());
			}
		return null;
	}

}
