package StreamPra;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streampra {

	public static void main(String[] args) {
		String names[] = {"Jack","Joseph","Mike", "Billy", "Sammy", "Windy","pi"};
		
		System.out.println(Stream.of(names).anyMatch(e-> e.equals("Sammy"))); 
		System.out.println();
		System.out.println(Stream.of(names).allMatch(e -> Character.isUpperCase(e.charAt(0))));
		
		System.out.println();
		System.out.println(Stream.of(names).noneMatch(e -> e.startsWith("kwai")));
		
		System.out.println();
		System.out.println(Stream.of(names).map(e -> e.toUpperCase()).distinct().count());
		
		//¤p¼g
		System.out.println();
		Object[] namearray = Stream.of(names).map(String::toLowerCase).toArray();
		System.out.println(Arrays.toString(namearray));
	}

}
