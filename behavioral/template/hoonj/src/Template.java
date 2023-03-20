import coffe.Americano;
import coffe.Coffee;
import coffe.GreenTea;
import coffe.Latte;

import java.util.Scanner;

public class Template {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 아메리카노");
        System.out.println("2. 라때");
        System.out.println("3. 녹차");
        Coffee coffee = null;

        switch (sc.nextInt()){
            case 1:
                coffee = new Americano();
                break;
            case 2:
                coffee = new Latte();
                break;
            case 3:
                coffee = new GreenTea();
                break;
        }
        coffee.getCoffee();
    }
}
