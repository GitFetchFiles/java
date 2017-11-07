import java.util.*;
public class power {

    public static void main(String[] args) {
        int base, powerRaised;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number and then the power");
        base=sc.nextInt();
        powerRaised=sc.nextInt();
        int result = powers(base, powerRaised);
        System.out.printf("%d^%d = %d", base, powerRaised, result);
    }

    public static int powers(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * powers(base, powerRaised - 1));
        else
            return 1;
    }
}