public class LLExample {


    public static LinkedList list = new LinkedList();
    static LinkedList list1;
    public static void main(String[] args) {
	Node dummy = new Node();
	Node a = new Node(1);
	Node b = new Node(5);
	Node c = new Node(3);
	Node d = new Node(4);
	Node e = new Node(8);

	list1 = new LinkedList(dummy);
	list1.insert(a);
	list1.insert(b);
	list1.insert(c);
	list1.insert(d);
	list1.insert(e);

	list1.printList(dummy); //Print the list dummy node is the head


	Node l = new Node(6); //Node That you want to replace replace(x,  node l);
	Node swap = new Node();
	swap = list1.replace(3, l); //look for 3 and replace with 6

	System.out.println("list");
	list1.printList(swap);  // Print out swapped list


	list1.sum(); //Add up the nodes

	//Node n = list1.find(6);
	// Node n = list1.find(6): //0
	/*if (n.getData() == 0){
        System.out.println("that node was not found");
    }else {
        System.out.println("We found the node with a value of" + n.getData());
    }*/
	//System.out.println();






    }

}