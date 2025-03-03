package lk.ijse.logmanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String getLog() {
        String message = "Hello";

        logger.info("{} : This is INFO log message!", message);
        logger.warn("{} : This is WARN log message!", message);
        logger.error("{} : This is ERROR log message!", message);
        logger.debug("{} : This is DEBUG log message!", message);
        logger.trace("{} : This is TRACE log message!", message);

        try {
            throw new Exception("This is an exception!");
        } catch (Exception e) {
            logger.error("Exception occurred!", e);
        }

        return "Log Message Generated!";
    }
}