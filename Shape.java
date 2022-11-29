import java.util.*;
import java.lang.*;

public class Shape implements Maths{

    public double area;
    public double volume;
    public double perimeter;
    public double length;
    public double breadth;
    public double height;
    public double side;
    public double radius;
    public double circumference;
    public double parallel1,parallel2;
    public double base;
    public double diagonal;
    public double diagonal2;
    public double totalSurfaceArea;
    public double lateralSurfaceArea;
    public double curvedSurfaceArea;



    public double rectangleArea(double l, double b){

        length = l;

        breadth = b;

        area = length*breadth;

        return area;

    }


    public double rectanglePerimeter(double l, double b){

        length = l;

        breadth = b;

        perimeter = 2*(length+breadth);

        return perimeter;

    }


    public double squareArea(double s){

        side = s;

        area = Math.pow(side,2);

        return area;

    }


    public double squarePerimeter(double s){

        side = s;

        perimeter = 4*side;

        return perimeter;

    }


    public double rhombusArea(double d1, double d2){

        diagonal = d1;

        diagonal2 = d2;

        area = 0.5*diagonal*diagonal2;

        return area;

    }


    public double rhombusPerimeter(double s){

        side = s;

        perimeter = 4*side;

        return perimeter;

    }


    public double triangleAreaIfBaseHeight(double base, double height){

        this.base = base;

        this.height = height;

        area = 0.5*this.base*this.height;

        return area;

    }


    public double trianglePerimeter(double sideA, double sideB, double sideC){

        perimeter = sideA + sideB + sideC;

        return perimeter;

    }


    public double triangleAreaIfAllSides(double sideA, double sideB, double sideC){

        double semiPerimeter = trianglePerimeter(sideA, sideB, sideC) * 0.5;

        area = Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));

        return area;

    }


    public double circleArea(double r){

        radius = r;

        area = pi*Math.pow(radius,2);

        return area;

    }


    public double circleCircumference(double r){

        radius = r;

        circumference = 2*pi*radius;

        return circumference;

    }


    public double parallelogramArea(double b, double h){

        base = b;

        height = h;

        area = base*height;

        return area;

    }


    public double parallelogramPerimeter(double l, double b){

        length = l;

        breadth = b;

        perimeter = rectanglePerimeter(length, breadth);

        return perimeter;

    }


    public double parallelogramAreaIfTwoSidesDiagonal(double l, double b, double d){

        length = l;

        breadth = b;

        diagonal = d;

        area = triangleAreaIfAllSides(length,breadth,diagonal)*2;

        return area;

    }


    public double trapeziumArea(double p1, double p2, double h){

        parallel1 = p1;

        parallel2 = p2;

        height = h;

        area = 0.5*h*(parallel1+parallel2);

        return area;

    }


    public double quadrilateralPerimeter(double sideA, double sideB, double sideC, double sideD){

        perimeter = sideA+sideB+sideC+sideD;

        return perimeter;

    }


    public double cuboidVolume(double l, double b, double h){

        length = l;

        breadth = b;

        height = h;

        volume = length*breadth*height;

        return volume;

    }


    public double cuboidTSA(double l, double b, double h){

        length = l;

        breadth = b;

        height = h;

        totalSurfaceArea = 2*(length*breadth + breadth*height + height*length);

        return totalSurfaceArea;

    }


    public double cuboidLSA(double l, double b, double h){

        length = l;

        breadth = b;

        height = h;

        lateralSurfaceArea = 2*height*(length+breadth);

        return lateralSurfaceArea;

    }


    public double cubeVolume(double s){

        side = s;

        volume = Math.pow(side, 3);

        return volume;

    }


    public double cubeTSA(double s){

        side = s;

        totalSurfaceArea = 6*Math.pow(side,2);

        return totalSurfaceArea;

    }


    public double cubeLSA(double s){

        side = s;

        lateralSurfaceArea = 4*Math.pow(side,2);

        return lateralSurfaceArea;

    }


    public double sphereVolume(double r){

        radius = r;

        volume = (4/3)*pi*Math.pow(radius,3);

        return volume;

    }


    public double sphereCSA(double r){

        radius = r;

        curvedSurfaceArea = 4*circleArea(radius);

        return curvedSurfaceArea;

    }


    public double cylinderVolume(double r, double h){

        radius = r;

        height = h;

        volume = circleArea(radius)*height;

        return volume;

    }


    public double cylinderTSA(double r, double h){

        radius = r;

        height = h;

        totalSurfaceArea = 2*pi*radius*(radius+height);

        return totalSurfaceArea;

    }


    public double cylinderCSA(double r, double h){

        radius = r;

        height = h;

        curvedSurfaceArea = circleCircumference(radius)*height;

        return curvedSurfaceArea;

    }


    public double coneVolume(double r, double h){

        radius = r;

        height = h;

        volume = circleArea(radius)*h/3;

        return volume;

    }


    public double coneTSA(double r, double h){

        radius = r;

        height = h;

        totalSurfaceArea = pi*radius*(r+Math.sqrt(Math.pow(height,2)+Math.pow(radius,2)));

        return totalSurfaceArea;

    }


    public double coneCSA(double r, double h){

        radius = r;

        height = h;

        curvedSurfaceArea = pi*radius*Math.sqrt(Math.pow(height,2)+Math.pow(radius,2));

        return curvedSurfaceArea;

    }





    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        for(int i = 0; i>-1; i++){

            System.out.println("Enter 1 for 2D\nEnter 2 for 3D");
            int dimensionInput = in.nextInt();

            if(dimensionInput == 1){

                System.out.println("Choose a Shape\nRectangle\nSquare\nRhombus\nTriangle\nCircle\nParallelogram\nTrapezium");
                String twoDInput = in.next();

                if(twoDInput.equalsIgnoreCase("rectangle")){

                    Shape rectangle = new Shape();

                    System.out.println("Enter 1 for Area\nEnter 2 for Perimeter\nEnter 3 for both");
                    int rectInput = in.nextInt();

                    System.out.println("Please type in the length of the rectangle");
                    double lenRect = in.nextDouble();

                    System.out.println("Please type in the breadth of the rectangle");
                    double bredRect = in.nextDouble();

                    if(rectInput == 1){

                        System.out.println("The area of this rectangle is " + rectangle.rectangleArea(lenRect,bredRect));

                    }

                    else if(rectInput == 2){

                        System.out.println("The perimeter of this rectangle is " + rectangle.rectanglePerimeter(lenRect,bredRect));

                    }
                    else if(rectInput == 3){

                        System.out.println("The area of this rectangle is " + rectangle.rectangleArea(lenRect,bredRect));

                        System.out.println("The perimeter of this rectangle is " + rectangle.rectanglePerimeter(lenRect,bredRect));

                    }

                    else{

                        System.out.println("Wrong input. Try again.");

                    }

                }


                else if(twoDInput.equalsIgnoreCase("square")){

                    Shape square = new Shape();

                    System.out.println("Enter 1 for Area\nEnter 2 for Perimeter\nEnter 3 for both");
                    int squareInput = in.nextInt();

                    System.out.println("Please type in the length of the side of the square.");
                    double sideSquare = in.nextDouble();

                    if(squareInput == 1){

                        System.out.println("The area of this square is " + square.squareArea(sideSquare));

                    }

                    else if(squareInput == 2){

                        System.out.println("The perimeter of this square is " + square.squarePerimeter(sideSquare));

                    }

                    else if(squareInput == 3){

                        System.out.println("The area of this square is " + square.squareArea(sideSquare));
                        System.out.println("The perimeter of this square is " + square.squarePerimeter(sideSquare));

                    }

                    else{

                        System.out.println("Wrong input. Try again.");

                    }

                }


                else if(twoDInput.equalsIgnoreCase("rhombus")){

                    Shape rhombus = new Shape();

                    System.out.println("Enter 1 for Area\nEnter 2 for Perimeter\nEnter 3 for both");
                    int rhombusInput = in.nextInt();

                    if(rhombusInput == 1){

                        System.out.println("Please type in the length of the first diagonal of this rhombus.");
                        double d1Rhombus = in.nextDouble();

                        System.out.println("Please type in the length of the second diagonal of this rhombus.");
                        double d2Rhombus = in.nextDouble();

                        System.out.println("The area of this rhombus is " + rhombus.rhombusArea(d1Rhombus, d2Rhombus));

                    }

                    else if(rhombusInput == 2){

                        System.out.println("Please type in the length of the side of this rhombus.");
                        double sideRhombus = in.nextDouble();

                        System.out.println("The perimeter of this rhombus is " + rhombus.rhombusPerimeter(sideRhombus));

                    }

                    else if(rhombusInput == 3){

                        System.out.println("Please type in the length of the side of this rhombus.");
                        double sideRhombus = in.nextDouble();

                        System.out.println("Please type in the length of the first diagonal of this rhombus.");
                        double d1Rhombus = in.nextDouble();

                        System.out.println("Please type in the length of the second diagonal of this rhombus.");
                        double d2Rhombus = in.nextDouble();

                        System.out.println("The area of this rhombus is " + rhombus.rhombusArea(d1Rhombus, d2Rhombus));

                        System.out.println("The perimeter of this rhombus is " + rhombus.rhombusPerimeter(sideRhombus));

                    }

                    else{

                        System.out.println("Wrong input. Try again.");

                    }

                }


                else if(twoDInput.equalsIgnoreCase("triangle")){

                    Shape triangle = new Shape();

                    System.out.println("Enter 1 for Area\nEnter 2 for Perimeter\nEnter 3 for both");
                    int triangleInput = in.nextInt();

                    if(triangleInput == 1){

                        System.out.println("Enter 1 if you have the base and height of the triangle.\nEnter 2 if you have the measures of all the sides of the triangle");
                        int triangleAreaInput = in.nextInt();

                        if(triangleAreaInput == 1){

                            System.out.println("Please enter the dimension of the base of this triangle.");
                            double baseTriangle = in.nextDouble();

                            System.out.println("Please enter the dimension of the height of this triangle");
                            double heightTriangle = in.nextDouble();

                            System.out.println("The area of this triangle is " + triangle.triangleAreaIfBaseHeight(baseTriangle, heightTriangle));

                        }

                        else if(triangleAreaInput == 2){

                            System.out.println("Please enter the dimension of the first side of this triangle.");
                            double side1 = in.nextDouble();

                            System.out.println("Please enter the dimension of the second side of this triangle");
                            double side2 = in.nextDouble();

                            System.out.println("Please enter the dimension of the third side of this triangle");
                            double side3 = in.nextDouble();

                            System.out.println("The area of this triangle is " + triangle.triangleAreaIfAllSides(side1, side2, side3));

                        }

                        else{

                            System.out.println("Wrong input. Try again");

                        }

                    }

                    else if(triangleInput == 2){

                        System.out.println("Please enter the dimension of the first side of this triangle.");
                        double side1 = in.nextDouble();

                        System.out.println("Please enter the dimension of the second side of this triangle");
                        double side2 = in.nextDouble();

                        System.out.println("Please enter the dimension of the third side of this triangle");
                        double side3 = in.nextDouble();

                        System.out.println("The perimeter of this triangle is " + triangle.trianglePerimeter(side1, side2, side3));

                    }

                    else if(triangleInput == 3){

                        System.out.println("Please enter the dimension of the first side of this triangle.");
                        double side1 = in.nextDouble();

                        System.out.println("Please enter the dimension of the second side of this triangle");
                        double side2 = in.nextDouble();

                        System.out.println("Please enter the dimension of the third side of this triangle");
                        double side3 = in.nextDouble();

                        System.out.println("The area of this triangle is " + triangle.triangleAreaIfAllSides(side1, side2, side3));

                        System.out.println("The perimeter of this triangle is " + triangle.trianglePerimeter(side1, side2, side3));

                    }

                    else{

                        System.out.println("Wrong input. Try again.");

                    }

                }


                else if(twoDInput.equalsIgnoreCase("circle")){

                    Shape circle = new Shape();

                    System.out.println("Enter 1 for Area\nEnter 2 for Circumference\nEnter 3 for both.");
                    int circleInput = in.nextInt();

                    System.out.println("Please type in the radius of this circle");
                    double radCircle = in.nextDouble();

                    if(circleInput == 1){

                        System.out.println("The area of this rectangle is " + circle.circleArea(radCircle));

                    }
                    else if(circleInput == 2){

                        System.out.println("The area of this rectangle is " + circle.circleCircumference(radCircle));

                    }
                    else if(circleInput == 3){

                        System.out.println("The area of this rectangle is " + circle.circleArea(radCircle));

                        System.out.println("The area of this rectangle is " + circle.circleCircumference(radCircle));

                    }

                    else{

                        System.out.println("Wrong input. Try again.");

                    }

                }


                else if(twoDInput.equalsIgnoreCase("parallelogram")){

                    Shape parallelogram = new Shape();

                    System.out.println("Enter 1 for Area\nEnter 2 for Perimeter\nEnter 3 for both.");
                    int pgInput = in.nextInt();

                    if(pgInput == 1){

                        System.out.println("Enter 1 if you have the base and height of the parallelogram\nEnter 2 if you have the length, breadth and dimension of a diagonal of the parallelogram");
                        int pgAreaInput = in.nextInt();

                        if(pgAreaInput == 1){

                            System.out.println("Please type in the dimension of the base of the parallelogram");
                            double basePG = in.nextDouble();

                            System.out.println("Please type in the height of the parallelogram");
                            double heightPG = in.nextDouble();

                            System.out.println("The area of this parallelogram is " + parallelogram.parallelogramArea(basePG,heightPG));

                        }

                        else if(pgAreaInput == 2){

                            System.out.println("Please type in the length of the parallelogram");
                            double lenPG = in.nextDouble();

                            System.out.println("Please type in the breadth of the parallelogram");
                            double bredPG = in.nextDouble();

                            System.out.println("Please type in the dimension of one of the diagonals of the parallelogram");
                            double diagPG = in.nextDouble();

                            System.out.println("The area of this parallelogram is " + parallelogram.parallelogramAreaIfTwoSidesDiagonal(lenPG,bredPG,diagPG));

                        }

                        else{

                            System.out.println("Wrong input. Try again.");

                        }

                    }

                    else if(pgInput == 2){

                        System.out.println("Please type in the length of the parallelogram");
                        double lenPG = in.nextDouble();

                        System.out.println("Please type in the breadth of the parallelogram");
                        double bredPG = in.nextDouble();

                        System.out.println("The perimeter of this parallelogram is " + parallelogram.parallelogramPerimeter(lenPG,bredPG));

                    }
                    else if(pgInput == 3){

                        System.out.println("Enter 1 if you have the base and height of the parallelogram\nEnter 2 if you have the length, breadth and dimension of a diagonal of the parallelogram");
                        int pgAreaInput3 = in.nextInt();

                        if(pgAreaInput3 == 1){

                            System.out.println("Please type in the length of the parallelogram");
                            double lenPG = in.nextDouble();

                            System.out.println("Please type in the breadth of the parallelogram");
                            double bredPG = in.nextDouble();

                            System.out.println("Please type in the height of the parallelogram");
                            double heightPG = in.nextDouble();

                            System.out.println("The area of this parallelogram is " + parallelogram.parallelogramArea(lenPG,heightPG));

                            System.out.println("The perimeter of this parallelogram is " + parallelogram.parallelogramPerimeter(lenPG,bredPG));

                        }
                        else if(pgAreaInput3 == 2){

                            System.out.println("Please type in the length of the parallelogram");
                            double lenPG = in.nextDouble();

                            System.out.println("Please type in the breadth of the parallelogram");
                            double bredPG = in.nextDouble();

                            System.out.println("Please type in the dimension of one of the diagonals of the parallelogram");
                            double diagPG = in.nextDouble();

                            System.out.println("The area of this parallelogram is " + parallelogram.parallelogramAreaIfTwoSidesDiagonal(lenPG,bredPG,diagPG));

                            System.out.println("The perimeter of this parallelogram is " + parallelogram.parallelogramPerimeter(lenPG,bredPG));

                        }

                        else{

                            System.out.println("Wrong input. Try again.");

                        }

                    }


                    else{

                        System.out.println("Wrong input. Try again.");

                    }

                }



                else if(twoDInput.equalsIgnoreCase("trapezium")){

                    Shape trapezium = new Shape();

                    System.out.println("Enter 1 for Area\nEnter 2 for Perimeter\nEnter 3 for both");
                    int trapInput = in.nextInt();

                    System.out.println("Please type in the dimension of the first parallel side of the trapezium");
                    double p1Trap = in.nextDouble();

                    System.out.println("Please type in the dimension of the second parallel side of the trapezium");
                    double p2Trap = in.nextDouble();

                    if(trapInput == 1){

                        System.out.println("Please type in the height of the trapezium");
                        double heightTrap = in.nextDouble();

                        System.out.println("The area of this rectangle is " + trapezium.trapeziumArea(p1Trap,p2Trap,heightTrap));

                    }

                    else if(trapInput == 2){

                        System.out.println("Please type in the dimension of the first non-parallel side of the trapezium");
                        double np1Trap = in.nextDouble();

                        System.out.println("Please type in the dimension of the second non-parallel side of the trapezium");
                        double np2Trap = in.nextDouble();

                        System.out.println("The perimeter of this trapezium is " + trapezium.quadrilateralPerimeter(p1Trap,p2Trap,np1Trap,np2Trap));

                    }

                    else if(trapInput == 3){

                        System.out.println("Please type in the dimension of the first non-parallel side of the trapezium");
                        double np1Trap = in.nextDouble();

                        System.out.println("Please type in the dimension of the second non-parallel side of the trapezium");
                        double np2Trap = in.nextDouble();

                        System.out.println("Please type in the height of the trapezium");
                        double heightTrap = in.nextDouble();

                        System.out.println("The area of this rectangle is " + trapezium.trapeziumArea(p1Trap,p2Trap,heightTrap));

                        System.out.println("The perimeter of this trapezium is " + trapezium.quadrilateralPerimeter(p1Trap,p2Trap,np1Trap,np2Trap));

                    }

                    else{

                        System.out.println("Wrong input. Try again.");

                    }

                }


                else{

                    System.out.println("Wrong input. Try Again.");

                }

            }





            else if(dimensionInput == 2){

                System.out.println("Choose a Shape\nCuboid\nCube\nSphere\nCylinder\nCone");
                String threeDInput = in.next();


                if(threeDInput.equalsIgnoreCase("cuboid")){

                    Shape cuboid = new Shape();

                    System.out.println("Enter 1 for Volume\nEnter 2 for Total Surface Area\nEnter 3 for Lateral Surface Area\nEnter 4 for all");
                    int cuboidInput = in.nextInt();

                    System.out.println("Please enter the length of the cuboid.");
                    double lenCuboid = in.nextDouble();

                    System.out.println("Please enter the breadth of the cuboid.");
                    double bredCuboid = in.nextDouble();

                    System.out.println("Please enter the height of the cuboid.");
                    double heightCuboid = in.nextDouble();

                    if(cuboidInput == 1){

                        System.out.println("The volume of this cuboid is " + cuboid.cuboidVolume(lenCuboid,bredCuboid,heightCuboid));

                    }
                    else if(cuboidInput == 2){

                        System.out.println("The total surface area of this cuboid is " + cuboid.cuboidTSA(lenCuboid,bredCuboid,heightCuboid));

                    }

                    else if(cuboidInput == 3){

                        System.out.println("The lateral surface area of this cuboid is " + cuboid.cuboidLSA(lenCuboid,bredCuboid,heightCuboid));

                    }

                    else if(cuboidInput == 4){

                        System.out.println("The volume of this cuboid is " + cuboid.cuboidVolume(lenCuboid,bredCuboid,heightCuboid));

                        System.out.println("The total surface area of this cuboid is " + cuboid.cuboidTSA(lenCuboid,bredCuboid,heightCuboid));

                        System.out.println("The lateral surface area of this cuboid is " + cuboid.cuboidLSA(lenCuboid,bredCuboid,heightCuboid));

                    }

                    else{

                        System.out.println("Wrong input. Try again");

                    }

                }


                else if(threeDInput.equalsIgnoreCase("cube")){

                    Shape cube = new Shape();

                    System.out.println("Enter 1 for Volume\nEnter 2 for Total Surface Area\nEnter 3 for Lateral Surface Area\nEnter 4 for all");
                    int cubeInput = in.nextInt();

                    System.out.println("Please enter the dimension of the side of this cube");
                    double sideCube = in.nextDouble();

                    if(cubeInput == 1){

                        System.out.println("The volume of this cube is " + cube.cubeVolume(sideCube));

                    }

                    else if(cubeInput == 2){

                        System.out.println("The total surface area of this cube is " + cube.cubeTSA(sideCube));

                    }

                    else if(cubeInput == 3){

                        System.out.println("The lateral surface area of this cube is " + cube.cubeLSA(sideCube));

                    }

                    else if(cubeInput == 4){

                        System.out.println("The volume of this cuboid is " + cube.cubeVolume(sideCube));

                        System.out.println("The total surface area of this cube is " + cube.cubeTSA(sideCube));

                        System.out.println("The lateral surface area of this cube is " + cube.cubeLSA(sideCube));

                    }

                    else{

                        System.out.println("Wrong input. Try again");

                    }

                }


                else if(threeDInput.equalsIgnoreCase("sphere")){

                    Shape sphere = new Shape();

                    System.out.println("Enter 1 for Volume\nEnter 2 for Curved Surface Area\nEnter 3 for both");
                    int sphereInput = in.nextInt();

                    System.out.println("Please enter the radius of the sphere");
                    double radSphere = in.nextDouble();

                    if(sphereInput == 1){

                        System.out.println("The volume of this sphere is " + sphere.sphereVolume(radSphere));

                    }

                    else if(sphereInput == 2){

                        System.out.println("The curved surface area of this sphere is " + sphere.sphereCSA(radSphere));

                    }

                    else if(sphereInput == 3){

                        System.out.println("The volume of this sphere is " + sphere.sphereVolume(radSphere));

                        System.out.println("The curved surface area of this sphere is " + sphere.sphereCSA(radSphere));

                    }

                    else{

                        System.out.println("Wrong input. Try again");

                    }

                }


                else if(threeDInput.equalsIgnoreCase("cylinder")){

                    Shape cylinder = new Shape();

                    System.out.println("Enter 1 for Volume\nEnter 2 for Total Surface Area\nEnter 3 for Curved Surface Area\nEnter 4 for all");
                    int cylinderInput = in.nextInt();

                    System.out.println("Please enter the radius of the cylinder.");
                    double radCylinder = in.nextDouble();

                    System.out.println("Please enter the height of the cylinder.");
                    double heightCylinder = in.nextDouble();

                    if(cylinderInput == 1){

                        System.out.println("The volume of this cylinder is " + cylinder.cylinderVolume(radCylinder,heightCylinder));

                    }

                    else if(cylinderInput == 2){

                        System.out.println("The total surface area of this cylinder is " + cylinder.cylinderTSA(radCylinder,heightCylinder));

                    }

                    else if(cylinderInput == 3){

                        System.out.println("The curved surface area of this cylinder is " + cylinder.cylinderCSA(radCylinder,heightCylinder));

                    }

                    else if(cylinderInput == 4){

                        System.out.println("The volume of this cylinder is " + cylinder.cylinderVolume(radCylinder,heightCylinder));

                        System.out.println("The total surface area of this cylinder is " + cylinder.cylinderTSA(radCylinder,heightCylinder));

                        System.out.println("The curved surface area of this cylinder is " + cylinder.cylinderCSA(radCylinder,heightCylinder));

                    }

                    else{

                        System.out.println("Wrong input. Try again");

                    }

                }


                else if(threeDInput.equalsIgnoreCase("cone")){

                    Shape cone = new Shape();

                    System.out.println("Enter 1 for Volume\nEnter 2 for Total Surface Area\nEnter 3 for Curved Surface Area\nEnter 4 for both");
                    int coneInput = in.nextInt();

                    System.out.println("Please enter the radius of the cone");
                    double radCone = in.nextDouble();

                    System.out.println("Please enter the height of the cone");
                    double heightCone = in.nextDouble();

                    if(coneInput == 1){

                        System.out.println("The volume of this cone is " + cone.coneVolume(radCone,heightCone));

                    }

                    else if(coneInput == 2){

                        System.out.println("The total surface area of this cone is " + cone.coneTSA(radCone,heightCone));

                    }

                    else if(coneInput == 3){

                        System.out.println("The curved surface area of this cone is " + cone.coneCSA(radCone,heightCone));

                    }

                    else if(coneInput == 4){

                        System.out.println("The volume of this cone is " + cone.coneVolume(radCone,heightCone));

                        System.out.println("The total surface area of this cone is " + cone.coneTSA(radCone,heightCone));

                        System.out.println("The curved surface area of this cone is " + cone.coneCSA(radCone,heightCone));

                    }

                    else{

                        System.out.println("Wrong input. Try again");

                    }

                }


                else{

                    System.out.println("Wrong input. Try Again.");

                }

            }



            else{

                System.out.println("Wrong input. Try again.");

            }





            for(int j = 0; j>-1;j++){

                System.out.println("Do you want to restart?\nAnswer in YES or NO.");
                String restartInput = in.next();

                if(restartInput.equalsIgnoreCase("NO")) {

                    j=-2;

                    i=-2;

                }

                else if(restartInput.equalsIgnoreCase("YES")){

                    j=-2;

                    i=0;

                }

                else{

                    System.out.println("Wrong input. Try again");

                    j=0;

                }
            }

        }

    }

}