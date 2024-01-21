package algorithm;

public class Q033 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 配列データから目的のデータを探す
		String[] array = {"abc", "abcd", "abcde", "xx", "yyy"};
		String target = "abcde";
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(target)) {
				System.out.println(i);
				break;
			}
			
			if(i == array.length - 1) {
				System.out.println("Not found");
			}
		}
	}

}
