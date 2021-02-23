/**
 * Created by Ali on 23/02/2021.
 */
public class MergeArray <T> {
    public void merge(T[] array1,T[] array2)
    {
        int size=array1.length+array2.length;
        T[] array3;
        array3=(T[])new Object[size];

        for(int i=0;i<array1.length;i++)
        {
            array3[i]=array1[i];
            array3[i+array1.length]=array2[i];

        }

        for(int i=0;i<array3.length;i++)
        {
            System.out.println(array3[i]);
        }
    }
    public static void main(String[] args)
    {
        MergeArray<Object> m=new MergeArray();
        String[] a1={"Ali","Hussein"};
        Integer[] a2={1,2};
        m.merge(a1, a2);


    }

}