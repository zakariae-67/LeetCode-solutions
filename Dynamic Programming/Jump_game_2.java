public class Jump_game_2 {
	public int jump(int[] nums) {

        int n=nums.length;
        int farther=0, end=0, jumps=0;

        for(int i=0;i<n-1;i++){
            // Greedy idea: instead of checking all paths
            //we track the current reachable range
            //the farthest we can go next 
            farther=Math.max(farther,i+nums[i]);

            if(i==end){
               jumps+=1;
               end=farther; 
            }
        }

        return jumps;
    }
}
