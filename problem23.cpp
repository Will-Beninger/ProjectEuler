/*
Non-abundant sums
Problem 23

A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
*/


#include<iostream>
#include<set>
#include<math.h>

bool isAbundant(int x)
{
   int total=1;
   for (int i=2; i<=(int)(sqrt(x)); i++)
   {
      if (x%i == 0)
      {
         if (i==x/i)
            total+=i;
         else
            total+=(i+(x/i));
      }
   }

   if (total>x)
      return true;
   else
      return false;
}

int main()
{
   std::set<int> abunNums;
   for (int i=11; i<28123; i++)
   {
      if (isAbundant(i))
      {
         abunNums.insert(i);
      }
   }

   int total = 0;
   for (int i=1; i<28123; i++)
   {
      for (std::set<int>::iterator it = abunNums.begin(); it!= abunNums.end(); ++it)
      {
         if (abunNums.find(i - *it) != abunNums.end())
         {
            break;
         }
         else if (i - *it < 12)
         {
            total+=i;
            break;
         }
         else if (it == (--abunNums.end()))
         {
            total+=i;
            break;
         }
      }
   }
   
   std::cout << total << std::endl;
   return 0;
}
