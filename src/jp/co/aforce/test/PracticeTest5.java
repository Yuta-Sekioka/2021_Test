package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {
	public static void main(String[] args) {
		//問題１
		Random random=new Random();
		int fortune=random.nextInt(5);
		System.out.println("乱数 "+fortune);
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		
		//問題2
		int total=0;
		
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				System.out.print(i+" ");
				total+=i;
			}
		}System.out.print("\n");
		System.out.println("7の倍数の総合計は"+total);
		
		//問題3
		
		for(int j=1;j<10;j++) {
			for(int k=1;k<10;k++) {
				System.out.print(j*k+" ");
			}System.out.print("\n");
		}
		
		
	}

}
