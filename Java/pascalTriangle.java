public class pascalTriangle {
    public static void main(String args[]) {
        int n=6;
        int num;

//        outer loop
        for (int i=0;i<n;i++) {
//            spaces
            int spaces = n-i;
            for (int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
//            numbers
            num = 1;
            for (int j=0;j<=i;j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
