package com.crosby.listdemo;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {

	public static void main(String[] args) {
		
		/*//Create a new ArrayList to store String values
		List<String> names = new ArrayList<>();
		//add 4 strings to ArrayList
		names.add("John");
		names.add("Jack");
		names.add("Phill");
		names.add("Bob");
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		*/
		
		Job job1 = new Job("2485", "Cherry", "Mouse not working", false);
		Job job2 = new Job("6341", "Phill", "Keyboard not working", true);
		Job job3 = new Job("7532", "Louise", "Monitor not working", false);
		
		List<Job> jobs = new ArrayList<>();
		jobs.add(job1);
		jobs.add(job2);
		jobs.add(job3);
		
		//Print out a description of all the jobs in the list
		for(int x = 0; x < jobs.size(); x++)
		{
			System.out.println(jobs.get(x).getId() + " : " + jobs.get(x).getDescription());
		}
		
		int value = 0;
		
		System.out.println(jobs.size());
		
		while (value < (jobs.size()))
		{
			if(jobs.get(value).isResolved() == true)
			{
				System.out.println(jobs.get(value).getStaffMemberName() + " + " + jobs.get(value).getId() + " : " + jobs.get(value).getDescription());
			} 
			value = value + 1;
		}
		
		for (Job job : jobs) {
			if(job.isResolved() == false)
			{
				System.out.println(job.getStaffMemberName() + " + " + job.getId() + " : " + job.getDescription());
			}
		}
		
	}

}
