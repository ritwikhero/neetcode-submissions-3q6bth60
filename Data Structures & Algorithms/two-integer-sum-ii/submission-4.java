class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = {-1,-1};

        int n = numbers.length;

        int left = 0 , right = n-1;

        while(left <= right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return res;
    }
}
