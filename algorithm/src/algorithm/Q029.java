package algorithm;

public class Q029 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 配列データのコピー
		int[] array = {10, 20, 30, 40, 50};
		int[] array_copy = new int[array.length];
		for(int i = 0; i < array_copy.length; i++) {
			System.out.println(array_copy[i]);
			array_copy[i] = array[i];
		}
		for(int i = 0; i < array_copy.length; i++) {
			System.out.println(array_copy[ i ]);
		}
	}

}
