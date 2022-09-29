package com.crosby.lotterymachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestDrive {

	public static void main(String[] args) {
		 List<Integer> numbersDrawn = new ArrayList<>();
		 int numbersGenerated = 0;
		 Random rnd = new Random();
		 int num = 0;
		 
		 for(numbersGenerated = 0; numbersGenerated < 6; numbersGenerated++)
		 {
			 
			 do
			 {
				 num = rnd.nextInt(59)+1;
			 }
			 while(numbersDrawn.contains(num));
			 
			 numbersDrawn.add(num);
		 
		 }
		 
		 System.out.println(Arrays.toString(numbersDrawn.toArray()));
	}

}
