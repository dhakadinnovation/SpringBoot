package com.dhakad.common;

public class DeviceParam {
		private String devId;
		private String imei;
		private String imsi;
		private String platform;
		private String os;
		private String model;
		private String fcmid;
		public DeviceParam() {
		}
		public DeviceParam(String devId, String imei, String imsi, String platform, String os, String model,
											 String fcmid) {
				this.devId = devId;
				this.imei = imei;
				this.imsi = imsi;
				this.platform = platform;
				this.os = os;
				this.model = model;
				this.fcmid = fcmid;
		}

		public String getFcmid() {
				return fcmid;
		}

		public void setFcmid(String fcmid) {
				this.fcmid = fcmid;
		}

		public String getDevId() {
				return devId;
		}

		public void setDevId(String devId) {
				this.devId = devId;
		}

		public String getImei() {
				return imei;
		}

		public void setImei(String imei) {
				this.imei = imei;
		}

		public String getImsi() {
				return imsi;
		}

		public void setImsi(String imsi) {
				this.imsi = imsi;
		}

		public String getPlatform() {
				return platform;
		}

		public void setPlatform(String platform) {
				this.platform = platform;
		}

		public String getOs() {
				return os;
		}

		public void setOs(String os) {
				this.os = os;
		}

		public String getModel() {
				return model;
		}

		public void setModel(String model) {
				this.model = model;
		}

		@Override
		public String toString() {
				return "DeviceParam [devId=" + devId + ", imei=" + imei + ", imsi=" + imsi + ", platform=" + platform + ", " +
								"os=" + os + ", model=" + model + "]";
		}

}
