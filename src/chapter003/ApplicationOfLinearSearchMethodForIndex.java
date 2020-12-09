package chapter003;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationOfLinearSearchMethodForIndex {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int A = 5;
		int v = 10;
		for(int i = 0; i < A; i++){
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//線形探索
		//条件を満たすものがあるかどうか探索する
		int foundNumberId = -1;
		for(int i = 0; i < list.size(); i++) {
			int checkNumber = list.get(i);
			//System.out.println(checkNumber);
			if(checkNumber == v) {
				//見つかったら添え字を記録
				foundNumberId = i;
				break;
			}
		}

		System.out.println(foundNumberId);

	}
}
