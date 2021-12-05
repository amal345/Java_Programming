import java.util.*;

class Rectangle {
    double length;
    double breadth;

    void setData(double l, double b) {
        length = l;
        breadth = b;
    }

    double getArea() {
        double area;
        area = length * breadth;
        return area;
    }
}

class java2_Rectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double Area, l, b;
        Rectangle R1 = new Rectangle();
        System.out.println("Enter the length and breadth of reactangle:");
        l = sc.nextInt();
        b = sc.nextInt();
        R1.setData(l, b);
        Area = R1.getArea();
        System.out.println("Area of Rectangle,R1 = " + Area);
        Rectangle R2 = new Rectangle();
        R2.setData(10.5, 9);
        Area = R2.getArea();
        System.out.println("Area of Rectangle,R2 = " + Area);
        Rectangle R3 = new Rectangle();
        R3.setData(13, 14);
        Area = R3.getArea();
        System.out.println("Area of Rectangle,R3 = " + Area);
        sc.close();
    }
}