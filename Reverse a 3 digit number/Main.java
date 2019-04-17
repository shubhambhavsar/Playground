import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int num= in.nextInt();
    int first= num / 100;
    int second= num / 10 % 10;
    int third= num % 10;
    System.out.println(third*100+second*10+first);
  }
}