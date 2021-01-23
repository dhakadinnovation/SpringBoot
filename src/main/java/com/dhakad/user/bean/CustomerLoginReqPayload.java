package com.dhakad.user.bean;


import com.dhakad.common.DeviceParam;
import com.dhakad.common.RequestPayloadVo;

public class CustomerLoginReqPayload extends RequestPayloadVo {
		private DeviceParam deviceParam;
		private String email;
		private String passowrd;

		public DeviceParam getDeviceParam() {
				return deviceParam;
		}

		public void setDeviceParam(DeviceParam deviceParam) {
				this.deviceParam = deviceParam;
		}

		public String getEmail() {
				return email;
		}

		public void setEmail(String email) {
				this.email = email;
		}

		public String getPassowrd() {
				return passowrd;
		}

		public void setPassowrd(String passowrd) {
				this.passowrd = passowrd;
		}

		@Override
		public String toString() {
				return "UserLoginReqPayload [deviceParam=" + deviceParam + ", email=" + email + ", passowrd=" + passowrd + "]";
		}
}
