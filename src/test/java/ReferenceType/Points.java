package ReferenceType;

import java.awt.*;

public class Points {
    public static void main (String[] args){
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point2.x = 2;
        System.out.println(point2);
    }
}
