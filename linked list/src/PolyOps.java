/*
   The PolyOps class defines methods for adding, subtracting and multiplying 
   polynomials.
*/
public class PolyOps
{
    /*
       addPolys adds two polynomials and returns the result. If either of the method 
       arguments are invalid then addPolys throws an IllegalArgumentException. 
    */
    public PolyList addPolys(PolyList poly1, PolyList poly2) throws IllegalArgumentException
    {
        
        
        if (poly1 == null || poly2 == null){
        	throw new IllegalArgumentException();		
        }
        
        PolyList result = new PolyList ();
        PolyNode node1 = poly1.head;		
        PolyNode node2 = poly2.head;

        while (node1 != null){		
        	if (node1.exponent < 0){		// test the new node valid
        		throw new IllegalArgumentException();
        	}

        	while(node2 != null){
            	if (node2.exponent < 0){ 
            		throw new IllegalArgumentException();
            	}
        		
        		PolyNode newNode = new PolyNode();   	//set a node to test
        		if (node1.exponent == node2.exponent ){		// add two node with the same exponent
        			newNode.coefficient = node1.coefficient + node2.coefficient ;	
            		newNode.exponent = node1.exponent;
            		result.addNode(newNode);	
        		}
        		
        		
        		else if (node1.exponent < node2.exponent){  // add the node only exist in poly2
        			result .addNode(node2);	
        		}
        		
        		
        		
        		node2 = node2.next;
        		
        	}
        	if (node1 != null){ // add the node only exist in poly1
        		result.addNode(node1);
        	}

        	node1 = node1.next;
        	node2 = poly2.head;
        	

        }
        return result;
    }


    


	/*
       subtractPolys subtracts two polynomials and returns the result. If either
       of the method arguments are invalid then subtractPolys throws an 
       IllegalArgumentException.
    */
    public PolyList subtractPolys(PolyList poly1, PolyList poly2) throws IllegalArgumentException
    {
    	if (poly1 == null || poly2 == null){// test is these two poly valid?
        	throw new IllegalArgumentException();
        }
        
        PolyList result = new PolyList ();
        PolyNode node1 = poly1.head;
        PolyNode node2 = poly2.head;
        while (node1 != null){
        	if (node1.exponent < 0){
        		throw new IllegalArgumentException();
        	}

        	while(node2 != null){
            	if (node2.exponent < 0){
            		throw new IllegalArgumentException();
            	}
        		
        		PolyNode newNode = new PolyNode();
        		if (node1.exponent == node2.exponent ){		//
        			newNode.coefficient = node1.coefficient - node2.coefficient ;
            		newNode.exponent = node1.exponent;
            		result.addNode(newNode);	
        		}   			
        		else if (node1.exponent < node2.exponent){
        			node2.coefficient = 0 - node2.coefficient ;
        			result .addNode(node2);
        		}
        		
        		node2 = node2.next;
        		
        	}
        	if (node1 != null){
        		result.addNode(node1);
        		
        	}

        	node1 = node1.next;
        	node2 = poly2.head;
        	

        }
        result.reduce();// have something wrong with my reduce function , i remove node with 0 coefficient in any position :(
        return result;
    
    }


    /*
       multiplyPolys multiplies two polynomials and returns the result. If either
       of the method arguments are invalid then multiplyPolys throws an 
       IllegalArgumentException. 
    */
    public PolyList multiplyPolys(PolyList poly1, PolyList poly2) throws IllegalArgumentException
    {
    	if (poly1 == null || poly2 == null){
        	throw new IllegalArgumentException();
        }
        
        PolyList result = new PolyList ();
        PolyNode node1 = poly1.head;
        PolyNode node2 = poly2.head;

        while (node1 != null){
        	if (node1.exponent < 0){
        		throw new IllegalArgumentException();
        	}

        	while(node2 != null){
            	if (node2.exponent < 0){
            		throw new IllegalArgumentException();
            	}
        		
        		PolyNode newNode = new PolyNode();
        		if (node1.exponent == node2.exponent ){
        			newNode.coefficient = node1.coefficient * node2.coefficient ;
            		newNode.exponent = node1.exponent;
            		result.addNode(newNode);	
        		}
        		
        		
        		else if (node1.exponent < node2.exponent){
        			node2.coefficient =  node2.coefficient ;
        			result .addNode(node2);	
        		}
        		
        		
        		
        		node2 = node2.next;
        		
        	}
        	if (node1 != null){
        		result.addNode(node1);
        	}

        	node1 = node1.next;
        	
        	

        }
        
        return result;
    }
}
