import java.awt.Color;

public class StarTurtleExample {

	public static void main(String[] args) {
		Turtle t = new Turtle();
//		Turtle.setCanvasSize(600, 600);
		
		t.speed(1000);
		
		int  radius = 200;
		
//		int a, b;
//		a = 200;
//		b = 200;
//		double length = Math.pow(a, 2) + Math.pow(b, 2);
//		length = Math.sqrt(length);
//		
//		double radius = Math.pow(a, 2) - Math.pow(length/2, 2); 	// 반지름 구하기
//		
//		radius = Math.sqrt(radius);
		
		t.dot("pink", radius * 2);	
		
		t.up();
		
		t.penColor(Color.DARK_GRAY);
		t.left(18);
		t.forward(radius);
//		t.left(162);
		
		t.down();
		t.speed(1000);
		t.left(18);
		
	    double length = Math.sqrt(Math.pow(radius, 2) + Math.pow(radius, 2) - 2*radius*radius*Math.cos(Math.toRadians(144)));

        for (int i=0; i<5; i++) {
            t.left(144);
            t.forward(length);
        }
		
		
	}

}
