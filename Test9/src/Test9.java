class Mypoint{
	int x;
	int y;
	
	Mypoint(){
		x = 0;
		y = 0;
	}
	Mypoint(int px, int py){
		if(px >= 0 && px <= 100) x = px; else x = 0;
		if(py >= 0 && py <= 100) y = py; else y = 0;
	}
	void setX(int px) {
		if(px >= 0 && px <= 100) {
			x = px;
		}
	}
	void setY(int py) {
		if(py >= 0 && py <= 100) {
			y = py;
		}
	}
		
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
}

public class Test9 {
	public static void main(String[] args) {
		Mypoint p1 = new Mypoint();
		p1.setX(10);
		p1.setY(5);
		
		int px1 = p1.getX();
		int py1 = p1.getY();
		
		System.out.println("p1のX座標は" +px1+ "Y座標は" +py1+ "でした。");
		
		Mypoint p2 = new Mypoint(20, 10);
		int px2 = p2.getX();
		int py2 = p2.getY();
		
		System.out.println("p2のX座標は" +px2+ "Y座標は" +py2+ "でした。");
		
	}

}
