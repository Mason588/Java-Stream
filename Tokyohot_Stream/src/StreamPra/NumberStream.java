package StreamPra;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class NumberStream {

	public static void main(String[] args) {
		int [] values = {3,4,1,5,20,1,3,3,4,6};
		System.out.println(IntStream.of(values).distinct().filter(e-> e>3 && e %2 ==0).average().getAsDouble());
		System.out.println("sum is " +IntStream.of(values).limit(5).sum());
		
		//獲得統計值
		IntSummaryStatistics stats =IntStream.of(values).summaryStatistics();
		System.out.println("最大是: " + stats.getMax());
		System.out.println("總和是: " +stats.getSum());
		System.out.println("最小是: " +stats.getMin());
		System.out.println("平均是: " +stats.getAverage());
		System.out.println("總個數是: " +stats.getCount());
	}

}
