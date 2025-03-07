package org.example.maskingfieldsofapiresponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
   @GetMapping("/user")
    public UserDetails getUserDetails(){
     return    userService.getUserDetails();
    }
}
