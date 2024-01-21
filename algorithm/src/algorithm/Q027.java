package algorithm;

public class Q027 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 文字数が指定数以下のデータのみ表示
		String[] array = {"abc", "abcd", "abcde", "xx", "yyy"};
		int len = 3;
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() <= len) {
				System.out.println(array[i]);
			}
		}
	}

}
