import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RecipeTests {
    private final String apikey = "f0aff8f0262c4d24a997529555086625";

    @Test
    void getRecipeWithQueryParametersTest() {
        given()
                .queryParam("apiKey", "f0aff8f0262c4d24a997529555086625")
                .queryParam("query", "Pasta")
                .when()
                .get("https://api.spoonacular.com/recipes/complexSearch?query=Pasta")
                .then().assertThat().statusCode(200);

    }
    @Test
    void getRecipeWithQueryPasta() {
        JsonPath response = given()
                .queryParam("apiKey","f0aff8f0262c4d24a997529555086625")
                .queryParam("query", "Pasta")
                .when()
                .get("https://api.spoonacular.com/recipes/complexSearch?query=Pasta")
                .body()
                .jsonPath();
        assertThat(response.get("results[0].title"), equalTo("Pasta With Tuna"));

    }

    @Test
    void getRecipeWithQueryAfrican() {
        JsonPath response = given()
                .queryParam("apiKey","f0aff8f0262c4d24a997529555086625")
                .queryParam("cuisine", "African")
                .when()
                .get("https://api.spoonacular.com/recipes/complexSearch?cuisine=African")
                .body()
                .jsonPath();
        assertThat(response.get("results[0].title"), equalTo("African Chicken Peanut Stew"));

    }


    @Test
    void getRecipeWithQueryAddRecipeInformation() {
        JsonPath response = given()
                .queryParam("apiKey","f0aff8f0262c4d24a997529555086625")
                .queryParam("addRecipeInformation", "false")
                .when()
                .get("https://api.spoonacular.com/recipes/complexSearch?addRecipeInformation=false")
                .body()
                .jsonPath();
        assertThat(response.get("results[0].title"), equalTo("Cauliflower, Brown Rice, and Vegetable Fried Rice"));

    }

    @Test
    void getRecipeWithQueryRecipeBoxId() {
        JsonPath response = given()
                .queryParam("apiKey","f0aff8f0262c4d24a997529555086625")
                .queryParam("recipeBoxId", "2468")
                .when()
                .get("https://api.spoonacular.com/recipes/complexSearch?recipeBoxId=2468")
                .body()
                .jsonPath();
        assertThat(response.get("results[0].title"), equalTo("Dark Chocolate Mousse"));

    }





}


