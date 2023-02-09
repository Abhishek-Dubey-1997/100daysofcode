import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int st=1;
        int sp=n-1;
        for(int i=0;i<n;i++) // for rows
        {
            for(int j=1;j<=sp;j++) // to print the spaces before star
            {
                System.out.print("\t");
            }
            for(int k=1;k<=st;k++) // to print the stars
            {
                System.out.print("*\t");
            }

            sp--;
            st++;
            System.out.println();
        }
    }
}
