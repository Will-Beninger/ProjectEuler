'Counting Sundays
'Problem 19
'
'You are given the following information, but you may prefer to do some research for yourself.
'
'    1 Jan 1900 was a Monday.
'    Thirty days has September,
'    April, June and November.
'    All the rest have thirty-one,
'    Saving February alone,
'    Which has twenty-eight, rain or shine.
'    And on leap years, twenty-nine.
'    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
'
'How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?


Dim jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec

jan = 1
feb = 6
mar = 6
apr = 0
may = 2
jun = 5
jul = 0
aug = 3
sep = 6
oct = 1
nov = 4
dec = 6

Dim count
count = 0
'On Non-ly all + 1
'On ly jan/feb + 1 else + 2
'Year after ly jan/feb + 2 else + 1

Dim lastYear
lastYear = False
For temp = 1901 to 2000 Step 1
	If ((temp Mod 1000) = 0 And (temp Mod 400) = 0) Then 'leapyear case
		leapyear()
		lastYear = True
	ElseIf ((temp Mod 1000) <> 0 And (temp Mod 4) = 0) Then 'leapyear
		leapyear()
		lastYear = True
	ElseIf lastYear Then 'Year after leapyear
		afterleapyear()
		lastYear = False
	Else
		nonleapyear()
	End If
		
	trimyear()
	
	If (jan = 0) Then count = count + 1
	If (feb = 0) Then count = count + 1
	If (mar = 0) Then count = count + 1
	If (apr = 0) Then count = count + 1
	If (may = 0) Then count = count + 1
	If (jun = 0) Then count = count + 1
	If (jul = 0) Then count = count + 1
	If (aug = 0) Then count = count + 1
	If (sep = 0) Then count = count + 1
	If (oct = 0) Then count = count + 1
	If (nov = 0) Then count = count + 1
	If (dec = 0) Then count = count + 1
Next

MsgBox(count)
	
Function leapyear()
	jan = jan + 1
	feb = feb + 1
	mar = mar + 2
	apr = apr + 2
	may = may + 2
	jun = jun + 2
	jul = jul + 2
	aug = aug + 2
	sep = sep + 2
	oct = oct + 2
	nov = nov + 2
	dec = dec + 2
End Function

Function nonleapyear()
	jan = jan + 1
	feb = feb + 1
	mar = mar + 1
	apr = apr + 1
	may = may + 1
	jun = jun + 1
	jul = jul + 1
	aug = aug + 1
	sep = sep + 1
	oct = oct + 1
	nov = nov + 1
	dec = dec + 1
End Function

Function afterleapyear()
	jan = jan + 2
	feb = feb + 2
	mar = mar + 1
	apr = apr + 1
	may = may + 1
	jun = jun + 1
	jul = jul + 1
	aug = aug + 1
	sep = sep + 1
	oct = oct + 1
	nov = nov + 1
	dec = dec + 1
End Function

Function trimyear()
	jan = jan Mod 7
	feb = feb Mod 7
	mar = mar Mod 7
	apr = apr Mod 7
	may = may Mod 7
	jun = jun Mod 7
	jul = jul Mod 7
	aug = aug Mod 7
	sep = sep Mod 7
	oct = oct Mod 7
	nov = nov Mod 7
	dec = dec Mod 7
End Function
