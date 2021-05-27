package com.onebill.corejava.exception;

public class FinallyDemo2 {
	static void generateException(int what) {
		int[] nums=new int[1];
		try {
			switch (what) {
			case 0:
				int ans=10/what;
				break;
			case 1:
				nums[2]=29;
				break;
			default:
				System.out.println("Excuted every time");
				break;
			}
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic execp");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array over");
		}finally {
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			generateException(i);
		}
	}

}
