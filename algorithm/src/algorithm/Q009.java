package algorithm;

public class Q009 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 市松模様
		int row = 6;
		int wid = 10;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < wid; j++) {
				if((i + j) % 2 == 0) {
					System.out.print("■");
				} else {
					System.out.print("　");
				}
			}
			System.out.println();
		}
	}

}
