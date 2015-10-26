package by.jum.internetbanking.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainPageController {

    private static Logger LOGGER = Logger.getLogger(MainPageController.class);

    @RequestMapping(value = "/error403", method = RequestMethod.POST)
    public String printError() {
        return "403";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String printUser() {
        LOGGER.info("user");
        return "user/user";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String printWelcome() {
        return "welcome";
    }

}
