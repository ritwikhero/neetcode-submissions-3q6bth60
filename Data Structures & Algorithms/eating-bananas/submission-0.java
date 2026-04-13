class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int left = 1;
        int right = 0;

        for(int i : piles){
            right = Math.max(i,right);
        }

        while(left < right){
            int mid = left + (right-left)/2;

            if(canEatAll(mid,piles,h)){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }

    public boolean canEatAll(int mid, int[] piles, int h){
        int hoursTaken = 0;

        for(int i : piles){
            hoursTaken += i/mid;

            if((i % mid) != 0){
                hoursTaken++;
            }
        }

        return hoursTaken <= h;
    }
}
