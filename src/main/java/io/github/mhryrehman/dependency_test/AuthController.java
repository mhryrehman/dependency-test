package io.github.mhryrehman.dependency_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/")
    public String launchLeap() {
    	return "welcome to dependency test app";
    }

    
}

