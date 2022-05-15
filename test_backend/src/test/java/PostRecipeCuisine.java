import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PostRecipeCuisine {


    @Test
    void postRecipeCuisinePorkWithBeans() {
        JsonPath response = given()
                .queryParam("apiKey","f0aff8f0262c4d24a997529555086625")
                .queryParam("title", "Pork roast with green beans")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine")
                .body()
                .jsonPath();
        assertThat(response.get("cuisine"), equalTo("Mediterranean"));

    }

    @Test
    void postRecipeCuisinePotato() {
        JsonPath response = given()
                .queryParam("apiKey","f0aff8f0262c4d24a997529555086625")
                .queryParam("title", "potato")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine")
                .body()
                .jsonPath();
        assertThat(response.get("cuisines[1]"), equalTo("European"));

    }

    @Test
    void postRecipeCuisineRice() {
        JsonPath response = given()
                .queryParam("apiKey","f0aff8f0262c4d24a997529555086625")
                .queryParam("title", "rice with chicken")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine")
                .body()
                .jsonPath();
        assertThat(response.get("cuisines[2]"), equalTo("Italian"));

    }

    @Test
    void postRecipeCuisineFri() {
        JsonPath response = given()
                .queryParam("apiKey","f0aff8f0262c4d24a997529555086625")
                .queryParam("title", "frii")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine")
                .body()
                .jsonPath();
        assertThat(response.get("cuisines[0]"), equalTo("Mediterranean"));

    }

    @Test
    void postRecipeCuisineBurger() {
        JsonPath response = given()
                .queryParam("apiKey","f0aff8f0262c4d24a997529555086625")
                .queryParam("title", "burger")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine")
                .body()
                .jsonPath();
        assertThat(response.get("cuisines[0]"), equalTo("American"));

    }


}
