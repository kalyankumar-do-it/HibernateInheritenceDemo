package com.techjs.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity 
//@AttributeOverrides({  
//    @AttributeOverride(name="vehicleId", column=@Column(name="vehicleId")),  
//    @AttributeOverride(name="vehicleName", column=@Column(name="vehicleName"))  
//})
@PrimaryKeyJoinColumn(name="vehicle_id")  
public class TwoWheeler extends Vehicle {
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

}
