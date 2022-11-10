package com.keminapera.springcloud.ribbon;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author KeminaPera
 */
@RestController
public class OrderController {

    /*@Resource
    private RestTemplate restTemplate;*/

    @GetMapping("/get/{userId}")
    public ResponseEntity<String> order(@PathVariable("userId") String userId) {
        //restTemplate.getForObject("http://service-name", String.class, userId);
        return ResponseEntity.ok("成功！！！");
    }
}
