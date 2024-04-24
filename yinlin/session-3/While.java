import java.util.Scanner;

public class While {
  
  public static boolean isPrime(int number) {
    for(int i = 2; i < number; i++) {
      if (i != number && number%i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void getEvens (int n) {
    do {
      if (isOdd(n) == false) {
        System.out.println(n);
      }
      n--;
    } while (n > 0);
  }

  public static boolean isOdd (int number) {
    return number%2 == 0;
  } 

  public static void getOdds() {
    for(int i = 1; i <= 30; i++) {
      if (isOdd(i)) {
        System.out.println(i);
      }
    }

    // int count = 1;
    // while (count <= 30) {
    //   if (isOdd(count)) {
    //     System.out.println(count);
    //   }
    //   count++;
    // }
  }

  public static void main(String[] args) {
    // int count = 0;
    // int[] arr = {2, 2 , 2};

    // while (count < 10) {
    //   System.out.println("Hello, " + count);
    //   count++;
    // }

    Scanner scan = new Scanner(System.in);

    int limit = scan.nextInt();
    System.out.println("");
    getEvens(limit);
    scan.close();
    // getOdds();
  }
}
