package ca.vanier.customer_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.vanier.customer_lib.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
}