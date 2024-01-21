package algorithm;

public class Q019 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1から指定の数までカンマ区切りで表示
		int n = 7;
		for(int i = 1; i <= n; i++) {
			String text = Integer.toString(i) + ",";
			System.out.print(text);
		}
	}

}
