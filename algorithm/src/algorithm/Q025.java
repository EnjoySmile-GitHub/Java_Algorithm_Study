package algorithm;

public class Q025 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 配列の内容を逆順に表示
		int[] array = {10, 20, 30, 40, 50};
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[ array.length - i - 1 ]);
		}
	}

}
