/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.travelagency.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Midde
 */
@RestController
public class CommonController {
    @GetMapping("/")
    public String test(){
        return "Hello Midde, How are you ?";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginvalidation(){
        return "Login Validation";
    }
}
