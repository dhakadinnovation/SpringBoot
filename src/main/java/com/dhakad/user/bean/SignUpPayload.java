package com.dhakad.user.bean;


import com.dhakad.common.ResponsePayloadVo;

public class SignUpPayload extends ResponsePayloadVo {
    private String oAuthToken;
    private String message;
    private Boolean isVerified;

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    public SignUpPayload() {
        super();


	}

    public String getoAuthToken() {
        return oAuthToken;
    }

    public void setoAuthToken(String oAuthToken) {
        this.oAuthToken = oAuthToken;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
