package ru.netology.APIAndCITestingPostmanEcho;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class PostmanEchoTest {

    @Test
    void bodyResponseTest() {
        given()
                .log().body()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Бахтина Екатерина")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Бахтина Екатерина"));
    }

}
