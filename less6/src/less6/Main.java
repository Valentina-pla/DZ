package less6;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class Main {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();



        Request request=new Request.Builder()
                .url(" https://api.openweathermap.org/data/2.5/forecast?lat=59.9339&lon=30.3061&appid=5681e51afb5d788b294ff44dcd10c36f")
               .get()
                .build();

        Response responseWithToken=client.newCall(request).execute();

        String responseBody=responseWithToken.body().string();

        System.out.println(responseBody);






    }
}
