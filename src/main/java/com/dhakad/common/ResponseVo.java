package com.dhakad.common;

public class ResponseVo {

		private Context context;
		private ResponsePayloadVo payload;

		public ResponseVo() {
				super();
		}

		protected ResponseVo(ResponsePayloadVo payload) {
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

