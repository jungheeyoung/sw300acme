/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Naviworks9
 * License Type: Purchased
 */
package com.sw300.acme.arProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Area")
public class Area implements Serializable {
	public Area() {
	}
	
	@Column(name="areaID", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="AREA_AREAID_GENERATOR")
	@org.hibernate.annotations.GenericGenerator(name="ARM_AREA_AREAID_GENERATOR", strategy="native")
	private long areaID;

	@Column(name="AreaName", nullable=true, length=255)
	private String areaName;

	@Column(name="AreaCount", nullable=false, length=10)
	private int areaCount;

	@Column(name="AreaInfo", nullable=true, length=255)
	private String areaInfo;

	@OneToMany(mappedBy="area", targetEntity=StructureMap.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private List<StructureMap> structureMap = new ArrayList<>();

	private void setAreaID(long value) {
		this.areaID = value;
	}
	
	public long getAreaID() {
		return areaID;
	}
	
	public long getORMID() {
		return getAreaID();
	}
	
	public void setAreaName(String value) {
		this.areaName = value;
	}
	
	public String getAreaName() {
		return areaName;
	}

	public void setAreaCount(int value) {
		this.areaCount = value;
	}

	public int getAreaCount() {
		return areaCount;
	}

	public void setAreaInfo(String value) {
		this.areaInfo = value;
	}

	public String getAreaInfo() {
		return areaInfo;
	}
	public void setStructureMap(List<StructureMap> value) {
		this.structureMap = value;
	}
	
	public List<StructureMap> getStructureMap() {
		return structureMap;
	}
	
	
	public String toString() {
		return String.valueOf(getAreaID());
	}
	
}
