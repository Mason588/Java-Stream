package StreamPra;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class CollectMethod {

	public static void main(String[] args) {
		String [] names = {"John","Peter", "Dog","Micky","Peter"};
		System.out.println("The length are: "+
		 Stream.of(names).collect(StringBuilder::new,
				 StringBuilder::append, StringBuilder::append).length());
		//ArrayList
		List<String> list = Stream.of(names).collect(ArrayList::new,
				ArrayList::add, ArrayList::addAll);
		System.out.println(list);
		
		List<String> list2 = Stream.of(names).collect(Collectors.toList());
		System.out.println(list2);
		
		Set<String> set = Stream.of(names).map(e -> e.toUpperCase()).collect(Collectors.toSet());
		System.out.println(set);
		
		System.out.println("The total number of character is " + Stream.of(names).
				collect(Collectors.summarizingInt(e ->e.length())));
		
		IntSummaryStatistics stat = Stream.of(names).
				collect(Collectors.summarizingInt(e->e.length()));
		System.out.println("Max is " +stat.getMax());
		System.out.println("Min is " +stat.getMin());
		System.out.println("Average is " +stat.getAverage());
	}

}
