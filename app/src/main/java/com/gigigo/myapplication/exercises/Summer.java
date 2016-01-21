package com.gigigo.myapplication.exercises;

public class Summer {

    int total;

	/**
	 * Adds an integer to this object's sum
	 * @param number
	 */
	public void add(int number) {
		this.total += number;
	}

	/**
	 * Returns the sum of all the integers added so far
	 */
	public int calcSum() {
		return this.total;
	}
}
