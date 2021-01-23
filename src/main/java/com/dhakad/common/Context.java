package com.dhakad.common;

public class Context {

		private String sessionId;
		private boolean encryption;

		public Context(String sessionId, boolean encryption) {
				this.sessionId = sessionId;
				this.encryption = encryption;
		}
		public Context() {
		}

		public String getSessionId() {
				return sessionId;
		}

		public void setSessionId(String sessionId) {
				this.sessionId = sessionId;
		}

		public boolean isEncryption() {
				return encryption;
		}

		public void setEncryption(boolean encryption) {
				this.encryption = encryption;
		}

		@Override
		public String toString() {
				return "context [sessionId=" + sessionId + ", encryption=" + encryption + "]";
		}
}
