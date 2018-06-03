package com.personal;

public  class TestProfile {
	public static void printProfile(IProfile profile1) {
		profile1.myBasicInfo();
		profile1.myHobbies();
		//profile2.myBasicInfo();
		//profile2.myHobbies();
	}
	public static void main(String[]args) {
		IProfile myProfile1 = new KaviProfile();
		//IProfile myProfile2 = new JayaProfile();
		printProfile(myProfile1);
		//printProfile(myProfile2);
	}
}
