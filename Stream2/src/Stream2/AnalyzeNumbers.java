package Stream2;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class AnalyzeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numberof the items");
		
		int count = input.nextInt();
		
		double[] array = new double[count];
		System.out.println("Enter number:");
		for(int i=0;i<count;i++) {
			array[i] = input.nextDouble();
		}
		
		double avg = DoubleStream.of(array).average().getAsDouble();
		
		System.out.println("Average is:" + avg);
		
		System.out.println("numbersabove average is:" + DoubleStream.of(array).filter(e->e>avg).count());
	}

}
