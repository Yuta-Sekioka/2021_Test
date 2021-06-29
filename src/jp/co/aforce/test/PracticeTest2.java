package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {
		int x=10;
		int y=28;
		double z=3.14;
		System.out.println("x="+x+" y="+y+" z="+z);
		//問題1
		System.out.println("x*y="+(x*y));
		
		//問題2
		System.out.println("y/x="+(y/x)+" あまり"+(y%x));
		
		//問題3
		double num=y*z;
		
		System.out.println("y*z="+num);
		
		//問題4
		num++;
		
		System.out.println("y*z="+num+"　インクリメント後");
		
		//問題5
		int age=22;
		Random random=new Random();
		int randomNumber=random.nextInt(101);
		System.out.println("年齢 "+age+" randomNumber "+randomNumber);
		
		if(randomNumber<age) {
			System.out.println("私のほうが年上です");
		}
		if(randomNumber==age) {
			System.out.println("私と同い年です");
		}
		if(randomNumber>age) {
			System.out.println("私のほうが年下です");
		}
	}

}
