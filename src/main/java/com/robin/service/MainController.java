package com.robin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rpbro on 8/10/2017.
 */
@RestController
public class MainController
{
    //@Autowired
    //

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
    @RequestMapping(name = "/teams", method = RequestMethod.GET)
    public List<String> teams() {
        List<String> teams = new ArrayList<>();
        return teams;
    }
//    @RequestMapping(name = "/standing", method = RequestMethod.GET)
//    public List<String> standing() {
//        service returns current standing
//    }


}
