package Stream2;

import java.util.Random;
import java.util.TreeMap;
import java.util.stream.*;
public class RandomChar {

	private static int count = 0;
	public static void main(String[] args) {
		Random random = new Random();
		Object[] chars = random.ints(100,'a', (int) 'z'+1).mapToObj(e-> (char) e).toArray();
		
		System.out.println("The lowercase letters are :");
		Stream.of(chars).forEach(e->{
			System.out.print(e + (++count %20 ==0 ? "\n":" "));
		});
		
		System.out.println("\n The occurences of each letter are: ");
		
		Stream.of(chars).collect(Collectors.groupingBy(e->e ,TreeMap::new, Collectors.counting())).forEach((k,v)
        	-> {System.out.print(v +":" +k+ " ");
		});
	}

}
