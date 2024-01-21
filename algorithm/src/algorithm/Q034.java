package algorithm;

public class Q034 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 最小値の探索
		int[] array =  {68, 55, 72, 93, 87};
		int min = 100;
		int index = -1;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				index = i;
				min = array[i];
			}
		}
		System.out.println(min);
		System.out.println(index);
	}

}
