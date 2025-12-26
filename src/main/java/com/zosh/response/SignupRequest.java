package com.zosh.response;

import lombok.Data;

@Data
public class SignupRequest {
    public String email;
    public String fullName;
    public String otp;
}
