package algorithm;

public class Q035 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 最大値の探索
		int[] array = {68, 55, 72, 93, 87};
		int max = 0;
		int index = -1;
		
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
