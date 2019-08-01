#include <stdio.h>
int main() 
{
int n,fd;
  	scanf("%d",&n);
  	while(n>100)
      n=n/10;
  fd=n%10;
	printf(" %d",fd);
	return 0;
}