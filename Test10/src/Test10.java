import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {
	public static void main(String[] args) throws IOException {
		System.out.println("文字列を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(str + "を逆順にすると" + sb);
		
		System.out.println("文字列を入力してください");
		String str1 = br.readLine();
		System.out.println("aの挿入位置を整数で入力してください");
		String str2 = br.readLine();
		int num = Integer.parseInt(str2);
		StringBuffer sb1 = new StringBuffer(str1);
		sb1.insert(num, "a");
		System.out.println(sb1 + "になりました");
		
		System.out.println("整数を2つ入力してください");
		String st1 = br.readLine();
		String st2 = br.readLine();
		int num1 = Integer.parseInt(st1);
		int num2 = Integer.parseInt(st2);
		int min = Math.min(num1, num2);
		System.out.println(st1 + "と" + st2 + "のうち小さい方は" + min + "です");
		
		
				
		
		
	}

}
