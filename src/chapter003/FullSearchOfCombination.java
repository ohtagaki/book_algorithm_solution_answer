package chapter003;

import java.util.ArrayList;
import java.util.Scanner;

public class FullSearchOfCombination {

	public static void main(String[] args) {
		//入力受け取り
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int N = 5;
		int numberOfTarget = 10;
		for(int i = 0; i < N; i++){
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//線形探索
		//組み合わせの全探索
		boolean existNumberOfTarget = false;
		for(int bit = 0; bit < (1 << N); bit++) {
			//部分集合に含まれる要素の和
			int checkSum = 0;

			for(int i = 0; i < N; i++) {
				//i番目の要素a[i]が部分集合に含まれているかどうか
				if((1 & (bit >> i)) == 1) {
					checkSum += list.get(i);
				}
			}

			System.out.println(checkSum + "：" + bit);
			//対象の数と部分集合の値が一致するかどうか
			if(numberOfTarget == checkSum) {
				existNumberOfTarget = true;
			}

		}

		if(existNumberOfTarget) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
