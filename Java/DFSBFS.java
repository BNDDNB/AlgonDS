//DFS BFS review, cloning a graph

//bfs solution first
/*

class UndirectedNode{
	int label;
	ArrayList <UndirectedNode> neighbours;
	UndirectedNode(int lbl){label = lbl;}
};

*/
public static UndirectedNode solover(UndirectedNode un){
	if (un == null){
		return null;
	}
	//create a hashmap or set to record visited nodes
	//a queue that remembers what to visit next
	HashMap <UndirectedNode, UndirectedNode> visited = new HashMap<>();
	//abstract class q can be realized by linkedlist
	Queue<UndirectedNode> q = new LinkedList<>();
	q.add(un);
	visited.put(un, new UndirectedNode(un.label));
	while (!q.isEmpty()){
		//popping one item out from queue
		UndirectedNode temp = q.poll();
		for (UndirectedNode node : temp.neighbours){
			if (visited.containsKey(node)){
				//there is a cycle in the graph
				//no need to add back to queue
				visited.get(node).neighbours.add(visited.get(node));
			}else{
				UndirectedNode cloneNode = new UndirectedNode(node.label);
				visited.put(node, cloneNode);
				visited.get(temp).neighbours.add(cloneNode);
				//adding the unvisited node neighbours back to queue
				q.add(node);
			}
		}
	}	
	return visited.get(un);
}

//dfs solution below

public static void dfsfunc(HashMap<UndirectedNode> visited, UndirectedNode un){


}

public static UndirectedNode solver(UndirectedNode un){
	if (un==null) return null;
	//create a map tracking visited nodes
	HashMap <UndirectedNode> visited = new HashMap<>();
	dfsfunc(visited, un);
	return visited.get()
}