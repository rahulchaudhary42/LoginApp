package com.bridgelabz.model;

//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class User 
{
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String mobileNo;
	private String email;

	public User() 
	{
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getMobileNo() 
	{
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) 
	{
		this.mobileNo = mobileNo;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
    {
		this.email = email;
	}

}