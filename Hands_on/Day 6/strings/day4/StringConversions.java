package com.onebill.corejava.strings.day4;

public class StringConversions {

	public static void main(String[] args) {
		String str="onebill";
		//converting string to stringBuffer
		StringBuffer sbr=new StringBuffer(str);
		System.out.println(sbr);
		StringBuilder sbd=new StringBuilder(str);
		System.out.println(sbd);
		//converting sbr sbd to string
		String sbrString=sbr.toString();
		String sbdString=sbd.toString();
		
		//Converting StringBuffer to StringBuilder
		//First convert to string then convert
		StringBuilder to=new StringBuilder(sbrString);
		System.out.println(to);
		
	}

}
