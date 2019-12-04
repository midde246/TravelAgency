/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.travelagency.agency.packagemanagement.controller;

import com.ta.travelagency.agency.packagemanagement.service.PackageManagementService;
import com.ta.travelagency.model.PackageCategories;
import com.ta.travelagency.model.TaPackageCategoriesRS;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author saradam
 */
@RestController
@RequestMapping("/PackageManagement")
public class PackageManagementController {
    
    @Autowired
    PackageManagementService packageManagementService;
            
    @RequestMapping(value = "/packageCategories", method = RequestMethod.GET, produces = "application/json")
    public TaPackageCategoriesRS getPackageManagementCategories(){
        TaPackageCategoriesRS taPackageCategoriesRS = new TaPackageCategoriesRS();
        List<PackageCategories> packagecategoriesList = packageManagementService.getAllPackageCategoryList(); 
        taPackageCategoriesRS.setPackageCategories(packagecategoriesList);
        return taPackageCategoriesRS;
    }
    
}
