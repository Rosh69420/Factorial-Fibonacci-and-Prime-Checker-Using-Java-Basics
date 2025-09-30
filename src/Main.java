import java.util.Scanner;


public class Main {

    public static int factorial(int n){
        if(n ==1){
            return 1;
        }
        else
            return n * factorial(n-1);
    }
    public static void fibonacci(int n){
        int a = 0,b = 1;
        for (int i = 0; i<= n; i++){
            System.out.print(a + " ");
            int c = a+b;
            b = a;
            a = c;
        }
        System.out.println();
        System.out.println();
    }
    public static int primeChecker(int n){
        int flag = 0;
        for (int i = 2; i <= n/2; i++){

            if(n%i == 0){
                flag = 1;
                break;

            }
        }

        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input,n;
        boolean run = true;
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                Factorial Fibonacci & Prime Checker                     ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        while(run){

            System.out.println("1. To Check Factorial: ");
            System.out.println("2. To Check Fibonacci Up to n: ");
            System.out.println("3. To Check Prime Or Not: ");
            System.out.println("0. To Exit The Program: ");
            System.out.println();
            input = sc.nextInt();
            System.out.println();


            if(input == 0){
                System.out.println("Exiting The Program!!");
                run = false;
            }
            switch (input){

                case 1:  {
                    System.out.print("Enter Your Number: ");
                    n = sc.nextInt();
                    System.out.println("The factorial of " + n + " is " +factorial(n));
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.print("Enter Your N Number: ");
                    n = sc.nextInt();
                    fibonacci(n);
                    break;
                }
                case 3: {
                    System.out.print("Enter Your Number: ");
                    n = sc.nextInt();
                    int flag = primeChecker(n);
                    if(flag == 0){
                        System.out.println(n + " is a prime number.");
                    }
                    else {
                        System.out.println(n + " is not a prime number.");
                    }
                    System.out.println();
                    break;
                }
            }
        }


    }
}