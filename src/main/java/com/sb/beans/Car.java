package com.sb.beans;

public class Car {

	private String regNo;
	private String ownerName;
	private String color;
	private String type;
	private String engineCC;
	private String fueltype;
	private String makeCompnay;
	private String modelNmae;
	private String varient;
	
	
	private Car(String regNo, String ownerName, String color, String type, String engineCC, String fueltype,
			String makeCompnay, String modelNmae, String varient) {
		super();
		this.regNo = regNo;
		this.ownerName = ownerName;
		this.color = color;
		this.type = type;
		this.engineCC = engineCC;
		this.fueltype = fueltype;
		this.makeCompnay = makeCompnay;
		this.modelNmae = modelNmae;
		this.varient = varient;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", ownerName=" + ownerName + ", color=" + color + ", type=" + type
				+ ", engineCC=" + engineCC + ", fueltype=" + fueltype + ", makeCompnay=" + makeCompnay + ", modelNmae="
				+ modelNmae + ", varient=" + varient + "]";
	}
	
}
