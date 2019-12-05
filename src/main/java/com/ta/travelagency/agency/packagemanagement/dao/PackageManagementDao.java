/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.travelagency.agency.packagemanagement.dao;

import com.ta.travelagency.model.Categories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author saradam
 */
@Repository
public interface PackageManagementDao extends MongoRepository<Categories, Integer>{
    
}
