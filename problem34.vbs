Function Factorial(a)
	If a = 0 Then
		Factorial = 1
	Else
		Factorial = a * Factorial(a-1)
	End If
End Function

x = 3
answer = 0

Do While (x<100000)
	tempX = x
	total = 0
	Do While (tempX<>0)
		y = tempX Mod 10
		tempX = tempX \ 10
		total = total + Factorial(y)
	Loop
	If total = x Then
		answer = answer + total
	End If
	x = x + 1
Loop

MsgBox answer