class Car{
	
	private int num;
	private double gas;
	
	Car(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました");
	}
	Car(int n, double g){
		this();
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました" );
	}
	 public void show() {
		 System.out.println("ナンバー" + num + "にガソリン量" + gas + "の車です" );
		 
	 }
	
}
public class Test11 {
	public static void main(String[] args) {
		Car car1 = new Car(1234, 20.5);
		car1.show();
	}

}
