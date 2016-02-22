def function_to_call(NoOfLoops):
	i = 0
	numbers = []
	
	for i in range(NoOfLoops):
		print "At the top i is %d" % i
		numbers.append(i)
		
		i = i + 1
		print "Numbers now: ", numbers
		print "At the bottom i is %d" % i
		
	print "The number: "

	for num in numbers:
		print num
		
function_to_call(6)