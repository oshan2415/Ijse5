/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.CustomerDao;
import edu.ijse.layered.dto.CustomerDto;
import edu.ijse.layered.entity.CustomerEntity;
import edu.ijse.layered.service.custom.CustomerService;

/**
 *
 * @author user
 */
public class CustomerServiceImpl implements CustomerService{
      private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity e = customerDao.get(id);
        if(e != null){
            CustomerDto dto = new CustomerDto(e.getCustid(),
                    e.getName(), 
                    e.getEmail(),
                    e.getContact());
            
            return dto;
        }
        return null;
    }
}
