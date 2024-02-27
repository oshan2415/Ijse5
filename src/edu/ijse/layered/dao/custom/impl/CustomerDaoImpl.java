/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.CustomerDao;
import edu.ijse.layered.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CustomerDaoImpl implements CustomerDao{
    @Override
    public boolean add(CustomerEntity t) throws Exception {
       return false;
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
return false;
    }
    
    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer WHERE CustID = ?", id);
        while (rst.next()) {
            CustomerEntity entity = new CustomerEntity();

            entity.setCustid(rst.getString("CustID"));
            entity.setName(rst.getString("Name"));
            entity.setEmail(rst.getString("Email"));
            entity.setContact(rst.getString("Contact"));
           
            
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        return null;
    }
    
}
