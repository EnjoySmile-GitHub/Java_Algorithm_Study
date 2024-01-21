package algorithm;

public class Q016 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1から指定の数までの指定倍の数を縦に表示
		int last = 7;
		int num = 5;
		for(int i = 1; i <= last; i++) {
			int ans = num * i;
			System.out.println(ans);
		}
	}

}
