#include<stdio.h>
int main()
{
 int n,ld,sld;
  scanf("%d",&n);
  ld=n%100;
  sld=ld/10;
  printf("%d",sld);
  return 0;
}