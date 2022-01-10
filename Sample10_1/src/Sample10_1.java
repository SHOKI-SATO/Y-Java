
public class Sample10_1 {
	public static void main(String[] args) {
		String str = "Hello";
		
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		
		int len = str.length();
		
		String big = str.toUpperCase();
		
		System.out.println(str + "の文字列は" + ch1 + "です。");
		System.out.println(str + "の文字列は" + ch2 + "です。");
		System.out.println(str + "の長さは" + len + "です。");
		System.out.println(str + "は大文字で" + big + "です。");
	}

}
