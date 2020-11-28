/* Java Program - Sort Strings */
import java.util.Scanner;
class selectionsort
{
   static Scanner sc = new Scanner(System.in);//declaring scanner object
    String name[];
    int n,i,j;
    String temp;
    selectionsort(int size)
    {
        n=size;
        name=new String[n];
        temp=" ";
        i=0;
    }

    void readata()
    {

        System.out.print("Enter Names/Words : ");
        for(i=0; i<n; i++)
        {
            name[i] = sc.next();//accepting 5 strings
        }
    }

    void sort()
    {
        for(i=0; i<n-1; i++)
        {
            for(j=i+1; j<n; j++)
            {
                if(name[i].compareTo(name[j])>0)//arranging the strings alphabetically
                {
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
    }

    void display()
    {
        System.out.print("Words/Names Sorted in Alphabetical Order Successfully..!!");
        System.out.println("\nNow the List is :\n");
        for(i=0;i<n;i++){
            System.out.println(name[i]);//printing the sorted list
        }
    }

    public static void main(String args[])
    {
        System.out.println("Enter the number of names");
        int a=sc.nextInt();
        selectionsort obj=new selectionsort(a);
        obj.readata();
        obj.sort();
        obj.display();
    }
}	