import java.util.Scanner;

class largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int[][] arr = new int[a][b]; 
		    for(int i = 0; i < a; i++){
		        for(int j = 0; j < b; j++){
		            arr[i][j] = sc.nextInt();
		        }    
		    }
            for(int i = 0; i < a; i++){
		        for(int j = 0; j < b; j++){
		            System.out.print(arr[i][j] );
		        }    
		    }
		}
        sc.close();
    }
}