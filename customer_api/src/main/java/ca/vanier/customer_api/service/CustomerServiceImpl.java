package ca.vanier.customer_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.vanier.customer_lib.entity.Customer;
import ca.vanier.customer_api.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;

    //Add a new customer
    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    //Get all customers
    @Override
    public List<Customer> getAllCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }

    //Search a customer by Id
    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    //Search a customer by Id
    @Override
    public Customer getCustomerById(Long id) {
        Customer customer=customerRepository.findById(id).get();
        return customer;
    }

    //Delete a customer by Id
    @Override
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }


    //Update a customer 
    @Override
    public Customer updateById(Customer customer,Long id) {
        Customer newCustomer = customerRepository.findById(id).get();
        // Validation
        newCustomer.setName(customer.getName());
        newCustomer.setEmail(customer.getEmail());
        newCustomer.setAge(customer.getAge());
        //newCustomer.setAddress(null);

        return customerRepository.save(newCustomer);
        //customerRepository.save(customer);
    }

}
