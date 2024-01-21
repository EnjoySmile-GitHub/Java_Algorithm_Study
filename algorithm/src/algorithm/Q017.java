package algorithm;

public class Q017 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1から指定の数まで、指定の倍数を縦に表示
		int last = 20;
		int target = 4;
		for(int i = 1; i <= last; i++) {
			if(i % target == 0) {
				System.out.println(i);
			}
		}
	}

}
