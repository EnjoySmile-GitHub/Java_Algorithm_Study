package algorithm;

public class Q010 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 三角形に文字を並べる
		int row = 8;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}

}
