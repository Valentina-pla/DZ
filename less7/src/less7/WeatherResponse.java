package less7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;




public class WeatherResponse  {

    public WeatherList showResult(String responseBody) throws JsonProcessingException {


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                false);
        try {
            WeatherList weather = objectMapper.readValue(responseBody, WeatherList.class);
            return weather;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw e;
        }

    }







}
