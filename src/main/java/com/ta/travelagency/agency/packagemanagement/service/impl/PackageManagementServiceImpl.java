/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.travelagency.agency.packagemanagement.service.impl;

import com.ta.travelagency.agency.packagemanagement.service.PackageManagementService;
import com.ta.travelagency.model.PackageCategories;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author saradam
 */
@Component
public class PackageManagementServiceImpl implements PackageManagementService{

    @Override
    public List<PackageCategories> getAllPackageCategoryList() {
        List<PackageCategories> packageCategoryList = new ArrayList<>();
        PackageCategories pc1 = new PackageCategories();
        PackageCategories pc2 = new PackageCategories();
        PackageCategories pc3 = new PackageCategories();
        pc1.setId("101");
        pc1.setName("Family Trip");
        packageCategoryList.add(pc1);
        pc2.setId("2");
        pc2.setName("Wild Life Trip");
        packageCategoryList.add(pc2);
        pc3.setId("3");
        pc3.setName("Fitness Trip");
        packageCategoryList.add(pc3);
        return packageCategoryList;
    }
    
}
