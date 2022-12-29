#include <stdio.h>
int main(){
  int n, m;
  scanf("%d%d",&n,&m);
  if(m%n==0){
    int cuts = n * 2;
    printf("%d",cuts);
  }
  else{
    printf("%d",n);
  }
  return 0;
}