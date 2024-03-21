class Circle
{
 public static void main(String []args)
  {
    double radius=5.5;
    final double pi=3.14;
    double area=pi*(radius*radius);
    double perimeter=2*pi*radius;

    System.out.println("Area of Circle is - "+area);
    System.out.println("Perimeter of Circle - "+perimeter);
  }
}