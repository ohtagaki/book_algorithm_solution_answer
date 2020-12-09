package chapter003;

import java.util.ArrayList;
import java.util.Scanner;

public class FullSearchOfPairSum {

	public static void main(String[] args) {
		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int N = 5;
		int K = 10;
		for(int i = 0; i < N; i++){
			listA.add(Integer.parseInt(sc.next()));
		}
		for(int i = 0; i < N; i++){
			listB.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//線形探索
		//最小値を求める
		int minSumValue = 100000000;
		for(int i = 0; i < N; i++) {
			int checkSumValue= listA.get(i) + listB.get(i);
			//System.out.println(checkNumber);

			//2つの和がK未満の場合は捨てる
			if(checkSumValue < K) continue;

			//最小値を更新
			if(checkSumValue < minSumValue) {
				minSumValue = checkSumValue;
			}
		}
		System.out.println(minSumValue);

	}

}
