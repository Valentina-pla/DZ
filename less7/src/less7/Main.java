package less7;

import com.fasterxml.jackson.core.JsonProcessingException;
import okhttp3.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.concurrent.TimeUnit;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Main {

    public static void main(String[] args) throws IOException{
    try {
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();


        Request request = new Request.Builder()
                .url(" https://api.openweathermap.org/data/2.5/forecast?lat=59.9339&lon=30.3061&appid=5681e51afb5d788b294ff44dcd10c36f")
                .get()
                .build();

        Response responseWithToken = client.newCall(request).execute();

        String responseBody = responseWithToken.body().string();

        WeatherList weather = new WeatherResponse().showResult(responseBody);



        WeatherPrinter weatherPrinter=new WeatherPrinter();
        weatherPrinter.print(weather);
    } catch (JsonProcessingException e){}









    }
}
