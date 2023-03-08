package ca.vanier.customer_content.util;

public class cutomer_contentMsg {
    
    public void getSaveSuccessMsg(String name){
        System.out.println("Customer "+ name+" saved.");
    }

    public void getUpdateSuccessMsg(String name){
        System.out.println("Customer "+ name+" updated.");
    }

    public void getDeleteSuccessMsg(String name){
        System.out.println("Customer "+ name+" deleted.");
    }
}
