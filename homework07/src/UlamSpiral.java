/**
 * Created by Macintosh on 4/12/16.
 */
public class UlamSpiral {
    public static void main(String[] args) {
        int n = 5;
        int[][] spiral = new int[n][n];
        int value = 1;
        int r = 1;
        int i = (int) (spiral.length-1)/2;
        int j = i;
        spiral[i][j]=++value;
        spiral[i++][j]=++value;
        spiral[i][j--]=++value;
        while(i<n && j<n && r<n){
            for(int left=1; left<(left+r); left++) {
                spiral[i--][j] = value++;
            }
            for(int down=1; down<(down+r); down++) {
                spiral[i][j++] = value++;
            }
            r++;
            for(int right=1; right<(right+r); right++){
                spiral[i++][j]=value++;
            }
            for(int up = 1;up<(up+r);up++){
                spiral[i][j--]=value++;
            }
            r++;
        }

    }
}
