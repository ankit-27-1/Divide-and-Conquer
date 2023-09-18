public class file3 {
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5};
        System.out.println(inversion(arr));
    }
    static int inversion(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    count++;
                }
            }
        }
        return count+1;
    }
}
