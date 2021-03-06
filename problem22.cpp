/*
Names scores
Problem 22

Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
*/


#include<iostream>
#include<string>
#include<fstream>
#include<vector>

std::vector<std::string> tokenize(std::string buffer, std::string delim, std::string garbage)
{
   std::vector<std::string> result;
   int y = 0;
   bool active = false;
   for (int x = 0; x < buffer.size(); x++)
   {
      if (buffer[x] == garbage[0])
      {
         continue;
      }
      if (buffer[x] == delim[0])
      {
         if (!active)
         {
            y = x;
            active = true;
         }
         else
         {
            result.push_back(buffer.substr(y+1, (x-y)-1));
            active = false;
         }
      }
   }
   return result;
}

std::vector<std::string> bubbleSort(std::vector<std::string> in)
{
   bool change = true;
   int j=in.size();
   while (j > 1 && change == true) //2+
   {
      change = false;
      for (int i=0; i < j-1; i++)
      {
         int comp = in[i].compare(in[i+1]);
         if (comp == 0)
            continue;
         else if (comp > 0)
         {
            std::string temp = in[i];
            in[i] = in[i+1];
            in[i+1] = temp;
            change = true;
         }
      }
      j--;
   }
   return in;
}

int main()
{
   std::ifstream fin("problem23.txt",std::ios::in);
   std::string sline;
   fin >> sline;
   std::vector<std::string> sorted = bubbleSort(tokenize(sline,"\"",","));

   unsigned long long int result = 0;
   for (int i=0; i<sorted.size(); i++)
   {
      unsigned long long int temp=0;
      for (int j=0; j<sorted[i].size(); j++)
      {
         temp+=((int)sorted[i][j] - 64);
      }
      result += (temp*(i+1));
   }
   
   std::cout << result << std::endl;

   return 1;
}
