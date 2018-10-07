package com.unimelb.swen30006.monopoly;

import java.util.Scanner;

/**
 * This class is created based on case study of Monopoly of "Applying UML and Patterns, 3rd edition by Craig Larman".
 * For demonstration on subject SWEN30006 at The University of Melbourne 
 * @author 	Yunzhe(Alvin) Jia
 * @version 1.0
 * @since 	2016-07-18
 *
 */
public class Die {
	public static final int MAX = 6;
	private int faceValue;
	private RollType rollType;
	
	public Die( RollType rollType){
		this.rollType = rollType;
		roll();
	}
	
	public void roll(){
		//
		if (rollType==RollType.RANDOM) {
			faceValue = (int) ((Math.random() * MAX) + 1);
		}else if (rollType==RollType.USER) {
			System.out.println("Please input your dice number, must be between 1 to 6");
			Scanner in = new Scanner(System.in);
			faceValue = in.nextInt();
		}else if (rollType==RollType.FILE) {
			faceValue = (int) ((Math.random() * MAX) + 1);
		}else {
			faceValue = (int) ((Math.random() * MAX) + 1);
		}
	}
	
	public int getFaceValue() {
		return faceValue;
	}
}
