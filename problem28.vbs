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