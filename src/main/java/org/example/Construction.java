package org.example;
import java.util.Scanner;

public class Construction {
	private final double INTEREST = 0.2;
	private int standard = 0;
	private int area;
	private int duration = 0;
	
	public Construction() {
		this.standard = 0;
		this.area = 0;
		this.duration = 30*6;
	}
	public void takeInput() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("select material standard");
			System.out.println("1. 1200INR if we use standard materials\n" +
					" 2.  1500INR if we use above standard materials\n" +
					 "3. 1800INR if customers needs high standard material\n");
			System.out.println("choose your option: ");
			int choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
				standard = 1200;
			    break;
			case 2:
				standard = 1500;
				break;
			case 3:
				standard = 1800;
				break;
			}
			System.out.println("do you want a fully automated?(yes or no)\n");
			if(scanner.nextLine().trim().equalsIgnoreCase("yes")) {
				standard = 2800;
			}
			System.out.println("enter the total area of the house(Sq. ft) ");
			this.area = scanner.nextInt();
		}
	}
	private double simpleInterest() {
		return (area*standard)*duration*INTEREST;
	}
	private double compoundInterest() {
		return (area*standard)*(Math.pow(1+INTEREST/100 ,duration));
	}
	public void calculateAndDisplayTotalCost()
	{
		System.out.println("total cost after simple and compound Interest " + ((area*standard)+simpleInterest() + compoundInterest()));
		
	}
}
    	


