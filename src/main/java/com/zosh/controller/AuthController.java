package com.zosh.controller;


import com.zosh.modal.User;
import com.zosh.response.SignupRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @PostMapping
        public ResponseEntity<User> createUserHandler(@RequestBody SignupRequest req){
            User user = new User();
            user.setEmail(req.getEmail());
            user.setFullName(req.getFullName());

            return ResponseEntity.ok(user);
        }

}
