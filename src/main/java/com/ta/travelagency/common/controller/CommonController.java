/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.travelagency.common.controller;

import com.ta.travelagency.model.TaLoginValidationRQ;
import com.ta.travelagency.model.TaLoginValidationRS;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Midde
 */
@RestController
@RequestMapping("home")
public class CommonController {
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    @ResponseBody
    public TaLoginValidationRS loginvalidation(@RequestBody TaLoginValidationRQ req){
        TaLoginValidationRS taLoginValidationRS = new TaLoginValidationRS();
        
        boolean isValidate = false;
        if(req.getHeader().getUserName().equalsIgnoreCase("root123") && req.getHeader().getPassword().equalsIgnoreCase("root123")){
            isValidate = true;
        }
        taLoginValidationRS.setTokenId(""+isValidate);
        
        return taLoginValidationRS;
    }
    
    @GetMapping("/")
    public String test(){
        return "Hello Midde, How are you ?";
    }
}
