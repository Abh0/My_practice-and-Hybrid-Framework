package javaPractice;

import java.util.Scanner;

public class If_else_stmt {

	public static void main(String[] args) {
		int score;
		char grade;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your numeric test score:");
		score= console.nextInt();
		if (score >= 90) {
			grade='A';}
		else if (score >= 80) {
			grade = 'B';}
		else if (score >= 70) {
			grade = 'C';}
		else if (score >= 50) {
			grade = 'D';}
		else {
			grade = 'F';}
			System.out.println("Your grade is " + grade);
			
			
		}

	

}
