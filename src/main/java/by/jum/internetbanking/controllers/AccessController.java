package by.jum.internetbanking.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccessController {

    private final Logger LOGGER = Logger.getLogger(AccessController.class);

    @RequestMapping("/403error")
    public String page403() {
        LOGGER.warn("ACCESS DENIED");
        return "errors/403";
    }
}