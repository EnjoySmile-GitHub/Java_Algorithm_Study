package algorithm;

public class Q020 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1から指定の数までカンマ区切りで表示（最後のカンマ無し）
		int n = 7;
		for(int i = 1; i <= n; i++) {
			System.out.print(i);
			if(i < n) {
				System.out.print(",");
			}
		}
	}

}
