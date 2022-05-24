import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AddMealTest {
    String id;

    @Test
    void addMealTest() {
        id = given()
                .queryParam("hash", "bd709e5bda1165a4b65b87928dad8b58704d7601")
                .queryParam("apiKey", "f0aff8f0262c4d24a997529555086625")
                .body("{\n"
                        + " \"date\": 1644881179,\n"
                        + " \"slot\": 1,\n"
                        + " \"position\": 0,\n"
                        + " \"type\": \"INGREDIENTS\",\n"
                        + " \"value\": {\n"
                        + " \"ingredients\": [\n"
                        + " {\n"
                        + " \"name\": \"1 banana\"\n"
                        + " }\n"
                        + " ]\n"
                        + " }\n"
                        + "}")
                .when()
                .post("https://api.spoonacular.com/mealplanner/vplatonova/items")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id")
                .toString();
    }
    @AfterEach
    void tearDown() {
        given()
                .queryParam("hash", "bd709e5bda1165a4b65b87928dad8b58704d7601")
                .queryParam("apiKey", "f0aff8f0262c4d24a997529555086625")
                .delete("https://api.spoonacular.com/mealplanner/vplatonova/items/" + id)
                .then()
                .statusCode(200);
    }

}
