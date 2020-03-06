package com.yessInfoTech.StringDemos;

public class CheckImmutablity {

	public static void main(String[] args) {

		String s = "Yess Infotech";
		s.concat(" , Hadapsar ,Pune");
		System.out.println(s);

		String s2 = s.concat(" , Hadapsar ,Pune");

		System.out.println(s2);
		
		
		//  different methods of String class
		
		
		String s3= s2.concat("mmmm");
		System.out.println(s3);
		System.out.println(s2.charAt(0));
		System.out.println(s2.startsWith("Y"));
		System.out.println(s2.length());
		System.out.println(s.equalsIgnoreCase("Yess InfotecH"));
		System.out.println(s2.indexOf("z"));
		System.out.println(s2.isEmpty());
		System.out.println(s.intern());
		System.out.println("sfsdf:"+s2.toCharArray());
		System.out.println(s2.hashCode());
		System.out.println(s2.replace("Y", "Z"));
		System.out.println(s2.toUpperCase());
		
		
		
		

	}

}
