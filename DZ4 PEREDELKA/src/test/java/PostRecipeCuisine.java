import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PostRecipeCuisine {
    @BeforeEach
    void beforeTest() {
        RestAssured.responseSpecification = (new ResponseSpecBuilder()).expectStatusCode(200).expectContentType(ContentType.JSON).build();
        RestAssured.requestSpecification = (new RequestSpecBuilder()).addQueryParam("apiKey", new Object[]{"f0aff8f0262c4d24a997529555086625"}).setContentType(ContentType.JSON).build();
    }



    @Test
    void postRecipeCuisinePorkWithBeans() {
        Response response = (Response)((io.restassured.response.Response)((ValidatableResponse)((io.restassured.response.Response)RestAssured.given().spec(RestAssured.requestSpecification).queryParam("title", new Object[]{"Pork roast with green beans"}).when().post("https://api.spoonacular.com/recipes/cuisine", new Object[0])).then()).extract().response()).body().as(Response.class);
        MatcherAssert.assertThat(response.getCuisine(), Matchers.containsString("Mediterranean"));
    }

    @Test
    void postRecipeCuisinePotato() {
        Response response = (Response)((io.restassured.response.Response)((ValidatableResponse)((io.restassured.response.Response)RestAssured.given().spec(RestAssured.requestSpecification).queryParam("title", new Object[]{"potato"}).when().post("https://api.spoonacular.com/recipes/cuisine", new Object[0])).then()).extract().response()).body().as(Response.class);
        MatcherAssert.assertThat(response.getCuisine(), Matchers.containsString("Mediterranean"));
    }

    @Test
    void postRecipeCuisineRice() {
        Response response = (Response)((io.restassured.response.Response)((ValidatableResponse)((io.restassured.response.Response)RestAssured.given().spec(RestAssured.requestSpecification).queryParam("title", new Object[]{"rice with chicken"}).when().post("https://api.spoonacular.com/recipes/cuisine", new Object[0])).then()).extract().response()).body().as(Response.class);
        MatcherAssert.assertThat((String)response.getCuisines().get(0), Matchers.equalTo("Mediterranean"));
    }

    @Test
    void postRecipeCuisineFri() {
        Response response = (Response)((io.restassured.response.Response)((ValidatableResponse)((io.restassured.response.Response)RestAssured.given().spec(RestAssured.requestSpecification).queryParam("title", new Object[]{"frii"}).when().post("https://api.spoonacular.com/recipes/cuisine", new Object[0])).then()).extract().response()).body().as(Response.class);
        MatcherAssert.assertThat((String)response.getCuisines().get(1), Matchers.equalTo("European"));
    }

    @Test
    void postRecipeCuisineBurger() {
        Response response = (Response)((io.restassured.response.Response)((ValidatableResponse)((io.restassured.response.Response)RestAssured.given().spec(RestAssured.requestSpecification).queryParam("title", new Object[]{"burger"}).when().post("https://api.spoonacular.com/recipes/cuisine", new Object[0])).then()).extract().response()).body().as(Response.class);
        MatcherAssert.assertThat((String)response.getCuisines().get(2), Matchers.equalTo("Italian"));
    }
}
