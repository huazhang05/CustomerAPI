package ca.vanier.business_logic_lib.entity;

import ca.vanier.customer_lib.entity.Customer;

public class businessLogic {
    
    public static boolean isEligibile(int age){        
        return (age>17)?true:false;     
    }

    public static boolean isValid(Customer customer){
        return (customer.getName()!=null && customer.getEmail()!=null && customer.getAge()!=0)?true:false; 
    }

    public static boolean residesWith(Customer cus1,Customer cus2){
        return (cus1.getAddress().equals(cus2.getAddress()))?true:false;        
    }
}
