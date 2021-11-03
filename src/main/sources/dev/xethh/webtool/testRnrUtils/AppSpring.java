package dev.xethh.webtool.testRnrUtils;

import me.xethh.utils.dateUtils.formatBuilder.DateFormatBuilderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Date;

/**
 * Application spring
 */
@SpringBootApplication
@EnableWebMvc
public class AppSpring {
    private final static Logger logger;
    static {
        App.systemInit();
        logger = LoggerFactory.getLogger(AppSpring.class);
        logger.info("App start up: "+ DateFormatBuilderFactory.ISO8601().format(new Date()));
    }

    public static void main(String[] args) {
        SpringApplication.run(AppSpring.class, args);
    }
}