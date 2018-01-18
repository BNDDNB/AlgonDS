def solver(gas_list, cost_list):
	#assume that gas and cost were given i
	total_r = 0
	j=0
	for i in range(0,len(gas_list)):
		for j in range(0,len(gas_list)):
			total_r += gas_list(j) - cost_list(j)
			if total_r < 0:
				break
	return j if total_r >=0 else -1

#the above method works in O(n^2), a O(n) method is
def solver2 (gas_list, cost_list):
	total_r = 0
	#use this as a index
	j = -1
	temp = 0
	for i in range(0,len(gas_list)):
		temp += gas_list[i] - cost_list[i]
		total_r += gas_list[i] - cost_list[i]
		if(temp<0):
			#remember the location of negative reminder
			j=i
			temp=0
	return j+1 if total_r>0 else -1

