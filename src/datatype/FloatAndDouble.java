package datatype;

import java.util.Scanner;

public class FloatAndDouble {
    public float a;
    public double b;

    public void get_float_value(){
        System.out.print("Enter floating point number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
    }
    public void get_double_value(){
        System.out.print("Enter double number: ");
        Scanner sc = new Scanner(System.in);
        b = sc.nextDouble();
    }

    public void get_float(){
        System.out.print("The floating point number is : ");
        System.out.println(a);
    }

    public void get_double(){
        System.out.print("The double point number is : ");
        System.out.println(b);
    }
}
