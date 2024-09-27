package tests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class C02_Create_Token {

    @Test
    public void test02(){

        // 1- Request Body ve End Point hazirlama
        String url = "https://restful-booker.herokuapp.com/auth";

        // Request body oluşturma
        String requestBody = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        // 2- Expected Data hazirlama (bu örnekte gerekli değil)

        // 3- Request gönderip dönen response'u kaydetme
        Response response = given()
                .contentType(JSON)
                .body(requestBody)
                .when()
                .post(url);

        // Yanıtı yazdırma
        //response.prettyPrint();

        // Token'ı JSON yanıtından alma ve yazdırma
        String token = response.jsonPath().getString("token");
        System.out.println("Alınan Token: " + token);
    }
}
