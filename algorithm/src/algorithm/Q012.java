package algorithm;

public class Q012 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 右下がりに文字を並べる
		int n = 8;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				if(i == j) {
					System.out.print("■");					
				} else {
					System.out.print("　");
				}
			}
			System.out.println();
		}
	}

}
