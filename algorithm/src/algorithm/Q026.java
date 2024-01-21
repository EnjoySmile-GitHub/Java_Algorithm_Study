package algorithm;

public class Q026 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 配列の内容をカンマ区切りで表示
		int[] array = {10, 20, 30, 40, 50};
		for(int i = 0; i < array.length; i++) {
			if(i != 0) {
				System.out.print(",");
			}
			System.out.print(array[i]);
		}
	}

}
