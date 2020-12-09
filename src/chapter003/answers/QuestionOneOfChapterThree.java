package chapter003.answers;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionOneOfChapterThree {

	public static void main(String[] args) {
		//入力受け取り
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int A = 5;
		int numberOfTarget = 9;
		for(int i = 0; i < A; i++){
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//線形探索
		int foundNumberIndex = -1;
		for(int i = 0; i < list.size(); i++) {
			int checkNumber = list.get(i);
			//一致したら添え字を登録
			if(checkNumber == numberOfTarget) {
				foundNumberIndex = i;
			}
		}

		System.out.println(foundNumberIndex);
	}

}
