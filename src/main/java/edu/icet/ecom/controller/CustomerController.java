package edu.icet.ecom.controller;


import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
@RequiredArgsConstructor
public class CustomerController {


    final CustomerService service;


    @PostMapping("/add")
    public void add (@RequestBody Customer customer){
        service.add(customer);
    }

    @GetMapping("/search/{id}")
    public Customer search (@PathVariable Long id){
        return service.search(id);
    }

    @PutMapping("/update")
    public void update (@RequestBody Customer customer){
        service.update(customer);
    }


    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable Long id ){
        service.delete(id);
    }

    @GetMapping("/getAll")
    List<Customer> getAll (){
        return service.getAll();
    }




}
