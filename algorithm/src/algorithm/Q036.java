package algorithm;

public class Q036 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 配列データの並び替え（選択法）
		int[] array = {68, 55, 72, 93, 87};
		
		System.out.println("並び替え前");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++) {
			int target = array[i];
			int idx1 = i;
			int idx2 = i;
			
			for(int j = i + 1; j < array.length; j++) {
				if(target > array[j]) {
					idx2 = j;
					target = array[j];
				}
			}
			
			int temp = array[idx1];
			array[idx1] = array[idx2];
			array[idx2] = temp;
		}
		
		System.out.println("並び替え後");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
