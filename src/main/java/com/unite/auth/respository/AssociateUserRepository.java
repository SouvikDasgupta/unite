package com.unite.auth.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unite.auth.model.AssociateUser;

@Repository
public interface AssociateUserRepository extends JpaRepository<AssociateUser, String> {

}
