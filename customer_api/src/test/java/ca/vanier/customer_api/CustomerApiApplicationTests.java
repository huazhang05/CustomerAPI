package ca.vanier.customer_api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ExceptionHandler;

import ca.vanier.address_lib.util.Helper;

@SpringBootTest
class CustomerApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@ExceptionHandler
    public void HelperTest(){
    String endpoint=Helper.createAddressEndpoint("xxx");
    assertEquals(endpoint,"xxx/addresses");
	}
}
