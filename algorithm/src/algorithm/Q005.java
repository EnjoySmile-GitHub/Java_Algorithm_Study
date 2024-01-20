package algorithm;

public class Q005 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 横と縦に並べる（二重ループ）
		int height = 5;
		int width = 5;
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("●");
			}
			System.out.println();
		}
	}

}
