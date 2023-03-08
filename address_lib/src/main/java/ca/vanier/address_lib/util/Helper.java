package ca.vanier.address_lib.util;

import ca.vanier.address_lib.entity.Address;

public class Helper {
    public Address parseFromJson(String json){
        Address address=new Address();

        return address;
    }

    public String createRequestEndpoint(String json){
        return "{vanierEndPoint}+/address/"+Constants.VAR_ADDR_KEY;
    }

    public static String createAddressEndpoint(String basePath){
        return basePath+Constants.ADDE_PATH;
    }

}
