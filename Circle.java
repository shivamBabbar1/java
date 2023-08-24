
public class Circle{
   private double radius;
  

public Circle(double radius){
    this.radius = radius;
}

  void setRadius(double radius){
            this.radius = radius;
  }

  void getRadious(){
    //return radius;
    System.out.println(radius);
  }

  double getArea(){
    return 3.14 * radius * radius;
  }
  double getCircumference(){
    return 2 * 3.14 * radius;
  }

    public static void main(String[] args){
            Circle c1 = new Circle();

            c1.setRadius(5.0);
            c1.getRadious();
           System.out.println(c1.getArea());
            c1.getCircumference();
    }
}