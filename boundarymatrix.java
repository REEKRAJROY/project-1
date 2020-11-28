import java.io.*;
class boundarymatrix
{
    public static void main(String args[])throws IOException
    {
        int i,j,m,n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
        System.out.print("Enter the no. of  rows: "); //Inputting the number of rows
        m=Integer.parseInt(br.readLine());
        System.out.print("Enter the no. of columns: "); //Inputting the number of columns
        n=Integer.parseInt(br.readLine());
 
        int A[][]=new int[m][n]; //Creating the array
         
        /* Inputting the array */
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("Enter the elements: ");
                A[i][j]=Integer.parseInt(br.readLine());
            }
        }
         
        System.out.println("The Boundary Elements are:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0 || i == m-1 || j == n-1) //condition for accessing boundary elements
                    System.out.print(A[i][j]+"\t");
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }
    }
}