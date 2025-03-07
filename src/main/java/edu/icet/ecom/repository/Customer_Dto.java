package edu.icet.ecom.repository;

import edu.icet.ecom.entity.Customer_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_Dto extends JpaRepository<Customer_entity,Long> {
}
