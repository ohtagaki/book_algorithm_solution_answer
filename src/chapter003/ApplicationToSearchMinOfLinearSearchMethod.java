package chapter003;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationToSearchMinOfLinearSearchMethod {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int A = 5;
		int minValue = 100000000;
		for(int i = 0; i < A; i++){
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//線形探索
		//最小値を求める
		for(int i = 0; i < list.size(); i++) {
			int checkNumber = list.get(i);
			//System.out.println(checkNumber);
			if(checkNumber < minValue) {
				minValue = checkNumber;
			}
		}
		System.out.println(minValue);

	}

}
