package com.zosh.controller;


import com.zosh.modal.User;
import com.zosh.repository.UserRepository;
import com.zosh.response.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
//@RestController("/auth")
public class AuthController {

    private final UserRepository userRepository;
    @PostMapping("/signup")
        public ResponseEntity<User> createUserHandler(@RequestBody SignupRequest req){
            User user = new User();
            user.setEmail(req.getEmail());
            user.setFullName(req.getFullName());

            User savedUser=userRepository.save(user);
            return ResponseEntity.ok(savedUser);
        }

}
