import java.util.*;

/*Our graph object that holds our node objects.
 */
class GraphObj{
	ArrayList<NodeObj> node; //Our graph is comprised of nodes (NodeObj)
	
	//Basic object constructor that creates the arraylist
	public GraphObj() {
		this.node = new ArrayList<>();
	}
	
	//Input object constructor that creates the arraylist of nodes, but with the given input node list
	public GraphObj(ArrayList<NodeObj> input_node) {
		this.node = input_node;
	}
	
	//Adds a given node into our graph
	public void addnode(NodeObj in_node) {
		this.node.add(in_node);
	}
	
	//Literally "gets" the graph's array list of nodes and returns the array list
	public ArrayList<NodeObj> getGraph(){
		return node;
	}
	
	//Gets the node at the requested location in the node array list
	public NodeObj getGivenNode(int location) {
		for(int i = 0; i < node.size(); i++) {
			if(node.get(i).getID() == location) {
				return node.get(i);
			}
		}
		return null; //Default return value of null
	}
	
}

/*Object that represents an individual node in the graph
 * - In this case, our nodes have these values:
 * 		- A class name (String)
 * 		- Adjacent nodes that the current node connects to (ArrayList)
 * 		- ID number/order number (int)
 */
class NodeObj{
	int ID; //Numeric integer order number
	String class_name; //String class name associated with node
	ArrayList<Integer> adjNodes; //Any adjacent nodes from this node
	
	/*Input constructor when creating a node object and assigns
	 * given input_id, input_class_name, and initializes the array list during object creation
	 * 
	 */
	public NodeObj(int input_id, String input_class_name) {
		this.ID = input_id;
		this.adjNodes = new ArrayList<>();
		this.class_name = input_class_name;
	}
	
	/*Adds an adjacent node to the adjNodes list for this current node
	 * 
	 */
	public void addAdjNode(int input_num) {
		this.adjNodes.add(input_num);
	}
	
	/*Gets the ID/order number from the current node
	 * 
	 */
	public int getID() {
		return ID;
	}
	
	/*Returns the adjacent nodes
	 * 
	 */
	public ArrayList<Integer> getadjNodes(){
		return adjNodes;
	}
}


public class TopologicalSortTest {

	public static void main(String[] args) {
		//Create new graph object
		GraphObj g = new GraphObj();
		
		//Add ALL of the classes as it's own nodes with it's name
        NodeObj node0 = new NodeObj(0,"CS 1411");
        NodeObj node1 = new NodeObj(1,"MATH 1451");
        NodeObj node2 = new NodeObj(2,"ENGL 1301");
        NodeObj node3 = new NodeObj(3,"CS 1412");
        NodeObj node4 = new NodeObj(4,"MATH 1452");
        NodeObj node5 = new NodeObj(5,"PHYS 1408");
        NodeObj node6 = new NodeObj(6,"ENGL 1302");
        NodeObj node7 = new NodeObj(7,"CS 2413");
        NodeObj node8 = new NodeObj(8,"CS 1382");
        NodeObj node9 = new NodeObj(9,"ECE 2372");
        NodeObj node10 = new NodeObj(10,"MATH 2450");
        NodeObj node11 = new NodeObj(11,"PHYS 2401");
        NodeObj node12 = new NodeObj(12,"CS 2350");
        NodeObj node13 = new NodeObj(13,"CS 2365");
        NodeObj node14 = new NodeObj(14,"ENGR 2392");
        NodeObj node15 = new NodeObj(15,"POLS 1301");
        NodeObj node16 = new NodeObj(16,"MATH 2360");
        NodeObj node17 = new NodeObj(17,"ENGL 2311");
        NodeObj node18 = new NodeObj(18,"CS 3361");
        NodeObj node19 = new NodeObj(19,"CS 3364");
        NodeObj node20 = new NodeObj(20,"MATH 3342");
        NodeObj node21 = new NodeObj(21,"POLS 2306");
        NodeObj node22 = new NodeObj(22,"CS 3365");
        NodeObj node23 = new NodeObj(23,"CS 3375");
        NodeObj node24 = new NodeObj(24,"CS 3383");
        NodeObj node25 = new NodeObj(25,"CS 4365");
        NodeObj node26 = new NodeObj(26,"CS 4352");
        NodeObj node27 = new NodeObj(27,"CS 4354");
        NodeObj node28 = new NodeObj(28,"CS 4366");
        
        //Connect all of the adjacent nodes together based on the directed graph
        node0.addAdjNode(3);
        node0.addAdjNode(8);
        //done 0
        node1.addAdjNode(4);
        node1.addAdjNode(5);
        node1.addAdjNode(9);
        //done 1
        node2.addAdjNode(6);
        node2.addAdjNode(17);
        //done 2
        node3.addAdjNode(7);
        node3.addAdjNode(22);
        //done 3
        node4.addAdjNode(10);
        node4.addAdjNode(16);
        //done4
        node5.addAdjNode(11);
        //done 5
        node6.addAdjNode(17);
        //done 6
        node7.addAdjNode(12);
        node7.addAdjNode(18);
        node7.addAdjNode(13);
        node7.addAdjNode(19);
        //done 7
        node8.addAdjNode(19);
        node8.addAdjNode(24);
        //done8
        node9.addAdjNode(12);
        //done 9
        node10.addAdjNode(20);
        //done 10
        //done 11
        node12.addAdjNode(23);
        //done 12
        node13.addAdjNode(22);
        //done 13
        //done 14
        //done 15
        node16.addAdjNode(19);
        //done 16
        //done 17
        //done 18
        node19.addAdjNode(26);
        node19.addAdjNode(27);
        //done 19
        node20.addAdjNode(22);
        //done 20
        //done 21
        node22.addAdjNode(25);
        //done 22
        node23.addAdjNode(26);
        //done 23
        //done 24
        node25.addAdjNode(28);
        //done 25
        //done 26
        //done 27
        //done 28
        
        //After adding all of the adjacent nodes to each individual node, literally add the NodeObj to our GraphObj
        g.addnode(node0);
        g.addnode(node1);
        g.addnode(node2);
        g.addnode(node3);
        g.addnode(node4);
        g.addnode(node5);
        g.addnode(node6);
        g.addnode(node7);
        g.addnode(node8);
        g.addnode(node9);
        g.addnode(node10);
        g.addnode(node11);
        g.addnode(node12);
        g.addnode(node13);
        g.addnode(node14);
        g.addnode(node15);
        g.addnode(node16);
        g.addnode(node17);
        g.addnode(node18);
        g.addnode(node19);
        g.addnode(node20);
        g.addnode(node21);
        g.addnode(node22);
        g.addnode(node23);
        g.addnode(node24);
        g.addnode(node25);
        g.addnode(node26);
        g.addnode(node27);
        g.addnode(node28);
        
        //Run our topological ordering algorithm and print out the result
        topoOrdering(g);
        

	}
	
	
	private static void topoOrdering(GraphObj g) {

	    // List where we'll be storing the topological order
	    List<Integer> topo_order = new ArrayList<> ();

	    /*uses a hashmap of integers and booleans
	     * note: hashmaps are used to assign lists with values tied to another value. In this case, an Integer tied with a boolean (visited or not visited)
	     */
	    Map<Integer, Boolean> visited = new HashMap<>();
	    for (NodeObj tmp: g.getGraph()) //Fills the "visited" hash map with false, not visited values because we haven't explored the graph yet.
	        visited.put(tmp.getID(), false); //Sets all node ID's in graph's visited value to false

	    // We go through the nodes using explore
	    for (NodeObj tmp: g.getGraph()) { //As long as there are values in the graph, explore the graph until everything has been marked "visited" based on our hash map values
	        if (!visited.get(tmp.getID())) //if the id in the hash map is not visited, explore the node
	            explore(g, tmp.getID(), visited, topo_order); //recursive explore
	    }

	    //Since it is a stack, we need to reverse the order of the list to get the correct topological ordering
	    Collections.reverse(topo_order); //used to reverse the order of a list, in this case the "topologicalOrder" list
	    System.out.println(topo_order); //Prints out the numeric representation of the topological list
	    displayListClassName(topo_order, g); //Prints out the String representation of the topological list including class names
	}
	
	
	/*Used mainly to display out String class names from topological ordered list paired with it's ID number
	 * 
	 */
	public static void displayListClassName(List<Integer> list, GraphObj g) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < g.node.size(); j++) {
				if(list.get(i) == g.node.get(j).ID) { //if the topological ID matches the graph node ID, print it's name and numeric ID number
					System.out.println(g.node.get(j).ID+" "+g.node.get(j).class_name);
				}
			}
		}
	}
	
	
	/*Used with topoOrdering
	 * explores the current node and adjacent nodes as long as they're not currently visited, then marks the nodes as visited
	 * in a recursive method
	 * 
	 */
	private static void explore(GraphObj g, int v, Map<Integer, Boolean> visited, List<Integer> topo_order) {
	    // Mark the given node as visited
	    visited.replace(v, true); //change visited boolean to true once visited

	    //If a detected adjacent node from the current node is NOT visited, keep exploring the adjacent nodes as well
	    for (Integer neighborId: g.getGivenNode(v).getadjNodes()) {
	        if (!visited.get(neighborId))
	            explore(g, neighborId, visited, topo_order);
	    }

	    //After exploring, add current node to the topo_order list
	    topo_order.add(v);
	}

	
}
