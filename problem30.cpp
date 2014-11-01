#include <iostream>
#include <cmath>

int main()
{
	int totalSum = 0;
	for (int i = 2;i < 2000000;i++)
	{
		int j = i;
		int tempTotal = 0;
		while (j != 0)
		{
			int temp = j%10;
			j /= 10;
			tempTotal += pow(temp,5);
		}
		if (tempTotal == i)
			totalSum+=tempTotal;
	}
	std::cout << totalSum << std::endl;
}
