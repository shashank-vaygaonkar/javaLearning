package collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo_7 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(124);
		list.add(336);
		list.add(663);
		list.add(226);
		list.add(882);
		
		Collections.sort(list);
		for (Integer i : list) {
			System.out.println(i);
		}
		
		Comparator<Integer> custom_comparator=new CustomComparator_7();
		//sort on basis of last digit 
		Collections.sort(list, custom_comparator);
		for (Integer i : list) {
			System.out.println(i);
		}
		
	}

}


