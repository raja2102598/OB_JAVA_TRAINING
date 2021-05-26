package com.onebill.corejava.nestedclasses.day3;

class CPU {
	class Processor {
		String name;
		String clockspeed;

		public Processor() {
			this.name = "Intel I5";
			this.clockspeed = "4.2 GHZ";
		}

		void displayProcessor() {
			System.out.println("Name : " + name + "\nClock Speed : " + clockspeed);
		}
	}

	class RAM {
		int size;
		String type;

		public RAM() {
			// TODO Auto-generated constructor stub
			this.size = 8;
			this.type = "some type";

		}

		void showRAM() {
			System.out.println("Size of Ram :" + size + " GB\nType : " + type);
		}
	}
}

public class CPUMain {

	public static void main(String[] args) {
		CPU.Processor obj = new CPU().new Processor();
		obj.displayProcessor();
		CPU.RAM ob1 = new CPU().new RAM();
		ob1.showRAM();

	}

}
