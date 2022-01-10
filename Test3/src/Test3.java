import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
	public static void main(String[] args) throws IOException{
		System.out.println("あなたは何歳ですか？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println("あなたは" +num+ "歳です。");
		
		
		System.out.println("円周率の値はいくつですか？");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String st = br1.readLine();
		double dbl = Double.parseDouble(st);
		System.out.println("円周率の値は" +dbl+ "です。");
		
		System.out.println("身長と体重を入力してください。");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		String  hei= br2.readLine();
		String wei = br3.readLine();
		double height = Double.parseDouble(hei);
		double weight = Double.parseDouble(wei);
		System.out.println("身長は" +height+ "センチです。");
		System.out.println("体重は" +weight+ "キロです。");
		
		
		
	}

}
