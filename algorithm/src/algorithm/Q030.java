package algorithm;

public class Q030 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 配列データの合計
		int[] array = {68, 55, 72, 93, 87} ;
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
	}

}
