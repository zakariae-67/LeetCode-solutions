public class Climbing_Stairs {
	
	public int climbStairs(int n) {

        if(n<=3) return n;

        int prev2=2;
        int prev3=3;
        int curr=0;

        for(int i=4;i<=n;i++){
            curr=prev2+prev3;
            prev2=prev3;
            prev3=curr;
        }

        return curr;
    }

}
