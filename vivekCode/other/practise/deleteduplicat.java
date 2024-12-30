package practise;

public class deleteduplicat {
    public static int removeDuplicate(int nums[]){
        int k = 0;
        for(int i =0; i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k+1;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3,3,4,4,4,5,5,5,6,7,7,8,9,9};
        int k= removeDuplicate(nums);
        System.out.println(k);
    }
}