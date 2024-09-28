package tests;

import baseUrl.RestfulBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C03_BaseUrlTest extends RestfulBaseUrl {

    @Test
    public void baseUrlTest(){

        specRestfull.pathParams("pp1", "booking", "pp2", 84);

        Response response = given().when().spec(specRestfull).get("/{pp1}/{pp2}");

        response.prettyPrint();







    }








}
