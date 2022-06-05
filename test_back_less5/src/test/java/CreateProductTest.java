import com.github.javafaker.Faker;
import jdk.jfr.Category;
import lombok.SneakyThrows;
import okhttp3.ResponseBody;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.*;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToObject;

public class CreateProductTest {
    static ProductService productService;
    Product productFood ;
    Product productBread;
    Faker faker = new Faker();
    int id;
    String result;

    @BeforeAll
    static void beforeAll() {
        productService = RetrofitUtils.getRetrofit()
                .create(ProductService.class);
    }

  @BeforeEach
   void setUp() {
      productFood = new Product()

              .withTitle(faker.food().ingredient())
            .withCategoryTitle("Food")
             .withPrice((int) (Math.random() * 10000));
      productBread = new Product()

              .withTitle("title")
              .withCategoryTitle("Bread")
              .withPrice((int) (Math.random() * 10000));


  }

    @Test
    void createProductInCategoryTest() throws IOException {
        Response<Product>response=productService.createProduct(productFood )
                .execute();
            id=   response.body().getId();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));

    }
    @Test
    void modifyProductPositive() throws IOException {
        Product p = productService.createProduct(productFood )
                .execute().body();

        Product changeProduct = p.withTitle("Butter");
        Response<Product>response=productService.modifyProduct(changeProduct)
                .execute();
        result= response.body().getTitle();

        assertThat(response.isSuccessful(), CoreMatchers.is(true));
        assertThat(response.body().getTitle(), equalTo("Butter"));

    }

    @Test
    void getProductByIdPositive () throws IOException{
        Product p = productService.createProduct(productFood )
                .execute().body();
        int productId = p.getId();
        Product getProduct = p.withId(1);
        Response<Product>response=productService.getProductById(productId)
                .execute();
       int result=  response.body().getId();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));
        assertThat(response.body().getId(), equalTo(p.getId()));

    }

@Test
    void getProductPositive()throws IOException{

    Response<Product>responseProductFood=productService.createProduct(productFood )
            .execute();
    Response<Product>responseProductBread=productService.createProduct(productFood)
            .execute();

    Response<Product[]>response=productService.getProducts().execute();

    assertThat(response.isSuccessful(), CoreMatchers.is(true));
    assertThat(response.body().length, equalTo(2));


}
 @AfterEach
@Test
 void tearDown() throws IOException {
     Response<Product[]>response=productService.getProducts().execute();
     for (int i =0;i<response.body().length;i++) {
         Product p = response.body()[i];


         Response<ResponseBody> response1 = productService.deleteProduct(p.getId()).execute();

         assertThat(response1.isSuccessful(), CoreMatchers.is(true));
     }
}

}