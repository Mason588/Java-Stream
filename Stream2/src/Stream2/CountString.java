package Stream2;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�r��:");
		String s = input.nextLine();
		
		System.out.println("�C�Ӧr��X�{���ƬO:");
		
		Stream.of(toCharacterArray(s.toCharArray())).filter(e->Character.isLetter(e)).
		map(e-> Character.toUpperCase(e)).collect(Collectors.groupingBy(e ->e, TreeMap::new, Collectors.counting())).
		forEach((k,v)-> {
			System.out.print(k+":" + v + " ");
		});
	}
	
	
	public static Character[] toCharacterArray(char[] list) {
		Character[] result = new Character[list.length];
		for(int i = 0; i<result.length; i++) {
			result[i] = list[i];
		}
		return result;
	}

}

