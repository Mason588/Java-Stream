package StreamPra;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class NumberStream {

	public static void main(String[] args) {
		int [] values = {3,4,1,5,20,1,3,3,4,6};
		System.out.println(IntStream.of(values).distinct().filter(e-> e>3 && e %2 ==0).average().getAsDouble());
		System.out.println("sum is " +IntStream.of(values).limit(5).sum());
		
		//��o�έp��
		IntSummaryStatistics stats =IntStream.of(values).summaryStatistics();
		System.out.println("�̤j�O: " + stats.getMax());
		System.out.println("�`�M�O: " +stats.getSum());
		System.out.println("�̤p�O: " +stats.getMin());
		System.out.println("�����O: " +stats.getAverage());
		System.out.println("�`�ӼƬO: " +stats.getCount());
	}

}
