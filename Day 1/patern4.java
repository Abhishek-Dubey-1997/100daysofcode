import java.util.*;
public class patern4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int st=n;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=st;j++)
            {
              System.out.print("*\t");
            }
            st--;
            System.out.println();
        }
    }
}
