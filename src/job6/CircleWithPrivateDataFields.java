package job6;
public class CircleWithPrivateDataFields {
    private double radius = 1;
    private  static int numberOfObjects = 0;
    public CircleWithPrivateDataFields(){
        numberOfObjects ++;
    }
    public CircleWithPrivateDataFields(double newRadius){
        radius = newRadius;
        numberOfObjects ++;
    }
    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
	public String getRadius11() {
		// TODO �Զ����ɵķ������
		return null;
	}
	public String getRadius1() {
		// TODO �Զ����ɵķ������
		return null;
	}
	public String getRadius() {
		// TODO �Զ����ɵķ������
		return null;
	}
}

