class LeftShiftMultiply {
  static int multiply(int n, int m) {
    int ans = 0, count = 0;
    while(m>0){
      if(m%2==1)
        ans += n<<count;
      count++;
      m/=2; 
    }
    return ans;
  }
  public static void main(String[] args) {
    System.out.println(multiply(20, 13));
  }
}