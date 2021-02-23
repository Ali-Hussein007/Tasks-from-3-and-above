/**
 * Created by Ali on 22/02/2021.
 */
public class GenericArrayReverse {

    public static void main(String[] args) {
        String[] names = { "ALI", "IS", "NAME" ,"MY"};
        Integer[] number={1,2,3,4};

        printArray(names);
        printArray(number);
    }
    public static <T> void printArray(T [] array) {
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");

    }
}
