#find out the dominating element
#initial idea is to scan and store number in dictionary

def solver(intarr):
	#a dictionary 
	d = {}
	for ele in intarr:
		d[ele]+=1
	for k,v in d.iteritems():
		if v >= len(intarr):
			return v
	#not found return -1, which should not happen in this program
	return -1

#another way to solve this is to sort the array, and then because the
#character of the array, can directly select the element at length/2

def solver2(intarr):
	intarr.sort()
	return intarr[len(intarr)/2]
