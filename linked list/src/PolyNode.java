/*
   The PolyNode class defines a nodes in PolyList double linked list. Each PolyNode 
   represents a single term in a polynomial. It contains fields for the coefficient 
   of a polynomial term, the exponent of a polynomial term, and references to the
   previous and next nodes in the linked list.

   It should not be necessary to modify this class definition.
*/
public class PolyNode
{
    public int coefficient;
    public int exponent;
    public PolyNode next;
    public PolyNode previous;


    /* 
       DO NOT modify this method - the automated marking program uses it to mark
       your submission.
    */
    public boolean equals(PolyNode node)
    {
        boolean retval = false;

        if (node != null)
        {
            if ((coefficient == node.coefficient) && (exponent == node.exponent))
            {
                retval = true;
            }
        }

        return retval;
    }
}
