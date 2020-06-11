package com.energytrade.app.dto;

public class DRDeviceDto extends AbstractBaseDto {

	private int drDeviceId;
	private String drDeviceName;
	private double deviceCapacity;
	private String portNumber;
	private String kiotDeviceId;
	private String deviceName;
	private String customData;
	private String usedFlag;

	public String getKiotDeviceId() {
		return kiotDeviceId;
	}

	public void setKiotDeviceId(String kiotDeviceId) {
		this.kiotDeviceId = kiotDeviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getCustomData() {
		return customData;
	}

	public void setCustomData(String customData) {
		this.customData = customData;
	}

	public String getUsedFlag() {
		return usedFlag;
	}

	public void setUsedFlag(String usedFlag) {
		this.usedFlag = usedFlag;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public int getDrDeviceId() {
		return drDeviceId;
	}

	public void setDrDeviceId(int drDeviceId) {
		this.drDeviceId = drDeviceId;
	}

	public String getDrDeviceName() {
		return drDeviceName;
	}

	public void setDrDeviceName(String drDeviceName) {
		this.drDeviceName = drDeviceName;
	}

	public double getDeviceCapacity() {
		return deviceCapacity;
	}

	public void setDeviceCapacity(double deviceCapacity) {
		this.deviceCapacity = deviceCapacity;
	}

}
