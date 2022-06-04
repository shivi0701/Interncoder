import java.util.Scanner;

public class sort_colours {
    public void sorted(int[] arr){           // insertion sort
        for(int i=0;i< arr.length;i++){
            int temp= arr[i];
            int j=i;
            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
                arr[j]=temp;
            }
        }
    }
}

class M{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort_colours stc= new sort_colours();
        stc.sorted(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
