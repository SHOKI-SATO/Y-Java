import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {
	public static void main(String[] args) throws IOException {
	
		int[]test = {80, 60, 22, 50, 75, 100};
		
		for(int i =0; i<test.length; i++) {
			System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
		}
		
		
		System.out.println( "5人のテストの点数を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[]tst = new int[5];
		for(int i = 0; i<tst.length; i++) {
			String str = br.readLine();
			tst[i] = Integer.parseInt(str);
		}
		int max = 0;
		
		for(int i =0; i<tst.length; i++) {
			if(max < tst[i]) {
				max = tst[i];
			}
		}
			
		for(int i = 0; i<tst.length; i++) {
			System.out.println((i+1) + "番目の人の点数は" + tst[i] + "です。");
		}
		System.out.println("最高点は" + max + "です。");

}
}
