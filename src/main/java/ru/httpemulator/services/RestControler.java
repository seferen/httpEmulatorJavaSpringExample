package ru.httpemulator.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
public class RestControler {
    Logger log = LoggerFactory.getLogger(RestControler.class);

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String groups() {
        log.info("GET /test");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "OK";
    }
}
