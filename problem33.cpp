/*
Digit cancelling fractions
Problem 33

The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.

If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
*/

#include <iostream>

int main()
{
	int answerNum=1, answerDenom=1;


	for (int i = 10; i<98; i++)
	{
		for (int j = i+1; j<99; j++)
		{
			double testOrig = ((i*1.0)/(j*1.0));

			int a = i/10;
			int b = i%10;
			int c = j/10;
			int d = j%10;

			if ((b == 0) && (d == 0))
				continue;

			if (a==c)
			{
				double test = ((b*1.0)/(d*1.0));
				if (testOrig==test)
				{
					std::cout << a << b << "/" << c << d << std::endl;
					answerDenom = (answerDenom*d);
					answerNum = (answerNum*b);
				}
			}
			
			if (a==d)
			{
				double test = ((b*1.0)/(c*1.0));
				if (testOrig==test)
				{
					std::cout << a << b << "/" << c << d << std::endl;
					answerDenom = (answerDenom*c);
					answerNum = (answerNum*b);
				}
			}

			if (b==c)
			{
				double test = ((a*1.0)/(d*1.0));
				if (testOrig==test)
				{
					std::cout << a << b << "/" << c << d << std::endl;
					answerDenom = (answerDenom*d);
					answerNum = (answerNum*a);
				}
			}

			if (b==d)
			{
				double test = ((a*1.0)/(c*1.0));
				if (testOrig==test)
				{
					std::cout << a << b << "/" << c << d << std::endl;
					answerDenom = (answerDenom*c);
					answerNum = (answerNum*a);
				}
			}
		}
	}
	std::cout << answerNum << "/" << answerDenom << std::endl;
}
