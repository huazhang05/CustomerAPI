package ca.vanier.customer_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.vanier.address_lib.util.Constants;
import ca.vanier.address_lib.util.Helper;
import ca.vanier.business_logic_lib.entity.businessLogic;
import ca.vanier.customer_lib.entity.Customer;
import ca.vanier.customer_api.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PostMapping("/update/{id}")
    public String updateById(@RequestBody Customer customer, @PathVariable Long id) {
        if (!customerService.findById(id).isPresent()) {
            return "Customer not found";
        } else {
            customerService.updateById(customer, id);
            return "Success";
        }
    }

    @GetMapping("/list")
    public List<Customer> listTest() {
        return customerService.getAllCustomer();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        if (!customerService.findById(id).isPresent()) {
            return "Customer not found";
        } else {
            customerService.deleteById(id);
            return "Success";
        }
    }

    @GetMapping(Constants.ADDE_PATH)
    public String isItAddressesKey() {
        return Helper.createAddressEndpoint(Constants.ADDE_PATH);
    }

    @GetMapping("/IsEligibile/{id}")
    public String AgeIsEligibile(@PathVariable Long id) {
        if (!customerService.findById(id).isPresent())
            return "Customer not found";
        else {
            Customer customer = customerService.findById(id).get();
            if (businessLogic.isEligibile(customer.getAge()))
                return "The age of Customer " + customer.getName() + " is eligible.";
            else
                return "The age of Customer " + customer.getName() + " is not eligible.";
        }
    }

    @GetMapping("/IsValid/{id}")
    public String isValid(@PathVariable Long id) {
        if (!customerService.findById(id).isPresent()) {
            return "Customer not found";
        }
        Customer customer = customerService.findById(id).get();
        if (businessLogic.isValid(customer))
            return "This customer is valid";
        else
            return "This customer is not valid";

    }

    @GetMapping("/residesWith/{cust1_id}/{cust2_id}")
    public String isValid(@PathVariable("cust1_id") Long cust1_id, @PathVariable("cust2_id") Long cust2_id) {
        Customer customer1 = customerService.findById(cust1_id).get();
        Customer customer2 = customerService.findById(cust2_id).get();
        if (businessLogic.residesWith(customer1, customer2))
            return "Customer " + customer1.getName() + " and Customer " + customer2.getName()
                    + " are living in the same address";
        else
            return "Customer " + customer1.getName() + " and Customer " + customer2.getName()
                    + " are not living in the same address";
    }

}
