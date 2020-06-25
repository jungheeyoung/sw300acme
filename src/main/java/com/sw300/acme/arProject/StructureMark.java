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
@Table(name="StructureMark")
public class StructureMark implements Serializable {
	public StructureMark() {
	}
	
	@Column(name="ID", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="ARM_STRUCTUREMARK_MARKERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ARM_STRUCTUREMARK_MARKERID_GENERATOR", strategy="native")	
	private long markerId;
	
	@Column(name="MarkerPath", nullable=true, length=255)	
	private String markerPath;
	
	private void setMarkerId(long value) {
		this.markerId = value;
	}
	
	public long getMarkerId() {
		return markerId;
	}
	
	public long getORMID() {
		return getMarkerId();
	}
	
	public void setMarkerPath(String value) {
		this.markerPath = value;
	}
	
	public String getMarkerPath() {
		return markerPath;
	}
	
	public String toString() {
		return String.valueOf(getMarkerId());
	}
	
}
