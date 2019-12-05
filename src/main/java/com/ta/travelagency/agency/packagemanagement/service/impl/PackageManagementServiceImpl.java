/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.travelagency.agency.packagemanagement.service.impl;

import com.ta.travelagency.agency.packagemanagement.dao.PackageManagementDao;
import com.ta.travelagency.agency.packagemanagement.service.PackageManagementService;
import com.ta.travelagency.model.Categories;
import com.ta.travelagency.model.PackageCategory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author saradam
 */
@Component
public class PackageManagementServiceImpl implements PackageManagementService{
    
    @Autowired
    PackageManagementDao packageManagementDao;
    
    @Override
    public List<PackageCategory> getAllPackageCategoryList() {
        List<PackageCategory> packageCategoryList = new ArrayList<>();
        
        
        List<Categories> categoryList = packageManagementDao.findAll();
        for(Categories category : categoryList){
            PackageCategory packageCategory = new PackageCategory();
            packageCategory.setId(category.getId());
            packageCategory.setName(category.getName());
            packageCategoryList.add(packageCategory);
        }
        
        return packageCategoryList;
    }
    
}
