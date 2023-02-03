package io.quarkus.workshop.superheroes.villain;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Random;

import static io.restassured.RestAssured.given;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.NO_CONTENT;
import static javax.ws.rs.core.Response.Status.OK;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class VillainResourceTest {

    private static final String JSON = "application/json;charset=UTF";

    private static final String DEFAULT_NAME = "Super Chocolatine";

    private static final String UPDATED_NAME = "Super Chocolatine (updated)";

    private static final String DEFAULT_OTHER_NAME = "Super Chocolatine chocolate in";

    private static final String UPDATED_OTHER_NAME = "Super Chocolatine chocolate in (updated)";

    private static final String DEFAULT_PICTURE = "super_chocolatine.png";

    private static final


    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/villains")
          .then()
             .statusCode(200)
             .body(is("Hello Villain Resource"));
    }

    @Test
    void shouldNotGetUnknownVillain() {
        Long randomId = new Random().nextLong();
        given()
            .pathParam("id", randomId)
            .when().get("/api/villains/{id}")
            .then()
            .statusCode(NO_CONTENT.getStatusCode());
    }

    @Test
    void shouldGetRandomVillain() {
        given()
            .when().get("/api/villains/random")
            .then()
            .statusCode(OK.getStatusCode())
            .contentType(APPLICATION_JSON);
    }

    @Test
    void shouldNotAddInvalidItem() {
        Villain villain = new Villain();
        villain.name = null;
        villain.otherName = DEFAULT_OTHER_NAME;
    }

}
