import java.util.*;
public class file3 {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(majority(arr));
    }
    static int majority(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int max=0;
        int ans=0;
        if(n==3){
            if(arr[0]==arr[1]){
                return arr[0];
            }
            if(arr[1]==arr[2]){
                return arr[1];
            }
        }
        for(int i=0;i<n-1;i++){
            int count=0;
            while(arr[i]==arr[i+1]){
                count++;
                if(i<n-1){
                    i++;
                }
            }
            if(count>max){
                max=count;
                ans=arr[i];
            }
        }
        return ans;
    }
}
