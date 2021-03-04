package day13;

public class Generics1 {
public static void main(String[] args) {
	PaintBrush<Water> pb=new PaintBrush<>();
pb.obj=new Water();
Water water=pb.getObj();
System.out.println(water);

PaintBrush<Paint> pb1=new PaintBrush<>();
pb1.obj=new RedPaint();
Paint paint=pb1.getObj();
System.out.println(paint);

}
}

class PaintBrush <t>{
	t obj;
	public t getObj() {
		return obj;
	}
	public void setObj(t obj) {
		this.obj=obj;
	}
}
class Water{
	
}

abstract class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}