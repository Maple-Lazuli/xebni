package com.example.xebni;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class QuerystringController {

    @GetMapping("/math/calculate")
    public String getMapParams(@RequestParam HashMap<String, String> querystring){
        if(querystring.get("operation").contains("add")) {
            return String.format("%s + %s = %d \n", querystring.get("x"), querystring.get("y"), Integer.valueOf(querystring.get("x")) + Integer.valueOf(querystring.get("y")));
        }
        else  if(querystring.get("operation").contains("subtract")) {
            return String.format("%s - %s = %d\n", querystring.get("x"), querystring.get("y"), Integer.valueOf(querystring.get("x")) - Integer.valueOf(querystring.get("y")));
        }
        else if(querystring.get("operation").contains("multiply")) {
            return String.format("%s * %s = %d\n", querystring.get("x"), querystring.get("y"), Integer.valueOf(querystring.get("x")) * Integer.valueOf(querystring.get("y")));
        }
        else if(querystring.get("operation").contains("divide")) {
            return String.format("%s / %s = %d\n", querystring.get("x"), querystring.get("y"), Integer.valueOf(querystring.get("x")) / Integer.valueOf(querystring.get("y")));
        }
        return "Invalid Query String \n";
    }
}