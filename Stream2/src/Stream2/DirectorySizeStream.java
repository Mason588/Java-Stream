package Stream2;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class DirectorySizeStream {

	public static void main(String[] args) {
		System.out.print("請輸入一個一個目錄或檔案:");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();
		
		//Display the size
		System.out.println(getSize(new File(directory)) + " bytes");
	}

	public static long getSize(File file) {
		if (file.isFile()) {
			return file.length();
		} else {
			try {
				return Files.list(file.toPath()).parallel().
						mapToLong(e -> getSize(e.toFile())).sum();
			} catch (Exception e) {
				return 0;
			}
		}
	}
}
