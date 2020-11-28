import java.util.Scanner;

 class Smith11 {
 public static void main(String args[])

 {
  int i, n, num;
  int a[] = new int[100];

  int k = 0, sum1 = 0, sum2 = 0;
  int digit;

  Scanner in = new Scanner(System.in);
  System.out.println("\nEnter a number: ");

  n = in.nextInt();
  num = n;
  while (num != 0) {
   digit = num % 10;
   sum1 += digit;
   num /= 10;
  }
  num = n;
  for (i = 2; i < n; i++) {
   while (num % i == 0) {
    a[k] = i;
    k++;
    num /= i;
   }

  }
  System.out.println("Prime Factorisation");
  for (i = 0; i < k; i++)
   System.out.print(a[i] + " ");
  for (i = 0; i < k; i++) {
   while (a[i] != 0) {
    digit = a[i] % 10;
    sum2 += digit;
    a[i] /= 10;
   }
  }
  System.out.println("\nSum of digits of the number: " + sum1);
  System.out.println("\nSum of digits of the prime factors: " + sum2);
  if (sum1 == sum2)
   System.out.println("It is a Smith Number.");
  else
   System.out.println("It is not a Smith Number.");

 }
 }


