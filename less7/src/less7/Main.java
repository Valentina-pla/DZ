
package less7;

import com.fasterxml.jackson.core.JsonProcessingException;
import okhttp3.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws IOException, SQLException {




    try {
        WeatherRecord rec=new WeatherRecord();
        rec.localDate="25.03";
        rec.temperature=-2;
        rec.city="Saint P";
        rec.weatherText="cloud";
        WeatherRepo weatherRepo=new WeatherRepo();
        weatherRepo.readWeather();
        weatherRepo.addWeather(rec);

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
    } catch (JsonProcessingException | SQLException e){throw e;}









    }
}
