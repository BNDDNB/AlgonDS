def solver(gas_list, cost_list):
	#assume that gas and cost were given i
	total_r = 0
	for i in range(0,len(gas_list)):
		for j in range(0,len(gas_list)):
			total_r += gas_list(j) - cost_list(j)
			if total_r < 0:
				break
	return total_r if total_r >=0 else -1

#the above method works in O(n^2), a O(n) method is
