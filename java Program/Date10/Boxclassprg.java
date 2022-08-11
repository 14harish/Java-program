package Date10;

class box{
	double width;
	double height;
	double depth;
	double sum;
	box(double width,double height,double depth){
		 sum=width*height*depth;
	}
	void print() {
		System.out.println("Volume of:"+sum);
	}
}
public class Boxclassprg {
public static void main(String[] args) {
	box n1=new box(1.2,2.3,3.4);
	n1.print();
}
}
