package algorithm;

public class Q007 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 横ストライプ
		int row = 5;
		int wid = 7;
		
		for(int i = 0; i < row; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < wid; j++) {
					System.out.print("■");
				}	
			}
			System.out.println();
		}
	}

}
