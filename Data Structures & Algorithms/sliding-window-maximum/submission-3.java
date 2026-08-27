class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < n ; i++){

            //step 1  
            while(!dq.isEmpty() && dq.peek() <= i-k){
                dq.pollFirst();
            }

            //Step 2
            while(!dq.isEmpty() && nums[i] >= nums[dq.getLast()]){
                dq.pollLast();
            }

            //Step 3
            dq.offer(i);

            //Step 4
            if(i >= k-1){
                list.add(nums[dq.peek()]);
            }
        }

        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
