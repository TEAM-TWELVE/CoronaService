package dk.si.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;

@SpringBootApplication

public class CoronsStatusApplication {

    public static void main(String[] args) throws FileNotFoundException {

        SpringApplication.run(CoronsStatusApplication.class, args);

    }

}
