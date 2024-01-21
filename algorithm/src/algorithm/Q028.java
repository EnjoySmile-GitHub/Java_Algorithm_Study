package algorithm;

public class Q028 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 指定範囲のデータのみ表示
		int[] array = {40, 10, 30, 50, 20};
		int min = 20;
		int max = 39;
		for(int i = 0; i < array.length; i++) {
			if(min <= array[i] && array[i] <= max) {
				System.out.println(array[i]);
			}
		}
	}

}
