import java.util.Scanner;

public class find_the_duplicate_no {
    public int duplicate(int[] arr){
        for(int i=1;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }

}
class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        find_the_duplicate_no fdn= new find_the_duplicate_no();
        int n= sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1;i<n+1;i++){
            arr[i]= sc.nextInt();
        }
        int a= fdn.duplicate(arr);
        System.out.println(a);
    }
}