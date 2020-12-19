package dk.si.covid.service;

import dk.si.covid.model.Country;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CoronaStatusServiceTest {
    private static CoronaStatusService coronaStatusService;
    private static Country country;

    @BeforeAll
    private static void setup(){
        coronaStatusService = new CoronaStatusService();
    }

    @Test
    public void stringUtilityMustNotBeNull(){
        assertNotNull(coronaStatusService);
    }



    @Test
    public void testJson() throws Exception {

        String result = coronaStatusService.findStatusByCountry("Serbia");
        assertTrue(
                result.equalsIgnoreCase("green") ||
                result.equalsIgnoreCase("red") ||
                result.equalsIgnoreCase("yellow"));
    }



}
