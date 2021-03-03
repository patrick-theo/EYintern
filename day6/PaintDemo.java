package day6;

public class PaintDemo {

	public static void main(String[] args)throws Exception {
		PaintBrush pb=new Containter().painting("day6.RedPaint");
		pb.getpaint();
		
	
	
	}
	
	
}

class Containter{
	public PaintBrush painting(String s)throws Exception{
		PaintBrush pb=new PaintBrush();
		Paint paint=(Paint)Class.forName(s).newInstance();
		pb.paint=paint;
		return pb;
	}
	
	
}
class PaintBrush{
	Paint paint;
	public void getpaint() {
		System.out.println(paint);
	}
	
}


abstract class Paint{
	
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}