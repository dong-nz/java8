package dong.java8.features.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			integerList.add(i);
		}

		integerList.forEach(System.out::print);
	}

}
