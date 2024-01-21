package algorithm;

public class Q023 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 九九表をきれいに表示
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				int ans = i * j;
				System.out.print(String.format("%3s", ans));
				if(j != 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
