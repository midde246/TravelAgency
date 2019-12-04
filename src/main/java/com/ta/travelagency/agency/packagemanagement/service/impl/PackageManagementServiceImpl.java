/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.travelagency.agency.packagemanagement.service.impl;

import com.ta.travelagency.agency.packagemanagement.service.PackageManagementService;
import com.ta.travelagency.model.PackageCategory;
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
    public List<PackageCategory> getAllPackageCategoryList() {
        List<PackageCategory> packageCategoryList = new ArrayList<>();
        PackageCategory pc1 = new PackageCategory();
        PackageCategory pc2 = new PackageCategory();
        PackageCategory pc3 = new PackageCategory();
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
