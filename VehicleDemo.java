interface Vehicle
{
String name="";
int maxPassenger=0;
int maxSpeed=0;
}
interface LandVehicle extends Vehicle
{
int numWheels=0;
void drive();
}
interface SeaVehicle extends Vehicle
{
int displacement=0;
void launch();
}
class Car implements LandVehicle
{
String name;
int maxPassenger;
int maxSpeed;
int numWheels;

Car(String name,int maxPassenger,int maxSpeed,int numWheels)
{
this.name=name;
this.maxPassenger=maxPassenger;
this.maxSpeed=maxSpeed;
this.numWheels=numWheels;
}
public void drive()
{
System.out.println(name+" is driving on the road on "+numWheels+" wheels At a maxspeed of "+maxSpeed+" km/h with passengers "+maxPassenger);
}
}
class Ship implements SeaVehicle
{
String name;
int maxPassenger;
int maxSpeed;
int displacement;

Ship(String name,int maxPassenger,int maxSpeed,int displacement)
{
this.name=name;
this.maxPassenger=maxPassenger;
this.maxSpeed=maxSpeed;
this.displacement=displacement;
}
public void launch()
{
System.out.println(name+" is sailing in the sea "+" displacement "+displacement+"km"+" with speed of "+maxSpeed+"km/hr with Passengers "+maxPassenger);
}
}
class HoverCraft implements LandVehicle,SeaVehicle
{
String name;
int maxPassenger;
int maxSpeed;
int numWheels;
int displacement;

HoverCraft(String name,int maxPassenger,int maxSpeed,int displacement,int numWheels)
{
this.name=name;
this.maxPassenger=maxPassenger;
this.maxSpeed=maxSpeed;
this.displacement=displacement;
this.numWheels=numWheels;
}
public void drive()
{
System.out.println(name+" is driving on road ");
}
public void launch()
{
System.out.println(name+" is floating on water");
}
public void enterland()
{
System.out.println(name+" switched to land mode");
}
public void entersea()
{
System.out.println(name+" switched to sea mode");
}
}
class VehicleDemo
{
public static void main(String args[])
{
Car c=new Car("Tesla",4,200,4);
c.drive();
System.out.println();

Ship s=new Ship("Titanic",5,220,10);
s.launch();
System.out.println();

HoverCraft h=new HoverCraft("HoverX",8,180,10,2);
h.drive();
h.enterland();
h.launch();
h.entersea();
System.out.println();
}
}