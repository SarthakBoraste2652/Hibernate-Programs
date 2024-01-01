package org.tnsif.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eId;
	private String eName;
	//applied eager loading---> already fetched the result and when asked given the result
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "projects", joinColumns = {@JoinColumn(name="eid")}, inverseJoinColumns = {@JoinColumn(name="pid")})
	private List<Project> projects;
	
	public Employee() {
		super();
	}
	
	public Employee(int eId, String eName, List<Project> projects) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.setProjects(projects);
	}



	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", projects=" + projects + "]";
	}
}
