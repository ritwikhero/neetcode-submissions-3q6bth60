class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = piles[0];

        for(int i : piles){
            right = Math.max(i,right);
        }

        while(left <= right){
            int mid = left + (right-left)/2;

            if(canFinish(piles,mid,h)){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }

    public boolean canFinish(int[] arr, int mid, int h){
        int hrs = 0;

        for(int i : arr){
            hrs += i / mid;

            if(i % mid != 0){
                hrs++;
            }
        }
        return hrs <= h;
    }
}
