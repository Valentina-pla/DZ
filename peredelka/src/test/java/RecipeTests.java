import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class RecipeTests {
    public RecipeTests() {
    }

    @BeforeEach
    void beforeTest() {
        RestAssured.responseSpecification = (new ResponseSpecBuilder()).expectStatusCode(200).expectContentType(ContentType.JSON).build();
        RestAssured.requestSpecification = (new RequestSpecBuilder()).addQueryParam("apiKey", new Object[]{"f0aff8f0262c4d24a997529555086625"}).setContentType(ContentType.JSON).build();
    }

    @Test
    void getRecipeWithQueryParametersTest() {
        ((ValidatableResponse)((Response)RestAssured.given().spec(RestAssured.requestSpecification).queryParam("query", new Object[]{"Pasta"}).when().get("https://api.spoonacular.com/recipes/complexSearch?query=Pasta", new Object[0])).then()).spec(RestAssured.responseSpecification);
    }

    @Test
    void getRecipeWithQueryPasta() {
        ResponseGet response = (ResponseGet)((ValidatableResponse)((Response)RestAssured.given().spec(RestAssured.requestSpecification).queryParam("query", new Object[]{"Pasta"}).when().get("https://api.spoonacular.com/recipes/complexSearch?query=Pasta", new Object[0])).then()).extract().body().as(ResponseGet.class);
        MatcherAssert.assertThat(((Result)response.getResults().get(0)).getTitle(), Matchers.equalTo("Pasta With Tuna"));
    }

    @Test
    void getRecipeWithQueryAfrican() {
        ResponseGet response = (ResponseGet)((ValidatableResponse)((Response)RestAssured.given().queryParam("apiKey", new Object[]{"f0aff8f0262c4d24a997529555086625"}).queryParam("cuisine", new Object[]{"African"}).when().get("https://api.spoonacular.com/recipes/complexSearch?cuisine=African", new Object[0])).then()).extract().body().as(ResponseGet.class);
        MatcherAssert.assertThat(((Result)response.getResults().get(0)).getTitle(), Matchers.equalTo("African Chicken Peanut Stew"));
    }

    @Test
    void getRecipeWithQueryAddRecipeInformation() {
        ResponseGet response = (ResponseGet)((ValidatableResponse)((Response)RestAssured.given().queryParam("apiKey", new Object[]{"f0aff8f0262c4d24a997529555086625"}).queryParam("addRecipeInformation", new Object[]{"false"}).when().get("https://api.spoonacular.com/recipes/complexSearch?addRecipeInformation=false", new Object[0])).then()).extract().body().as(ResponseGet.class);
        MatcherAssert.assertThat(((Result)response.getResults().get(0)).getTitle(), Matchers.equalTo("Cauliflower, Brown Rice, and Vegetable Fried Rice"));
    }

    @Test
    void getRecipeWithQueryRecipeBoxId() {
        ResponseGet response = (ResponseGet)((ValidatableResponse)((Response)RestAssured.given().queryParam("apiKey", new Object[]{"f0aff8f0262c4d24a997529555086625"}).queryParam("recipeBoxId", new Object[]{"2468"}).when().get("https://api.spoonacular.com/recipes/complexSearch?recipeBoxId=2468", new Object[0])).then()).extract().body().as(ResponseGet.class);
        MatcherAssert.assertThat(((Result)response.getResults().get(0)).getTitle(), Matchers.equalTo("Dark Chocolate Mousse"));
    }
}

