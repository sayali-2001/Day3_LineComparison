package NewPackage;

import java.util.Scanner;

public class UseCase1 {

    public static void main(String[] args) {

        int x1,x2;
        int y1,y2;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the X and Y co-ordinates for first point  : ");
        x1=scanner.nextInt();
        y1=scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for second point  :");
        x2=scanner.nextInt();
        y2=scanner.nextInt();

        float line1 = (float) Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println("Length of line 1 is : "+line1);

    }
}
