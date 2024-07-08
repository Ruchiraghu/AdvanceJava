package Matrix;

public class Matrix {
    public static void main(String[] args) {
        int arr [] = {2,3,5,8,7,6};
        int sum = 12;
        boolean found = false;
        for (int i= 0;i< arr.length;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("pair: "+arr[i]+","+arr[j]);
                    found = true;
                }

            }
        }
        if(!found){
            System.out.println("No pairs found for sum of: "+sum);
        }
    }

}
