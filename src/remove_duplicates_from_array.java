import java.util.*;

public class remove_duplicates_from_array {
    public int removeDuplicates(int[] arr) {
        if(arr.length==0)
            return 0;
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
class Main0{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        remove_duplicates_from_array rda= new remove_duplicates_from_array();
        int k= rda.removeDuplicates(arr);
        for (int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}