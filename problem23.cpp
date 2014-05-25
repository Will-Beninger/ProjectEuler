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
