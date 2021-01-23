package com.dhakad.user.bean;


import com.dhakad.common.Context;
import com.dhakad.common.ResponsePayloadVo;

public class SignUpResp {

		private Context context;
		private ResponsePayloadVo payload;

		public SignUpResp() {
				super();
		}

		protected SignUpResp(ResponsePayloadVo payload) {
				super();
				this.payload = payload;
		}

		public Context getContext() {
				return context;
		}

		public void setContext(Context context) {
				this.context = context;
		}

		@Override
		public String toString() {
				return "ResponseVo [context=" + context + ", payload=" + payload + "]";
		}

		public ResponsePayloadVo getPayload() {
				return payload;
		}

		public void setPayload(ResponsePayloadVo payload) {
				this.payload = payload;
		}
}

