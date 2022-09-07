package com.pgrg.basicdesignpattern.repo.factorymethod;

import com.pgrg.basicdesignpattern.model.factorymethod.UserType1Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserType1Repo extends JpaRepository<UserType1Entity, Integer> {

}
