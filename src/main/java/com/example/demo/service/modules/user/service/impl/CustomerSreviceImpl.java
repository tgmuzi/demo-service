package com.example.demo.service.modules.user.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.mapper.user.CustomerMapper;
import com.example.demo.modules.entity.user.entity.Customer;
import com.example.demo.service.modules.user.service.CustomerSrevice;
import com.example.demo.utils.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerSreviceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerSrevice {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public int addCustomer(Customer customer) {
        return customerMapper.insert(customer);
    }

    @Override
    @DS("slave")
    public List<Customer> findCustomer(Encrypt phone) {
        return customerMapper.findCustomer(phone);
    }

}