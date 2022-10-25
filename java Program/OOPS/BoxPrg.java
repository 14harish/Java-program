class Box{
    int width;int height;double depth;
    Box(int width,int height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public double volume(){
        return width*height*depth;
    }
}
public class BoxPrg {
    public static void main(String[] args) {
        Box b=new Box(10, 10, 12.2);
        System.out.println("Volume of The box is :"+b.volume());
    }
    
}
