/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.travelagency.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author saradam
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "packageCategories" 
})
@XmlRootElement(name = "ta_package_categories_rs")
public class TaPackageCategoriesRS {
    @XmlElement(name = "package_categories", required = true)
    private List<PackageCategories> packageCategories;

    /**
     * @return the packageCategories
     */
    public List<PackageCategories> getPackageCategories() {
        return packageCategories;
    }

    /**
     * @param packageCategories the packageCategories to set
     */
    public void setPackageCategories(List<PackageCategories> packageCategories) {
        this.packageCategories = packageCategories;
    }
    
}
