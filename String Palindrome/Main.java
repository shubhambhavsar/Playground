import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int str_len = str.length();
    int end = str_len - 1;
    int front = 0;
    boolean is_pelindrome = true;
    while(front<end){
      if(str.charAt(front) != str.charAt(end))
      {
        is_pelindrome = false;
        break;
      }
      front++;
      end--;
    }
    if(is_pelindrome == true)
    {
     System.out.print("Yes");
    }
      else
      {
        System.out.print("No");
      }
  }
}

