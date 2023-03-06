import util.Turtle;

public class TrutleTriangleExample {

	public static void main(String[] args) {
		// 반복문을 활용해서 랜덤 직각삼각형 그리기 
		Turtle t = new Turtle();
		Turtle.setCanvasSize(800,800);
		
		t.speed(500);
		
		int cnt = 0;
		
		for (int a=1; a<=10; a++)
			for (int b=1; b<=10; b++)
				for (int c=1; c<=10; c++)
					if(a*a + b*b == c*c) {
						
						int x = (int)(Math.random()*400 -200);
						int y = (int)(Math.random()*400 -200);
						
						t.up();
						t.setPosition(x, y);
						
						t.down();
						t.setDirection(0);
						t.forward(b*50);
						
						double degree = Math.toDegrees(Math.acos((double)b/c));
						t.setDirection(180);
						t.right(degree);
						t.forward(c*50);
						
						t.setDirection(270);
//						t.setDirection(-90);
						t.forward(a*50);
					}
		
		System.out.println(cnt);
	}
	
	public static void main3(String[] args) {
		Turtle t = new Turtle();
		Turtle.setCanvasSize(800,800);
		
		t.speed(50);
		
		for (int j=0; j<2; j++) {
			for(int i=0; i<4; i++) {
				t.forward(100);
				t.left(90);
			}
			t.left(10);
		}
	}
	
	public static void main2(String[] args) {
		Turtle t = new Turtle();
		Turtle.setCanvasSize(800,800);
		
		t.speed(500);
		
		for (int j=0; j<2; j++) {
			for(int i=0; i<4; i++) {
				t.forward(100);
				t.left(90);
			}
			t.left(10);
		}
	}
}