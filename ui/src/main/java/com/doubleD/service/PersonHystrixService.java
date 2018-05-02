package com.doubleD.service;

import com.doubleD.domain.Person;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by double on 17-12-17.
 * person service的断路器
 */
@Service
public class PersonHystrixService {
    @Autowired
    PersonService personService;

    //当服务不可用时，调用后备方法fallbackSave
    @HystrixCommand(fallbackMethod = "fallbackSave")
    public List<Person> save(String name){
        return personService.save(name);
    }

    public List<Person> fallbackSave(String name){
        List<Person> people = new ArrayList<Person>();
        Person p = new Person("person service 故障");
        people.add(p);
        return people;
    }
}
