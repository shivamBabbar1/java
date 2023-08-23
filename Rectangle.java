public class Rectangle{
    private double width;
    private double height;

    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }


    void setWidth(double width){
        this.width = width ;
    }
    void setHeight(double height){
        this.height = height ;
    }


    double area(){
        return width * height;
    }
    double perimeter(){
        return 2 * (width + height);
    }

  public static void main(String[] args){

    Rectangle r1 = new Rectangle(10 , 20);
    
    r1.setWidth(43.0);
    r1.setHeight(66.0);
    System.out.println("THE WIDTH IS : "+r1.width+" , HEIGHT : "+r1.height+" , AREA OF RECTANGLE : "+r1.area()+" , PERIMETER : "+r1.perimeter());
  }

}