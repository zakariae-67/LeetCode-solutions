public class Unique_Paths {
	
	public int uniquePaths(int m, int n) {

        //idea:For each cell, compute how many paths lead to it.

        int[][] distance=new int[m][n];

        for(int i=0;i<m;i++){
            Arrays .fill(distance[i],1);
        }

        for(int i=1; i<m;i++){
            for(int j=1;j<n;j++){
                distance[i][j]=distance[i-1][j]+distance[i][j-1];
            }
        }

        return distance[m-1][n-1];
            
    }
}
