import java.util.Scanner;

class prime {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i, n, count = 0;
    System.out.println("enter number to check that it is prime or not : ");
    n = sc.nextInt();
    i = 1;
    while (i <= n) {
      if (n % i == 0)
        count = count + 1;
      i = i + 1;
    }
    if (count == 2)
      System.out.println("the given number is prime no. ");
    else
      System.out.println("the given numer is not prime number");
  }
}
