'Number spiral diagonals
'Problem 28
'
'Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
'
'21 22 23 24 25
'20  7  8  9 10
'19  6  1  2 11
'18  5  4  3 12
'17 16 15 14 13
'
'It can be verified that the sum of the numbers on the diagonals is 101.
'
'What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

total = 1
last  = 1
inc   = 2

For spiral = 2 To 1001 Step 1
	For i=0 To 3 Step 1
		total = total + (last+inc)
		last = last + inc
	Next
	spiral = spiral + 1
	inc = inc + 2
Next

MsgBox(total)
