package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.runner.Request;

public class RestfulBaseUrl {

    public RequestSpecification specRestfull;

    @Before
    public void baseUrl(){

        specRestfull = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();





    }




}
