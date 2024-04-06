package org.tahsan.spring.restapi.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	public void setId(long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;

	@Column(name = "age")
	private int age;

	@Column(name = "active")
	private boolean active;

	public Customer() {
	}

	public Customer(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.active = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", active=" + active
				+ "]";
	}

}
