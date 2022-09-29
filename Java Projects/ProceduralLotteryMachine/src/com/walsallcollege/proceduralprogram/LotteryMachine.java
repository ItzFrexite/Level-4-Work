package com.walsallcollege.proceduralprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LotteryMachine {

	static List<Integer> numbersDrawn;
	static Random rand = new Random();
	static int num;
	
	public static void drawNumbers(){
		
		numbersDrawn = new ArrayList<>();
		
		for(int x = 0; x < 7; x++){
			
			while(numbersDrawn.contains(num = rand.nextInt(59) + 1));
			numbersDrawn.add(num);
		}
		
		sortNumbers();
		printNumbers();
		
	}
	
	public static void sortNumbers(){
		
		Collections.sort(numbersDrawn);
		
	}
	
	public static void printNumbers(){
		
		System.out.print("The lottery machine drew the numbers: ");
		
		for(Integer number : numbersDrawn){
			System.out.print(number + " ");
		}
		
		System.out.println("");
		
	}
	
}
