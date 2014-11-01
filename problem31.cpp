/*
Coin sums
Problem 31

In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

    1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).

It is possible to make £2 in the following way:

    1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p

How many different ways can £2 be made using any number of coins?
*/

#include <iostream>

int main()
{
	int ways = 1;
	
	for (int i = 2; i>=0; i--) //£1
	{
		for (int j = 4; j>=0; j--) //50p
		{
			for (int k = 10; k>=0; k--) //20p
			{
				for (int l = 20; l>=0; l--) //10p
				{
					for (int h = 40; h>=0; h--) //5p
					{
						for (int g = 100; g>=0; g--) //2p
						{
							int tempTotal = 200;
							tempTotal = tempTotal - ((100*i)+(50*j)+(20*k)+(10*l)+(5*h)+(2*g));
							if (tempTotal >= 0)
							{
								ways++;
							}
						}
					}
				}
			}
		}
	}

	std::cout << ways << std::endl;
}
