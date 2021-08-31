package map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="info")
public class Info {
	@Id
	@Column(name="id")
	private int id;
	private String name,lname,email;
	@JoinColumn(name="add_id")
	@OneToOne
	private Address add_id;
	@OneToOne
	private Student roll;
	public Student getRoll() {
		return roll;
	}

	public void setRoll(Student roll) {
		this.roll = roll;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Address add_id) {
		this.add_id = add_id;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", name=" + name + ", lname=" + lname + ", email=" + email + ", add_id=" + add_id
				+ ", roll=" + roll + "]";
	}
	
}
