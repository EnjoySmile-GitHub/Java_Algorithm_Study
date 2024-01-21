package algorithm;

public class Q022 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 九九表
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j != 1) {
					System.out.print(" ");
				}
				System.out.print(i * j);
			}
			System.out.println();
		}
	}

}
