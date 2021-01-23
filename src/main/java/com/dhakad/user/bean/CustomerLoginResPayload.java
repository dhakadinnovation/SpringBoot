package com.dhakad.user.bean;


import com.dhakad.common.ResponsePayloadVo;
import com.dhakad.user.model.User;

public class CustomerLoginResPayload extends ResponsePayloadVo {

    private String oAuthToken;
    private User user;

    public User getUserParam() {
        return user;
    }

    public void setUserParam(User user) {
        this.user = user;
    }

    public String getoAuthToken() {
        return oAuthToken;
    }

    public void setoAuthToken(String oAuthToken) {
        this.oAuthToken = oAuthToken;
    }

}
