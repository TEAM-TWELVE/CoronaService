package dk.si.covid;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import dk.si.covid.model.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@SpringBootApplication

public class HotelCatalogApplication {

    public static void main(String[] args) throws FileNotFoundException {

        SpringApplication.run(HotelCatalogApplication.class, args);

    }

}
