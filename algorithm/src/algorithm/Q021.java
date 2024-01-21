package algorithm;

public class Q021 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 3の倍数のときのみ?を表示しながら1から指定の数まで表示
		int n = 20;
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				System.out.print("?");
			} else {
				System.out.print(i);
			}
			
			if(i != n) {
				System.out.print(",");
			}
		}
	}

}
