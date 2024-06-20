package org.example.maskingfieldsofapiresponse;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserDetails getUserDetails() {
     UserDetails userDetails = new UserDetails();
     userDetails.setUserName("Aman");
     userDetails.setUserEmail("Aman@example.com");
     userDetails.setContactNo("123456789");
     return userDetails;
    }


}
