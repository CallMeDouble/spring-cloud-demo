package com.doubleD.dao;

import com.doubleD.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by double on 17-12-17.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}