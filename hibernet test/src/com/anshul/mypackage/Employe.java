package com.anshul.mypackage;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employe {
	@Id
	private int id;
	private String f_name,l_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String name) {
		this.f_name = name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + "]";
	}
	

}
