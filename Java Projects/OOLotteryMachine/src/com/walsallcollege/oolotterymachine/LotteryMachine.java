package com.walsallcollege.oolotterymachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LotteryMachine {

	private List<Integer> numbersDrawn;
	private Random rand;
	private int num;
	private String name;
	
	public LotteryMachine(String name) {
		super();
		this.name = name;
		numbersDrawn = new ArrayList<>();
		rand = new Random();
	}

	public void drawNumbers(){
		
		for(int x = 0; x < 7; x++){
			
			while(numbersDrawn.contains(num = rand.nextInt(59) + 1));
			numbersDrawn.add(num);
		}
		
		sortNumbers();
		printNumbers();
		
	}
	
	private void sortNumbers(){
		
		Collections.sort(numbersDrawn);
		
	}
	
	private void printNumbers(){
		
		System.out.print("The lottery machine " + name + " drew the numbers: ");
		
		for(Integer number : numbersDrawn){
			System.out.print(number + " ");
		}
		
		System.out.println("");
		
	}
	
}
