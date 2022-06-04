import java.util.Scanner;

public class move_zeroes {
        public void moveZeroes(int[] nums) {
            for(int i=0, j=0 ; i<nums.length && j<nums.length;i++){
                if(nums[i]!=0){
                    int t= nums[j];
                    nums[j++]=nums[i];
                    nums[i]=t;
                }
            }
        }
}
class m{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       int[] arr= new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       move_zeroes mz= new move_zeroes();
       mz.moveZeroes(arr);
       for (int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
    }
}