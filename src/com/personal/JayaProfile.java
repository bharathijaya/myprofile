package com.personal;

public class JayaProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"jaya");
		System.out.println( ProfileConstant.LAST_NAME+"bharathi");
		System.out.println("Age : 20");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("My hobby is reading books.");
		
	}
	
	

}
