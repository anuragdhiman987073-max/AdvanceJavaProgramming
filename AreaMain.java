interface Area{
          double PI=3.14;
          double getArea();
}
class Circle implements Area{
          double r;
          Circle(double r){
                    this.r=r;
          }
          public double getArea(){
                    return PI*r*r;
          }
          public void display(){
                    System.out.println("Area of Circle: "+this.getArea());
          }
}
public class AreaMain {
          public static void main(String[] args) {
                    Circle c=new Circle(14.5);
                    c.display();
                    // System.out.println("Area of Circle: "+c.getArea());
                    Area c1=new Circle(16.5);
                    System.out.println("Area of Circle: "+c1.getArea());
                    Area r1=new Area(){
                              public double getArea(){
                                        int l=10,b=10;
                                        return l*b;
                              }
                    };
                    System.out.println("Area of Rectangle: "+r1.getArea());
                    
          }
}
