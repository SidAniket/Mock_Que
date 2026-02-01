package namepattern;
import java.util.*;
public class MainClass {
    public static void main(String args[]){
        NamePattern obj = new NamePattern();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        obj.pattern(name);

    }
}
