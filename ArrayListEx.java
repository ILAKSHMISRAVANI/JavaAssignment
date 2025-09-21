package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<String> colors=new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Pink");
		colors.add("Yellow");
		colors.add("Grey");
		
		// To Iterate through the list
		System.out.println("Elemts in ArrayList : ");
		colors.forEach(i -> System.out.print(i+"\t"));
		
		System.out.println("Elements after adding at first : ");
		colors.addFirst("White");
		colors.forEach(i -> System.out.println(i));
		
		System.out.println("Elements after index 2 : ");
		System.out.println(colors.get(2));
		
		System.out.println("Elements after updating at index 1 : ");
		colors.set(1, "Black");
		colors.forEach(i -> System.out.print(i+"\t"));
		
		System.out.println("Elements after deleting  : ");
		colors.remove(2);
		colors.forEach(i -> System.out.print(i+"\t"));
		
		for(int i=0;i<colors.size();i++) {
			
			if (colors.get(i) == "Black") {
				System.out.println("Color Found");
				break;
			}
			if(i == colors.size()) {
				System.out.println("Color Not Found");
			}
			
		}
		
		//sort ArrayList
		Collections.sort(colors);
		colors.forEach(i -> System.out.print(i+"\t"));
		
		
		List<String> arrCopy = new ArrayList<String>(colors);
		arrCopy.forEach(i -> System.out.print(i+"\t"));
		
		Collections.shuffle(colors);
		colors.forEach(i -> System.out.print(i+"\t"));
		
		Collections.reverse(colors);
		colors.forEach(i -> System.out.print(i+"\t"));
		
		colors.set(2, "Crimson");
		colors.forEach(i -> System.out.print(i+"\t"));
		

	}

}
