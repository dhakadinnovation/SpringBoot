package com.dhakad.common;

public class RequestVo {


		private Context context;
		private Object payload;

		protected RequestVo() {
				super();
		}

		public Context getContext() {
				return context;
		}

		public void setContext(Context context) {
				this.context = context;
		}

		public Object getPayload() {
				return payload;
		}

		public void setPayload(Object payload) {
				this.payload = payload;
		}

		@Override
		public String toString() {
				return "RequestVo{" + "context=" + context + ", payload=" + payload + '}';
		}
}
