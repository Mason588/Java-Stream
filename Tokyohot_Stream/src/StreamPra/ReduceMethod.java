package StreamPra;

import java.util.stream.IntStream;
import java.util.stream.*;

public class ReduceMethod {

	public static void main(String[] args) {
		int [] values = {3,4,1,5,20,1,3,3,4,6};
		
		System.out.print("The value are ");
		IntStream.of(values).forEach(e ->System.out.print(e+" "));
		
		System.out.println("­¼¿n¬O "+IntStream.of(values).parallel().reduce(1, (e1, e2)-> e1*e2));
		

		String [] names = {"John","Peter", "Dog","Micky"};
		System.out.println("\nThe name are: ");
		System.out.println(Stream.of(names).reduce((x, y) -> x+", " +y).get());
		System.out.println("\nThe length are: ");
		System.out.println(Stream.of(names).reduce((x, y) -> x+", " +y).get().length());
		
		
	}

}
