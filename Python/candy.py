#finding the number of candies to assign to number of children
#differently

#below solution is not going to work at local minima
#depending on the minima location with regards to the
#global minimal location, algo may mis-consider its left
#or the right side

def solver(level_lst):
	#runs in O(n), space needed O(1)
	numChild = len(level_lst)
	total = numChild
	cur_candy = 1
	minindx = 0
	mini = level_list[0]
	for i in range(0,numChild):
		#find global min
		if level_lst[i] < mini:
			minindx = i
			mini = level_lst[i]
	#from mid-point to 0, scan and add
	for i in range(minindx-1, -1, -1):
		if level_lst[i] > level_lst[i+1]:
			total += cur_candy
			cur_candy+=1
		else:
			cur_candy = 1

	#from midpoint to end, scan
	for i in range(minindx+1, numChild):
		if level_lst[i] > level_lst[i-1]:
			total += cur_candy
			cur_candy+=1
		else:
			cur_candy = 1
	return total