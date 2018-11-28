package me.sumithpuri.github.meghalaya.spring.aop.sample;

import me.sumithpuri.github.meghalaya.spring.di.sample.Knight;

public class Minstrel {

	public Minstrel() {
		System.out.println("Minstrel: I was Initalized.");
	}
	
	public void singBefore(Knight knight) {

		System.out.println("Minstrel: [Faa La La La]; Sir " + knight.getName() +" is so Brave!");
	}

	public void singAfter(Knight knight) {

		System.out.println("Minstrel: [Sha La La La]; Sir " + knight.getName() +" did Embark on a Quest!");
	}
}