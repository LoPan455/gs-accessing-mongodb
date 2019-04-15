package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(Application.class);
    logger.info("Application is starting");
    SpringApplication.run(Application.class, args);
    logger.info("Application has successfully started");

  }
}