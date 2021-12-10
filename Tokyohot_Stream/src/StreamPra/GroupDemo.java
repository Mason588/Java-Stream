package StreamPra;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupDemo {

	public static void main(String[] args) {
		String [] names = {"John","Peter", "Dog","Micky","Peter"};
		Map<String,Long> map1 = Stream.of(names).map(e ->e.toUpperCase()).collect(
				Collectors.groupingBy(e->e, Collectors.counting()));
		System.out.println(map1);

	}

}
