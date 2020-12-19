package dk.si.covid.controller;

import dk.si.covid.service.CoronaStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.log4j.Logger;

@RestController
@RequestMapping("/coronastatus")
public class CoronaStatusController {

    private final Logger logger = Logger.getLogger(CoronaStatusController.class);

    @Autowired
    private CoronaStatusService coronaStatusService;

    @GetMapping("/{country}")
    public String getCountryStatus(@PathVariable String country) throws Exception {
        logger.info("### GET getCountryStatus called");
        String statusColor = coronaStatusService.findStatusByCountry(country);
        if (statusColor.equalsIgnoreCase("blue"))
            logger.info("### GET getCountryStatus had a problem finding the status");
        return statusColor;
    }
}
