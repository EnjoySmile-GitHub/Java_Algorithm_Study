package algorithm;

public class Q008 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 縦ストライプ
		int row = 5;
		int wid = 7;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < wid; j++) {
				if(j % 2 == 0) {
					System.out.print("■");
				} else {
					System.out.print("　");
				}
			}
			System.out.println();
		}
	}

}
