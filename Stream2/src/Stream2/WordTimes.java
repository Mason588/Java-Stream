package Stream2;

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordTimes {

	public static void main(String[] args) {
	  String text = "Good morning. Have a good class. "
			  + "Have a good visit. Have fun!";
	  
	  Stream.of(text.split( "[\\s+\\p{Punct}]")).parallel().
	  filter(e->e.length()>0).collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new,
			  Collectors.counting())).forEach((k,v)-> System.out.println(k + " : " + v));
	}

}
