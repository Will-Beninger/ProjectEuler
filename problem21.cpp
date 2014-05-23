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
