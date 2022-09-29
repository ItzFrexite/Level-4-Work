package com.crosby.personsim;

public class FootballPlayer extends Person {
	
	String[] team;
	String[] position;
	
	public FootballPlayer(String firstName, String lastName, double height, double weight, int age, String[] team, String[] position) {
		super(firstName, lastName, height, weight, age); //pass these values to the Person class constructor
		this.team = team;
		this.position = position;
	}
	
	public void play(String team, String position){
		System.out.println(firstName + " is playing for team " + team + " in the position " + position + ".");
	}
	
	public void scoreGoal(){
		System.out.println(firstName + " scored!");
	}

}
