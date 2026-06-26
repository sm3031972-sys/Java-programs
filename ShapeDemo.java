abstract class Shape
{
double side;
double area;
double perimeter;
abstract void calculateArea();
abstract void calculatePerimeter();
void display(){
System.out.println("Area : "+area);
System.out.println("Perimeter : "+perimeter);
}
}

class Triangle extends Shape
{
double a;
double b;
double c;
Triangle(double a,double b,double c)
{
this.a=a;
this.b=b;
this.c=c;
}
public void calculateArea()
{
double s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));//heroins formula
}
public void calculatePerimeter()
{
perimeter=a+b+c;
}
public void display()
{
System.out.println("Triangle");
super.display();
}
}

class Reactangle extends Shape
{
double length,breadth;
Reactangle(double l,double b)
{
this.length=l;
this.breadth=b;
}
public void calculateArea()
{
area=length*breadth;
}
public void calculatePerimeter()
{
perimeter=2*(length+breadth);
}
void display()
{
System.out.println("REACTANGLE");
super.display();
}
}

class Circle extends Shape
{
double radius;
Circle(double r)
{
this.radius=r;
}
public void calculateArea()
{
area=3.14*radius*radius;
}
public void calculatePerimeter()
{
perimeter=2*3.14*radius;
}
public void display()
{
System.out.println("CIRCLE");
super.display();
}
}

class Square extends Shape
{
double side1;
Square(double s1)
{
this.side1=s1;
}
public void calculateArea()
{
area=side1*side1;
}
public void calculatePerimeter()
{
perimeter=4*side1;
}
public void display()
{
System.out.println("SQUARE");
super.display();
}
}

class Cube extends Shape
{
double side;
Cube(double s)
{
this.side=s;
}
public void calculateArea()
{
area=6*side*side;
}
public void calculatePerimeter()
{
perimeter=12*side;
}
public void display()
{
System.out.println("CUBE");
super.display();
}
}
public class ShapeDemo
{
public static void main(String args[])
{
Triangle tri=new Triangle(3,4,5);
tri.calculateArea();
tri.calculatePerimeter();
tri.display();


Reactangle rect=new Reactangle (13,14);
rect.calculateArea();
rect.calculatePerimeter();
rect.display();


Circle crc=new Circle(10);
crc.calculateArea();
crc.calculatePerimeter();
crc.display();

Square squ=new Square(16);
squ.calculateArea();
squ.calculatePerimeter();
squ.display();

Cube c=new Cube(15);
c.calculateArea();
c.calculatePerimeter();
c.display();

}
}



