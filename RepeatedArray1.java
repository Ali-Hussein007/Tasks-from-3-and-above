/**
 * Created by Ali on 14/02/2021.
 */
public class RepeatedArray1 {



    public static int findRepeat(int[] nums){

        if(nums.length <2){
            System.out.println("Array size is < 2");
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return 0;
    }
    public static void main(String args[]){


        int[] numbers = {22,56,23,22,11,77};
        int repNum = findRepeat(numbers);
        System.out.println("Repeated Number in Array : "+ repNum);
    }

}
