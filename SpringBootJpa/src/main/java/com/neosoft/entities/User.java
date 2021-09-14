package com.neosoft.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long uid;
	
	@NotNull(message="Insert First Name")
	@Size(min=3, message="First Name have atleast 3 Characters")
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@NotNull(message="Insert Last Name")
	@Size(min=3, message="Last Name have atleast 3 Characters")
	@Column(name="LASTNAME")
	private String lastname;
	
	@NotNull
    @Email
	@Column(name="EMAIL")
    private String email;
	
	@NotNull
	@Size(min=6,max=6)
	@Column(name="PINCODE")
	private String pincode;
	
	@Column(name="PHNO")
    private String phno;
	
	@Column(name="STATUS")
    private String status;
    
	@Temporal(TemporalType.DATE)
	@Column(name="DOB")
    private Date dob;
	
	@Temporal(TemporalType.DATE)
	@Column(name="JOININGDATE")
	private Date joiningdate;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	public User(Long uid,
			@NotNull(message = "Insert First Name") @Size(min = 3, message = "First Name have atleast 3 Characters") String firstname,
			@NotNull(message = "Insert Last Name") @Size(min = 3, message = "Last Name have atleast 3 Characters") String lastname,
			@NotNull @Email String email, @NotNull @Size(min = 6, max = 6) String pincode, String phno, String status,
			Date dob, Date joiningdate) {
		super();
		this.uid = uid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.pincode = pincode;
		this.phno = phno;
		this.status = status;
		this.dob = dob;
		this.joiningdate = joiningdate;
	}

	
	
}