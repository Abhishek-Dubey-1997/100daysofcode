import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();

        int st=1;
        int sp=n-1;

        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print("\t");
            }

            for(int k=1;k<=st;k++)
            {
                System.out.print("*\t");
            }

            st+=2;
            sp--;
            System.out.println();
        }

    }


}
