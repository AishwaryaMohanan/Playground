#include <stdio.h>
int main() {
 int n,on,rem,r=0;
    scanf("%d", &n);
    on=n;
    while (on != 0)
    {
        rem = on%10;
        r += rem*rem*rem;
        on /= 10;
    }
    if(r == n)
        printf("Armstrong Number",n);
    else
        printf("Not an Armstrong Number",n);
  
	return 0;
}