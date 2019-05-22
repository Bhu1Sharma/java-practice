package logics;

import java.util.Scanner;

public class WordPin{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String pin = "";
		String words[] = sentence.split(" ");
		
		for(String word : words) {
			pin+=word.length();
		}
		if(pin.isEmpty()) {
			System.out.println("0");
		}
		else {
			System.out.println(pin);
		}
		sc.close();
	}
}