package com.dhakad.common;

public class ResponsePayloadVo {


		private String responseCode;
		private String responseMessage;

		public ResponsePayloadVo() {
				super();
				// TODO Auto-generated constructor stub
		}
		public ResponsePayloadVo(String responseCode, String responseMessage) {
				super();
				this.responseCode = responseCode;
				this.responseMessage = responseMessage;
		}

		public String getResponseCode() {
				return responseCode;
		}

		public void setResponseCode(String responseCode) {
				this.responseCode = responseCode;
		}

		public String getResponseMessage() {
				return responseMessage;
		}

		public void setResponseMessage(String responseMessage) {
				this.responseMessage = responseMessage;
		}

		@Override
		public String toString() {
				return "ResponsePayloadVo{" + "responseCode='" + responseCode + '\'' + ", responseMessage='" + responseMessage + '\'' + '}';
		}
}
