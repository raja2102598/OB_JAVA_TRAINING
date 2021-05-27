package com.onebill.corejava.exception;

class ThrowsImplement {
	int division(int den,int num) throws ArithmeticException {
		int quo=num/den;
		System.out.println(quo);
		return quo;
	}
}
public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsImplement obj=new ThrowsImplement();
		try {
			obj.division(0, 20);
		}catch(ArithmeticException e){
			System.out.println("Divide By zero");
		}
	}

}
