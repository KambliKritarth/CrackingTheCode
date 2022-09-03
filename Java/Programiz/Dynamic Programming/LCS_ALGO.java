//import java.io.*;
class LCS_ALGO {
    static void lcs(String S1, String S2, int m, int n){
        int lcs[][] = new int [m+1][n+1];
        for(int i = 0;i<=m;i++){
            for(int j = 0;j<=n;j++){
                if(i==0||j==0){
                    lcs[i][j] = 0;
                }
                else if(S1.charAt(i-1)==S2.charAt(j-1)){
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                }
                else{
                    lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }
        int index = lcs[m][n];
        int temp = index;
        char LCS[] = new char[index+1];
        LCS[index] = '\0';
        int i=m,j=n;
        while(i>0&&j>0){
            if(S1.charAt(i-1)==S2.charAt(j-1)){
                LCS[index - 1] = S1.charAt(i-1);
                index--;
                i--;
                j--;  
            }
            else if(lcs[i-1][j]>lcs[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        System.out.print("\n S1:"+S1+"\n S2:"+S2+"\n lcs:");
        for(int k = 0;k<=temp;k++){
            System.out.print(LCS[k]);
        }
        System.out.println();
    }

  public static void main(String[] args) {
    String S1 = "ACADB";
    String S2 = "CBDA";
    int m = S1.length();
    int n = S2.length();
    lcs(S1, S2, m, n);
  }
}