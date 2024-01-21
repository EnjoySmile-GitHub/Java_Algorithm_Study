package algorithm;

public class Q032 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 指定範囲のデータのみ合計
		int[] array =  {68, 55, 72, 93, 87};
		int min = 80;
		int max = 100;
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(min <= array[i] && array[i] <= max) {
				sum += array[i];
			}
		}
		System.out.println(sum);
	}

}
