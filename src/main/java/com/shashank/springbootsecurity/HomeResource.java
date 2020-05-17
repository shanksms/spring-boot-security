package com.shashank.springbootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

  @GetMapping("/")
  public String home() {

    return "Welcome";
  }

  @GetMapping("/User")
  public String helloUser() {
    return "Welcome user";
  }

  @GetMapping("/Admin")
  public String helloAdmin() {
    return "Welcome admin";
  }

}
