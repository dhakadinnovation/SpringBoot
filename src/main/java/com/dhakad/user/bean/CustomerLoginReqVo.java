package com.dhakad.user.bean;


import com.dhakad.common.RequestVo;

public class CustomerLoginReqVo extends RequestVo {

		private CustomerLoginReqPayload payload;

		public CustomerLoginReqPayload getPayload() {
				return payload;
		}

		public void setPayload(CustomerLoginReqPayload payload) {
				this.payload = payload;
		}

		@Override
		public String toString() {
				return "UserLoginReqVo [payload=" + payload + "]";
		}

}
