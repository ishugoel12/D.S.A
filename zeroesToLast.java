public class zeroesToLast{
        public static void main(String[] args){
                int[] arr = {1,9,8,4,0,0,2,7,0,6};
                int nonzero=0;
                for(int i=0; i <arr.length ; i++){
                        if(arr[i] !=0 ){
                                if(i > nonzero){
                                        int t = arr[i];
                                        arr[i] = arr[nonzero];
                                        arr[nonzero]=t;
                                }
                                nonzero++;
                        }
                }
                for(int i : arr)
                        System.out.println(i + " ");
        }
}