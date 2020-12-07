package net.javaguides.springboot.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CoffeeShopUsers")

public class CoffeeShopUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "OrderCreatedDaateTime")
	private String OrderCreatedDateTime;
	
	@Column(name = "LastUpdatedTime")
	private String LastUpdatedDateTime;
	
	
	public CoffeeShopUser(String firstName, String lastName, String email, String address, String orderCreatedDateTime,
			String lastUpdatedDateTime) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		OrderCreatedDateTime = orderCreatedDateTime;
		LastUpdatedDateTime = lastUpdatedDateTime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrderCreatedDateTime() {
		return OrderCreatedDateTime;
	}
	public void setOrderCreatedDateTime(String orderCreatedDateTime) {
		OrderCreatedDateTime = orderCreatedDateTime;
	}
	public String getLastUpdatedDateTime() {
		return LastUpdatedDateTime;
	}
	public void setLastUpdatedDateTime(String lastUpdatedDateTime) {
		LastUpdatedDateTime = lastUpdatedDateTime;
	}

}
