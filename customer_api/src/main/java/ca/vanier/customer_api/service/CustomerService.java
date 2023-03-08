package ca.vanier.customer_api.service;

import java.util.List;
import java.util.Optional;

import ca.vanier.customer_lib.entity.Customer;

public interface CustomerService {

    Customer addCustomer(Customer customer);

    List<Customer> getAllCustomer();

    Optional<Customer> findById(Long id) ;

    Customer getCustomerById(Long id);

    void deleteById(Long id);

    Customer updateById(Customer customer,Long id);
    
}
