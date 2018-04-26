package org.workspace;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class UseCalculatorController {

    RestTemplate restTemplate = new RestTemplate();
    final String url = "http://localhost:8080/api/add/{num1}/{num2}";
    Map<String, Integer> uriVariables = new HashMap<String,Integer>();
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/calladd/{num1}/{num2}", produces = "text/plain")
    @ApiOperation("Call add api")
    public String callAdd(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
    	uriVariables.put("num1", num1);
    	uriVariables.put("num2", num2);
    	System.out.println("........"+num1+num2);
    	System.out.println(url);
    	String body = restTemplate.getForObject(url, String.class, uriVariables);
    	System.out.println(body);
		return body;
    }
}
