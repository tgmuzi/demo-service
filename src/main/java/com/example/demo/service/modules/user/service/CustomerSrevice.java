package com.example.demo.service.modules.user.service;

import com.example.demo.modules.entity.user.entity.Customer;
import com.example.demo.utils.Encrypt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerSrevice {

    int addCustomer(Customer customer);

    List<Customer> findCustomer(@Param("phone") Encrypt phone);
}