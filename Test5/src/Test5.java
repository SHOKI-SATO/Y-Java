import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {
	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		String ark = num % 2 == 0 ? "偶数" :"奇数" ;
		System.out.println(num + "は" + ark + "です。" );
		
		System.out.println("2つの整数を入力してください。");
		String str1 = br.readLine();
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		if(num1 == num2) {
			System.out.println("2つの数は同じ値です。");
		} else if(num1 > num2) {
			System.out.println(num2 + "より" + num1 + "のほうが大きいです。");
		}else {
			System.out.println(num1 + "より" + num2 + "のほうが大きいです。");
		}
		
		System.out.println("0から10までの整数を入力してください。");
		String strg = br.readLine();
		int numb = Integer.parseInt(strg);
		if(numb >= 0 || numb <=10 ) {
			System.out.println("正解です。");
		} else {
			System.out.println("まちがいです。");
		}
		
		System.out.println("成績を入力してください。");
		String stg = br.readLine();
		int nmb = Integer.parseInt(stg);
		switch(nmb) {
			case 1:
				System.out.println("もっと頑張りましょう。");
				break;
			case 2:
				System.out.println("もう少し頑張りましょう。");
				break;
			case 3:
				System.out.println("さらに上をめざしましょう。");
				break;
			case 4:
				System.out.println("たいへんよくできました。");
				break;
			case 5:
				System.out.println("たいへん優秀です。");
				break;
		}


}
}
