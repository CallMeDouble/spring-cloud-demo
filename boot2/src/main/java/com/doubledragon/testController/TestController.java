package com.doubledragon.testController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by double
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String testController(){
        System.out.println("test2");
        return "test2";
    }
}
