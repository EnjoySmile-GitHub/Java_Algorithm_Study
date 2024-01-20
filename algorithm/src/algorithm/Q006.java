package algorithm;

public class Q006 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 2つの文字を交互に並べる（条件分岐と繰り返し）
		int count = 11;
		for(int i = 1; i <= count; i++) {
			if(i % 2 != 0) {
				System.out.print("◇");
			} else {
				System.out.print("◆");
			}
		}
	}

}
