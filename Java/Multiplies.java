import java.util.Scanner;
class Multiplies{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1%n2==0) {
            System.out.println(n1+"is a multiple of "+ n2 + " and the result is " + (n1 / n2));
        }else{
            System.out.println(n1 + " is not a multiple of " + n2);
    }
        scanner.close();
    }
}