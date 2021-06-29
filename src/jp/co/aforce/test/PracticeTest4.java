package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {

	public static void main(String[] args) {
		//問題１
		//②でのコーディングが適切
		//値を比較するため
		
		//問題2
		ArrayList<String>animals=new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		//問題3
		String animal="猫";
		if(animals.contains(animal)) {
			System.out.println(animal+"はリストに含まれています");
		}else {
			System.out.println(animal+"はリストに含まれていません");
		}
		
		//問題４
		//コードは長くなるが多分岐のためSwitch文のほうが見やすいと考えた
		int birth=8;
		switch(birth) {
			case 1:
				System.out.println("1月の祝日は、元日,成人の日");
				break;
			case 2:
				System.out.println("2月の祝日は、建国記念の日,天皇誕生日");
				break;
			case 3:
				System.out.println("3月の祝日は、春分の日");
				break;
			case 4:
				System.out.println("4月の祝日は、昭和の日");
				break;
			case 5:
				System.out.println("5月の祝日は、憲法記念日,みどりの日,こどもの日");
				break;
			case 6:
				System.out.println("6月の祝日は、なし");
				break;
			case 7:
				System.out.println("7月の祝日は、海の日,スポーツの日");
				break;
			case 8:
				System.out.println("8月の祝日は、山の日");
				break;
			case 9:
				System.out.println("9月の祝日は、敬老の日,秋分の日");
				break;
			case 10:
				System.out.println("10月の祝日は、なし");
				break;
			case 11:
				System.out.println("11月の祝日は、文化の日,勤労感謝の日");
				break;
			case 12:
				System.out.println("12月の祝日は、なし");
				break;
		}
	}

}
