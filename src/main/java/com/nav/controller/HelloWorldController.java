package com.nav.controller;

import com.nav.domain.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.nav.constants.Constants.APP_URL;

@RestController
@RequestMapping(APP_URL)
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<String> getHelloWorld() {
        return new ResponseEntity("hello-world /GET success", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Response> putHelloWorld() {
        return new ResponseEntity(Response.DummyResponse(), HttpStatus.CREATED);
    }

}
