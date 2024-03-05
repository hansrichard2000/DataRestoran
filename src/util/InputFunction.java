package util;

import java.util.Scanner;

public class InputFunction {
    static Scanner scan = new Scanner(System.in);
    
    public static String getStringInput(String label){
        System.out.print(label);
        String input = scan.next() + scan.nextLine();
        return input;
    }

    public static int getIntegerInput(String label){
        System.out.print(label);
        int input = scan.nextInt();
        return input;
    }
}
