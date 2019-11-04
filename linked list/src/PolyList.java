/*
   The PolyList class represents a polynomial as a double linked list. This class
   contains the functionality to add terms (nodes) to the polynomial, to remove
   nodes in the list with a coefficient of 0, and to return a string representation
   of the polynomial.
*/
public class PolyList
{
    public static final int EMPTY_LIST = -1;
    public PolyNode head;
    public PolyNode tail;
    /*
       addNode adds a new node in order into the linked list. See the assignment 
       specification for a complete description of how addNode should operate.
    */
    public boolean addNode(PolyNode newNode) {
		if (newNode == null){
    		return false;
    	}
		if (head == null ){
			head = newNode;		// add new node to an empty list
			tail = newNode;
			return true;
		}
    	if (newNode.coefficient == 0){
    		return false;
    	}

		if (newNode.exponent > head.exponent){
	    	newNode.next = head;		// add a new node as head
	    	head.previous = newNode;
	    	head = newNode;
	    	return true;
	    }
		if (newNode.exponent < tail.exponent){
    		tail.next = newNode;		// add a new node as tail
    		newNode.previous = tail;
    		tail = newNode;
    		return true;
    	}
		PolyNode test = head;

    	while (test != null){ // while loop to scan the position
    		
    		if (test.exponent == newNode.exponent){
    			return false;		// there is an exist node with the same exponent
    		}
    		

    		if (test.exponent < newNode.exponent ){
    			
    			test.previous.next = newNode;	// find the right position to add the node
    			newNode.previous = test.previous;
    			test.previous = newNode;
    			newNode.next = test;	
        		return true;
    		}
    			
    		
    		test = test.next;	
    		
    		
    	}
    	return false;

    }


    /*
       getDegree returns the degree of the polynomial (or -1 if the linked list is
       empty
    */
    public int getDegree()
    {
    		if (head == null) {	
    			return -1;
    		}
    		return head.exponent;
    }


    /*
       getNode returns a reference to the node in the linked list with the specified 
       exponent (or null if there is no such node in the list).
    */
    public PolyNode getNode(int exponent)
    {
        if (head == null) {
        		return null;
        }
        PolyNode test = head;
        while (test != null) {
        		if (test.exponent == exponent) {		// to get the node with the target exponent
        			return test;
        		}
        		test = test.next;
        }
        return null;
    }


    /* 
       reduce removes any nodes in the linked list that have a coefficient of 0. See 
       the assignment specification for an example of how reduce operates. 
    */
    public void reduce() {
    		PolyNode test = head;
    		while (test != null) {
    			if (test.coefficient == 0) { // reduce the node which has a coefficient as 0
    				if (test == head) {
    					test.next.previous = null;
    					head = test.next;
    				}
    				else if (test.next == null) {
    					test.previous.next = null;
    				}
    				else {
    					test.previous.next = test.next;
    					test.next.previous = test.previous;
    				}
    			}
    			test = test.next;
    		}
    	}
    		

    /*
       You need to complete this method in order to see accurate test output!
       toString returns a string representation of the polynomial in the form:
       ax^n + bx^(n-1) + ... + kx^0.
    */
    public String toString() { 
    	PolyNode test = head;
		String text = "";
		
		while (test != null) {
			
				if (test == head) { // return the head to string
					text += test.coefficient + "x"+ "^" + test.exponent;
				}
				else {
					if (test.coefficient > 0) { // the format for a positive coefficient
    					text += " + " + test.coefficient + "x"+ "^" + test.exponent ;
    				}
    				else {  // the format for a negative coefficient
    					text += " - " + (0-test.coefficient) + "x"+ "^" + test.exponent ;
    				}					// set the negative to positive
				}
			test = test.next;
			
		}
		return text;
	}
    
    	

    /* 
       DO NOT modify this method - the automated marking program uses it to mark
       your submission
    */
    public boolean equals(PolyList poly)
    {
        boolean retval = false;
        boolean identicalNodes = true;
        PolyNode current = head; 
        PolyNode compareNode = null;

        if (poly != null)
        {
            compareNode = poly.head;

            while ((current != null) && (compareNode != null) && identicalNodes)
            {
                identicalNodes = false;

                if (current.equals(compareNode))
                {
                    identicalNodes = true;
                }

                compareNode = compareNode.next;
                current = current.next;
            }

            if (identicalNodes && (current == null) && (compareNode == null))
            {
                retval = true;
            }
        }

        return retval;
    }
}
