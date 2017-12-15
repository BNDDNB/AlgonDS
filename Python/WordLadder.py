import sys
import string

'''
objects that solves that performs certain actions
these objects itself perform actions
'''

class solution:
	def enddr(self):
		if self.end_word in self.visited:
			return True
		for i in range(0, len(self.current)):
			temp = self.current
			for j in string.ascii_lowercase:
				#prevent repeating char
				if j == temp[i]:
					continue
				temp = list(temp)
				temp[i] = j
				temp = "".join(temp)
				if temp == self.end_word:
					return True

	def lst_ptr(self):
		if self.enddr():
			self.visited.append(self.end_word)
			try:
				print (self.visited) 
			except:
				print ('Something Wrong at printing')

	def isvalid(self, s):
		return not (s in self.visited)

	def extend(self):
		self.visited.append(self.current)

	def nextwords (self):
		result = []
		for i in range(0, len(self.current)):
			temp = self.current
			for j in string.ascii_lowercase:
				#prevent repeating char
				if j == temp[i]:
					continue
				temp = list(temp)
				temp[i] = j
				temp = "".join(temp)
				if temp in self.word_list and \
					temp not in self.visited:
					result.append(temp)
		return result

	def __init__(self, current, end_word, word_list, visited = [] ):
		self.current = current
		self.end_word = end_word
		self.visited = visited
		self.word_list = word_list
		self.extend()
		self.lst_ptr()



def main():
	beginword = 'hit'
	endword = 'cog'
	dict_list = ['hot','dot','dog','lot','log']
	#initialize an object 
	q = [solution(beginword,endword,dict_list,[])]
	while q:
		obj = q.pop(0)
		words = obj.nextwords()
		for word in words:
			newobj = solution(word,endword,dict_list, list(obj.visited))
			if not newobj.enddr():
				q.append(newobj)

if __name__ == "__main__":main()