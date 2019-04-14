package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class GreetingController {

  @RequestMapping("/")
  public String index() {
    return "You have reached the Greeting Controller";
  }

}
