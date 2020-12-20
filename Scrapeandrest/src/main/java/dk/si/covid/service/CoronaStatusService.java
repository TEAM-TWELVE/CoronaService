package dk.si.covid.service;

import java.io.*;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import dk.si.covid.model.Country;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


@Service
public class CoronaStatusService {

    private final Logger logger = Logger.getLogger(CoronaStatusService.class);


    public String findStatusByCountry(String country) throws Exception {
        logger.info("/ GET findByCountry called.");
        String color = "blue";
        try {
            InputStream stream = new FileInputStream("src/main/resources/data.json");
            JsonReader reader = new JsonReader(new InputStreamReader(stream, "UTF-8"));
            Gson gson = new Gson();
            // Read file in stream mode
            reader.beginArray();
            while (reader.hasNext())
            {
                Country c = gson.fromJson(reader, Country.class);
                if (c.getCountry().equalsIgnoreCase(country))
                    color = c.getColor();
             }
            reader.endArray();
            reader.close();

            } catch (UnsupportedEncodingException ex) {

            } catch (IOException ex) {

            }
        return color;
    }


    }