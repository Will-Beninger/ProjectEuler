/*
Digit fifth powers
Problem 30

Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

    1634 = 14 + 64 + 34 + 44
    8208 = 84 + 24 + 04 + 84
    9474 = 94 + 44 + 74 + 44

As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
*/

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
