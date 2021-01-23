package com.dhakad.user.bean;

import com.dhakad.common.ResponseVo;

public class CustomerLoginResVo extends ResponseVo {

		private CustomerLoginResPayload payload;
		private Boolean isVerified;

		public Boolean getVerified() {
				return isVerified;
		}

		public void setVerified(Boolean verified) {
				isVerified = verified;
		}

		public CustomerLoginResPayload getPayload() {
				return payload;
		}

		public void setPayload(CustomerLoginResPayload payload) {
				this.payload = payload;
		}

}
