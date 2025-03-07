package edu.icet.ecom.service;

import edu.icet.ecom.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {

    void add(Customer customer);
    void update(Customer customer);
    Customer search (Long id );
    void delete(Long id);
    List<Customer> getAll();

}
