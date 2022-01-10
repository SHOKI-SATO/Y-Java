import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
	public static void main(String[] args) throws IOException {
		System.out.println("1〜10までの偶数を出力します。");
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("テストの点数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int sum = 0;
		do {
			String str = br.readLine();
			num = Integer.parseInt(str);
			sum += num;
		} while (num != 0);
		System.out.println("テストの合計点は" + sum + "です。");
		
		for(int j = 1; j <= 9; j++) {
			System.out.print(j + "\t");
			for(int k = 1; k <= 9; k++) {
				System.out.print(j*k);
				System.out.print("\t");	
					if(k == 9) {
						System.out.println();
					}
			}
		}
		
		for(int l = 1; l <= 5; l++) {
			for(int m = 0; m < l; m++) {
			System.out.print("*");
			}
			System.out.println();
		
		
	}
		
		System.out.println("2以上の整数を入力してください。");
		String strg = br.readLine();
		int numb = Integer.parseInt(strg);
		for(int n = 2; n <= numb; n++) {
			if(n == numb) {
				System.out.println(numb + "は素数です。");
			}else if (numb % n == 0){
				System.out.println(numb + "は素数ではありません。");
				break;
			}
		}
		
		

	}
	
}
