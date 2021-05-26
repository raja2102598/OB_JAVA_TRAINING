package com.onebill.corejava.basics.assignments.day2;

import java.util.Scanner;

public class SyntaxSwitch {

	public static void main(String[] args) {
		int choiceSyntax;
		int choiceSelection;
		int choiceIteration;
		int choiceJump;
		Scanner s = new Scanner(System.in);
		System.out
				.println("Program Control Structures Syntax \n1.Selction \n2.Iteration \n3.Jump\nEnter Your Choice : ");
		choiceSyntax = s.nextInt();
		switch (choiceSyntax) {
		case 1:
			System.out.println("\nSelection \n1.If\n2.If-Else\n3.Nested If\n4.Switch\nEnter Your Choice :");
			choiceSelection = s.nextInt();
			switch (choiceSelection) {
			case 1:
				System.out.println("if (condition) {\n//logics\n....\n}");
				break;

			case 2:
				System.out.println("if (condition) {\n//logics\n.....\n} else if (condition){\n//logics\n....\n} ");
				break;
			case 3:
				System.out.println(
						"if (condition) {\n\tif (condition) {\n\t//logics\n\t....\n\t}\n} else if (condition){\n//logics\\n....\\n}");
				break;
			case 4:
				System.out.println(
						"switch (choice) {\ncase 1:\n\t//logics\n\tbreak;\n......\n.........\ndefault://logics....\n}");
				break;
			default:
				System.out.println("Enter Correct Choice!!!");
				break;
			}
			break;
		case 2:
			System.out.println("\nIteration \n1.For\n2.While\n3.Do-While\nEnter Your Choice: ");
			choiceIteration = s.nextInt();
			switch (choiceIteration) {
			case 1:
				System.out
						.println("for(initialize variables;condition;increment/decrement){\n\t//logics\n\t.......\n}");
				break;
			case 2:
				System.out.println("while(condition){\n\tlogics\n\t......\n}");
				break;
			case 3:
				System.out.println("do{\n\t//logics\n}while(condition)");
				break;
			default:
				System.out.println("Enter Correct Choice!!!");
				break;
			}
			break;
		case 3:
			System.out.println("\nJump \n1.Break\n2.Continue\n3.Return\nEnter Your Choice: ");
			choiceJump = s.nextInt();
			switch (choiceJump) {
			case 1:
				System.out.println("while(condition){\n\t break;\n}");
				break;
			case 2:
				System.out.println("if(condition)\n\tcontinue");
				break;
			case 3:
				System.out.println("accessmodifier returntype functionname(params){\n\t//logics\n\treturn value;\n}");
				break;
			default:
				System.out.println("Enter Correct Choice!!!");
				break;
			}
			break;
		}

	}
}
