package com.dhakad.common;

public class SalonResp extends ResponsePayloadVo {
    private String oAuthToken;
    private Object apiResp;
    private Boolean isVerified;

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    public SalonResp() {
        super();


	}

    public Object getApiResp() {
        return apiResp;
    }

    public void setApiResp(Object apiResp) {
        this.apiResp = apiResp;
    }

}
