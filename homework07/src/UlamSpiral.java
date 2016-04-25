/**
 * Created by Macintosh on 4/12/16.
 */
public class UlamSpiral {
    public static void main(String[] args) {
        int n = 5;
        int[][] spiral = new int[n][n];
        int value = 1;
        int r = 1;
        int i = (spiral.length-1)/2;
        int j = i;

        spiral[i][j]=value;
        i++;
        spiral[i][j]=++value;
        j--;
        spiral[i][j]=++value;
        System.out.println("i="+i+" j="+j);
        printSpiral(spiral);
        while(i<n && j<n && r<n){
            for(int left=1; left<(left+r); left++) {
                i--;
                value++;
                spiral[i][j] = value;
                printSpiral(spiral);
            }
            for(int down=1; down<(down+r); down++) {
                j++;
                value++;
                spiral[i][j] = value;
                printSpiral(spiral);
            }
            r++;
            for(int right=1; right<(right+r); right++){
                i++;
                value++;
                spiral[i][j]=value;
                printSpiral(spiral);
            }
            for(int up = 1;up<(up+r);up++){
                j++;
                value++;
                spiral[i][j]=value;
                printSpiral(spiral);
            }
            r++;
        }

    }

    private static void printSpiral(int[][] spiral){
        for(int i=0; i<=spiral.length-1; i++){
            for(int j=0;j<=spiral.length-1; j++){
                System.out.print(spiral[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
