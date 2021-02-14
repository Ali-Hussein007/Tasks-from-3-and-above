/**
 * Created by Ali on 14/02/2021.
 */


 public class RepeatedArray2
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,2,5,6};

        boolean flag=false;

        for (int i =0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println("Repeated element = "+arr[i]);
                    flag=true;
                }
            }
        }
        if (flag==false)
        {
            System.out.println("No repeated element");
        }


    }
}
