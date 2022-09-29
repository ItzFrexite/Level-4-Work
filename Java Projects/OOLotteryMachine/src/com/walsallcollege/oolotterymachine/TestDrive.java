package com.walsallcollege.oolotterymachine;

public class TestDrive {

	public static void main(String[] args) {
	
		LotteryMachine guinevere = new LotteryMachine("Guinevere");
		guinevere.drawNumbers();
		
		LotteryMachine merlin = new LotteryMachine("Merlin");
		merlin.drawNumbers();
		
		LotteryMachine lancelot = new LotteryMachine("Lancelot");
		lancelot.drawNumbers();
		
	}

}
