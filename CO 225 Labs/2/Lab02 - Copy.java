/*
	*CO225 - LAB 02
	*E-18-180
	*Kodituwakku M.K.N.M.
*/

import java.lang.Math;

public class Lab02 {
  public static void main(String args[]) {
    // Complete Task C
    Circle cir;
    Square sqa;
    Sphere sph;
    Cube cub;
    cir = new Circle(Float.parseFloat(args[0]));	//creating instance
    sqa = new Square(Float.parseFloat(args[0]));	//creating instance
    sph = new Sphere(Float.parseFloat(args[0]));	//creating instance
    cub = new Cube(Float.parseFloat(args[0]));		//creating instance

    if(args.length==1){ //if no units are inputed
		System.out.printf("Area of a circle with %s radius:%1.0f\n", args[0],cir.getArea());
		System.out.printf("Surface area of a sphere with %s radius:%1.0f\n", args[0],sph.getArea());
		System.out.printf("Area of a square with %s side:%1.0f\n", args[0],sqa.getArea());
		System.out.printf("Surface area of a cube with %s side:%1.0f\n", args[0],cub.getArea());
		System.out.printf("Volume of a sphere with %s radius:%1.0f\n", args[0],sph.getVolume());
		System.out.printf("Volume of a cube with %s side:%1.0f\n", args[0],cub.getVolume());
	}
	else if(args[1].equals("cm") || args[1].equals("mm") || args[1].equals("m")){ //if correct units are entered
    System.out.printf("Area of a circle with %s %s radius:%1.0f %s\u00B2\n", args[0],args[1],cir.getArea() , args[1]);
    System.out.printf("Surface area of a sphere with %s %s radius:%1.0f %s\u00B2\n", args[0],args[1],sph.getArea() , args[1]);
    System.out.printf("Area of a square with %s %s side:%1.0f %s\u00B2\n", args[0],args[1],sqa.getArea() , args[1]);
    System.out.printf("Surface area of a cube with %s %s side:%1.0f %s\u00B2\n", args[0],args[1],cub.getArea() , args[1]);
    System.out.printf("Volume of a sphere with %s %s radius:%1.0f %s\u00B3\n", args[0],args[1],sph.getVolume() , args[1]);
    System.out.printf("Volume of a cube with %s %s side:%1.0f %s\u00B3\n", args[0],args[1],cub.getVolume() , args[1]);
	}
	else{ //if unacceptabel units are entered
		System.out.printf("Unacceptable unit '%s' entered.Only values will be printed.acceptable units = 'mm' | 'cm' | 'm'\n", args[1]);
		System.out.printf("Area of a circle with %s radius:%1.0f\n", args[0],cir.getArea());
		System.out.printf("Surface area of a sphere with %s radius:%1.0f\n", args[0],sph.getArea());
		System.out.printf("Area of a square with %s side:%1.0f\n", args[0],sqa.getArea());
		System.out.printf("Surface area of a cube with %s side:%1.0f\n", args[0],cub.getArea());
		System.out.printf("Volume of a sphere with %s radius:%1.0f\n", args[0],sph.getVolume());
		System.out.printf("Volume of a cube with %s side:%1.0f\n", args[0],cub.getVolume());
	}
  
  }
  
}

class Circle {
  private double area;
  private double radius;
  // Implement A
  public Circle(){
    this.radius =0;
  }
  public Circle(double r){
    this.radius = r;
  }
  public double getArea(){
	  area = Math.PI*Math.pow(radius,2);
    return area;
  }
}

class Square {
  private double area;
  private double length;
  // Implement A
  public Square(){
    length = 0;
  }
  
  public Square(double l){
    length = l;
  }
  public double getArea(){
    area = Math.pow(length,2);
    return area;
  }
}

class Sphere {
  private double surfaceArea;
  private double volume;
  private double radius;
  // Implement A
  public Sphere(){
    radius =0;
  }
  public Sphere(double r){
    radius = r;
  }
  public double getArea(){
    surfaceArea = 4*Math.PI*Math.pow(radius,2);
    return surfaceArea;
  }
  // Implement B
  public double getVolume(){
    volume = 4*Math.PI*Math.pow(radius,3)/3;
    return volume;
  }
}

class Cube {
  private double surfaceArea;
  private double volume;
  private double length;
  // Implement A
  public Cube(){
    length = 0;
  }
  
  public Cube(double l){
    length = l;
  }
  public double getArea(){
    surfaceArea = Math.pow(length,2)*6;
    return surfaceArea;
  }
  // Implement B
  public double getVolume(){
    volume = Math.pow(length,3);
    return volume;
  }
}