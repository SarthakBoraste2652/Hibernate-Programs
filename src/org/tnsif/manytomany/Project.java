package org.tnsif.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pId;
	private String pName;
	@ManyToMany
	private List<Employee> emps;
	
	public Project() {
		super();
	}
	
	public Project(int pId, String pName, List<Employee> emps) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.emps = emps;
	}

	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", emps=" + emps + "]";
	}

}
