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
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="StructureMap")
public class StructureMap implements Serializable {
	public StructureMap() {
	}
	
	@Column(name="StructureId", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="ARM_STRUCTUREMAP_STRUCTUREID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ARM_STRUCTUREMAP_STRUCTUREID_GENERATOR", strategy="native")	
	private long structureId;
	
	@ManyToOne(targetEntity=Area.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AreaareaID", referencedColumnName="areaID", nullable=false) }, foreignKey=@ForeignKey(name="FKStructureM970452"))	
	private Area area;
	
	@Column(name="Lat", nullable=false, length=10)	
	private double lat;
	
	@Column(name="Lng", nullable=false, length=10)	
	private double lng;
	
	private void setStructureId(long value) {
		this.structureId = value;
	}
	
	public long getStructureId() {
		return structureId;
	}
	
	public long getORMID() {
		return getStructureId();
	}
	
	public void setLat(double value) {
		this.lat = value;
	}
	
	public double getLat() {
		return lat;
	}
	
	public void setLng(double value) {
		this.lng = value;
	}
	
	public double getLng() {
		return lng;
	}
	
	public void setArea(Area value) {
		this.area = value;
	}
	
	public Area getArea() {
		return area;
	}
	
	public String toString() {
		return String.valueOf(getStructureId());
	}
	
}
