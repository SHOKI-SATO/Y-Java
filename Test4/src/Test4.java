import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[] args) throws IOException {
		System.out.println(0 - 4);
		System.out.println(3.14 * 2);
		System.out.println(5 / 3);
		System.out.println(30 % 7);
		System.out.println((7 + 32) / 5);
		
		
		System.out.println("正方形の辺の長さを入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println("正方形の面積は" +(num * num)+ "です。");
		
		
		System.out.println("三角形の高さと底辺を入力してください。");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		String str2 = br2.readLine();
		double dnum1 = Double.parseDouble(str1);
		double dnum2 = Double.parseDouble(str2);
		System.out.println("三角形の面積は" +(dnum1 * dnum2) / 2 +"です。");
		
		System.out.println("科目1〜5の点数を入力してください。");
		BufferedReader bfr1 = new BufferedReader(new InputStreamReader(System.in));
		String strg1 = bfr1.readLine();
		String strg2 = bfr1.readLine();
		String strg3 = bfr1.readLine();
		String strg4 = bfr1.readLine();
		String strg5 = bfr1.readLine();
		int sum = 0;
		sum += Integer.parseInt(strg1);
		sum += Integer.parseInt(strg2);
		sum += Integer.parseInt(strg3);
		sum += Integer.parseInt(strg4);
		sum += Integer.parseInt(strg5);
		double avg = sum / 5;
		System.out.println("5科目の合計点は" +sum+ "点です。");
		System.out.println("5科目の平均点は" +avg+ "点です。");
		
	}

}
