package com.example.xebni;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointsController {

    @GetMapping("/")
    public String getIndex() {
          return "GET to index route";
    }
    @GetMapping("/tasks")
    public String getTasks() {
        return "These are tasks";
    }
    @PostMapping("/tasks")
    public String createTask() {
        return "You just POSTed to /tasks";
    }
    @GetMapping("math/pi")
    public String returnPI() {
        return String.valueOf(Math.PI) + "\n";
    }
}
