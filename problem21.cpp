/*
Amicable numbers
Problem 21

Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/

#include<iostream>
#include<map>
#include<math.h>

int retSum(int x)
{
   int sum=1;
   for (int i = (int)sqrt(x);i>1;i--)
   {
      if (x%i==0)
      {
         sum+=(i+(x/i));
      }
   }
   return sum;
}

int main()
{
   std::map<int,int> divList;
   int sum=0;
   for (int i=1; i<10000; i++)
   {
      divList[i] = retSum(i);
   }

   for (std::map<int,int>::iterator x = divList.begin(); x!=divList.end(); x++)
   {
      if (divList.find(x->second) != divList.end() && divList.find(x->second) != x)
      {
         if (divList[x->second] == x->first)
         {
            sum+=(x->first + x->second);
            divList.erase(x->first);
            divList.erase(x->second);
         }
      }
   }

   std::cout << sum << std::endl;

   return 1;
}
