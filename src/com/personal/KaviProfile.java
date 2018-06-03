package com.personal;

public class KaviProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"kavi");
		System.out.println(ProfileConstant.LAST_NAME+"preethi");
		System.out.println("age:20");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("Eating");
		
	}

}
