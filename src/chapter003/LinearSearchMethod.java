package chapter003;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchMethod {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int A = 5;
		for(int i = 0; i < A; i++){
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//線形探索
		boolean existNumberFlag = false;
		for(int i = 0; i < list.size(); i++) {
			int checkNumber = list.get(i);
			System.out.println(checkNumber);
			if(checkNumber == 7) {
				existNumberFlag = true;
				break;
			}
		}

		System.out.println(existNumberFlag);

	}
}
