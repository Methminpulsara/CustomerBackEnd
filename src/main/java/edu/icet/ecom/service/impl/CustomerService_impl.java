package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.entity.Customer_entity;
import edu.icet.ecom.repository.Customer_Dto;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor


public class CustomerService_impl implements CustomerService {

    final Customer_Dto dto;
    final ModelMapper mapper;

    @Override
    public void add(Customer customer) {
         dto.save(mapper.map(customer, Customer_entity.class));
    }

    @Override
    public void update(Customer customer) {
        dto.save(mapper.map(customer, Customer_entity.class));
    }

    @Override
    public Customer search(Long id) {
        return mapper.map(dto.findById(id),Customer.class );
    }

    @Override
    public void delete(Long id) {
        dto.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        List<Customer_entity> all = dto.findAll();
        List <Customer> customers = new ArrayList<>();
        all.forEach(customerEntity -> {
            customers.add(mapper.map(customerEntity,Customer.class));
        });
        return customers;
    }
}
