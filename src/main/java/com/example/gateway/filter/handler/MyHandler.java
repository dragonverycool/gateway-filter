package com.example.gateway.filter.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MyHandler {

    @GetMapping("/hello")
    public Mono<ResponseEntity> hello() {
        return Mono.just((new ResponseEntity<>("hello world.", HttpStatus.OK)));
    }

    @GetMapping("/hi")
    public Mono<ResponseEntity> world() {
        return Mono.just((new ResponseEntity<>("hi, world.", HttpStatus.OK)));
    }
}
