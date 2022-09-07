package com.pgrg.basicdesignpattern.repo.factorymethod;

import com.pgrg.basicdesignpattern.model.factorymethod.UserType2Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserType2Repo extends JpaRepository<UserType2Entity, Integer> {

}
