import java.io.*;
import java.lang.reflect.*;


public class Assignment1Marker
{
    //constants specifying the marks for each test case
    private static final float ADD_METHOD_TC_1_MARK = 4;
    private static final float ADD_METHOD_TC_2_MARK = 2;
    private static final float ADD_METHOD_TC_3_MARK = 2;
    private static final float ADD_METHOD_TC_4_MARK = 3;
    private static final float ADD_METHOD_TC_5_MARK = 2;
    private static final float ADD_METHOD_TC_6_MARK = 2;

    private static final float DEGREE_METHOD_TC_1_MARK = 2.5f;
    private static final float DEGREE_METHOD_TC_2_MARK = 2.5f;

    private static final float TO_STRING_METHOD_TC_1_MARK = 4;
    private static final float TO_STRING_METHOD_TC_2_MARK = 4;
    private static final float TO_STRING_METHOD_TC_3_MARK = 2;

    private static final float REDUCE_METHOD_TC_1_MARK = 3;
    private static final float REDUCE_METHOD_TC_2_MARK = 4;
    private static final float REDUCE_METHOD_TC_3_MARK = 5;
    private static final float REDUCE_METHOD_TC_4_MARK = 2;

    private static final float GET_NODE_METHOD_TC_1_MARK = 4;
    private static final float GET_NODE_METHOD_TC_2_MARK = 4;
    private static final float GET_NODE_METHOD_TC_3_MARK = 2;

    private static final float ADD_POLYS_METHOD_TC_1_MARK = 2;
    private static final float ADD_POLYS_METHOD_TC_2_MARK = 2;
    private static final float ADD_POLYS_METHOD_TC_3_MARK = 4;
    private static final float ADD_POLYS_METHOD_TC_4_MARK = 3;
    private static final float ADD_POLYS_METHOD_TC_5_MARK = 3;

    private static final float SUBTRACT_POLYS_METHOD_TC_1_MARK = 2;
    private static final float SUBTRACT_POLYS_METHOD_TC_2_MARK = 2;
    private static final float SUBTRACT_POLYS_METHOD_TC_3_MARK = 4;
    private static final float SUBTRACT_POLYS_METHOD_TC_4_MARK = 3;
    private static final float SUBTRACT_POLYS_METHOD_TC_5_MARK = 3;

    private static final float MULTIPLY_POLYS_METHOD_TC_1_MARK = 2;
    private static final float MULTIPLY_POLYS_METHOD_TC_2_MARK = 2;
    private static final float MULTIPLY_POLYS_METHOD_TC_3_MARK = 8;
    private static final float MULTIPLY_POLYS_METHOD_TC_4_MARK = 3;
    private static final float MULTIPLY_POLYS_METHOD_TC_5_MARK = 3;

    private static final float MAX_ADD_METHOD_MARK = 
        ADD_METHOD_TC_1_MARK + ADD_METHOD_TC_2_MARK + ADD_METHOD_TC_3_MARK + 
    ADD_METHOD_TC_4_MARK + ADD_METHOD_TC_5_MARK + ADD_METHOD_TC_6_MARK;

    private static final float MAX_REDUCE_METHOD_MARK = 
        REDUCE_METHOD_TC_1_MARK + REDUCE_METHOD_TC_2_MARK +
        REDUCE_METHOD_TC_3_MARK + REDUCE_METHOD_TC_4_MARK;

    private static final float MAX_DEGREE_METHOD_MARK = 
        DEGREE_METHOD_TC_1_MARK + DEGREE_METHOD_TC_2_MARK;

    private static final float MAX_GET_NODE_METHOD_MARK = 
        GET_NODE_METHOD_TC_1_MARK + GET_NODE_METHOD_TC_2_MARK +
        GET_NODE_METHOD_TC_3_MARK;

    private static final float MAX_TO_STRING_METHOD_MARK = 
        TO_STRING_METHOD_TC_1_MARK + TO_STRING_METHOD_TC_2_MARK +
        TO_STRING_METHOD_TC_3_MARK;

    private static final float MAX_ADD_POLYS_METHOD_MARK = 
        ADD_POLYS_METHOD_TC_1_MARK + ADD_POLYS_METHOD_TC_2_MARK + 
        ADD_POLYS_METHOD_TC_3_MARK + ADD_POLYS_METHOD_TC_4_MARK + 
        ADD_POLYS_METHOD_TC_5_MARK;

    private static final float MAX_SUBTRACT_POLYS_METHOD_MARK = 
        SUBTRACT_POLYS_METHOD_TC_1_MARK + SUBTRACT_POLYS_METHOD_TC_2_MARK + 
        SUBTRACT_POLYS_METHOD_TC_3_MARK + SUBTRACT_POLYS_METHOD_TC_4_MARK + 
        SUBTRACT_POLYS_METHOD_TC_5_MARK;

    private static final float MAX_MULTIPLY_POLYS_METHOD_MARK = 
        MULTIPLY_POLYS_METHOD_TC_1_MARK + MULTIPLY_POLYS_METHOD_TC_2_MARK + 
        MULTIPLY_POLYS_METHOD_TC_3_MARK + MULTIPLY_POLYS_METHOD_TC_4_MARK + 
        MULTIPLY_POLYS_METHOD_TC_5_MARK;

    private static final float MAX_TOTAL_MARK = 
        MAX_ADD_METHOD_MARK + MAX_REDUCE_METHOD_MARK +
        MAX_DEGREE_METHOD_MARK + MAX_GET_NODE_METHOD_MARK +
        MAX_TO_STRING_METHOD_MARK + MAX_ADD_POLYS_METHOD_MARK +
        MAX_SUBTRACT_POLYS_METHOD_MARK + MAX_MULTIPLY_POLYS_METHOD_MARK;

    public static final int ADD_METHOD_TC_1_EXPONENTS[] = {3,2,1,0};
    public static final int ADD_METHOD_TC_1_COEFFS[] = {1,2,3,4};
    public static final boolean ADD_METHOD_TC_1_EXP_RETVALS[] = {true,true,true,true};

    public static final int ADD_METHOD_TC_2_EXPONENTS[] = {0,1,2,3};
    public static final int ADD_METHOD_TC_2_COEFFS[] = {4,3,2,1};
    public static final boolean ADD_METHOD_TC_2_EXP_RETVALS[] = {true,true,true,true};

    public static final int ADD_METHOD_TC_3_EXPONENTS[] = {1,3,0,2};
    public static final int ADD_METHOD_TC_3_COEFFS[] = {1,2,3,4};
    public static final boolean ADD_METHOD_TC_3_EXP_RETVALS[] = {true,true,true,true};

    public static final int ADD_METHOD_TC_4_EXPONENTS[] = {1,3,0,2,2};
    public static final int ADD_METHOD_TC_4_COEFFS[] = {1,2,3,4,5};
    public static final boolean ADD_METHOD_TC_4_EXP_RETVALS[] = {true,true,true,true,false};

    public static final int ADD_METHOD_TC_5_EXPONENTS[] = {1,3,0,2,4};
    public static final int ADD_METHOD_TC_5_COEFFS[] = {1,2,3,4,0};
    public static final boolean ADD_METHOD_TC_5_EXP_RETVALS[] = {true,true,true,true,false};

    public static final int ADD_METHOD_TC_6_EXPONENTS[] = {0,1,2,3};
    public static final int ADD_METHOD_TC_6_COEFFS[] = {4,3,2,1};
    public static final boolean ADD_METHOD_TC_6_EXP_RETVALS[] = {true,true,true,true};


    private float addMethodMark;
    private float reduceMethodMark;
    private float getDegreeMethodMark;
    private float getNodeMethodMark;
    private float toStringMethodMark;
    private float addPolysMethodMark;
    private float subtractPolysMethodMark;
    private float multiplyPolysMethodMark;


    /*
        createPolynomial creates a linked list representing a polynomial using the supplied 
        values of the coefficients and exponents. createPolynomial returns the resultant 
        polynomial if each test passes, and returns null if one or more tests fail.
        coeffs - array containing the coefficients of each term in the polynomial. The value
                 at element 0 of coeffs is the coefficient of the first term in the
                 polynomial; the value at element 1 is the coefficient of the second term etc
        exponents - array containing the exponents of each term in the polynomial. The value
                 at element 0 of exponents is the exponent of the first term in the
                 polynomial; the value at element 1 is the exponent of the second term etc
        exp_retvals (OPTN) - this method will set the expected retvals to true for each node
                             added to the linked list if exp_retvals is null
        Preconditions: coeffs not null, exponents not null, coeffs.length > 0
                       coeffs.length == exponents.length
                       if exp_retval not null then exp_retval.length == coeffs.length
   */
    private PolyList createPolynomial(int coeffs[], int exponents[], boolean exp_retvals[])
    {
        assert((coeffs != null) && (exponents != null) && 
                (coeffs.length == exponents.length) && ((exp_retvals == null) || 
                    (exp_retvals.length == coeffs.length)));
        PolyList retval = null;
        PolyList poly = new PolyList();
        PolyNode node = null;
        boolean status = true;
        boolean addNode_retval = true;
        int offset = 0;

        if (exp_retvals == null)
        {
            exp_retvals = new boolean[coeffs.length];

            for (int indx = 0; indx < exp_retvals.length; indx++)
            {
                exp_retvals[indx] = true;
            }
        }

        while (status && (offset < coeffs.length))
        {
            status = false;
            node = new PolyNode();
            node.exponent = exponents[offset];
            node.coefficient = coeffs[offset];

            try
            {
                if ((addNode_retval = poly.addNode(node)) == exp_retvals[offset])
                {
                    status = true;
                    offset++;
                }
                else
                {
                    System.out.printf("Error adding node with coefficient %d and" +
                            " exponent %d to polynomial \'%s\'. Expected retval" + 
                            " %b but got %b instead\n",coeffs[offset],
                            exponents[offset],poly.toString(),addNode_retval,
                            exp_retvals[offset]);
                }
            }
            catch (NullPointerException e)
            {
                System.out.println("addNode threw a NullPointerException");
            }
            catch (Exception e)
            {
                System.out.println("addNode threw the following exception:");
                e.printStackTrace();
            }
        }

        if (status)
        {
            retval = poly;
        }

        return retval;
    }


    /*
        readPolynomial "manually" constructs a polynomial from the data in
        the specified binary file and returns a reference to this 
        polynomial. readPolynomial returns null if it encounters an error 
        when creating the polynomial.

        Preconditions: filename not null
    */
    private PolyList readPolynomial(String filename) 
    {
        PolyList retval = null;
        int numNodes = 0;
        
        try
        {
            DataInputStream instream = 
                new DataInputStream(new FileInputStream(filename));
            numNodes = instream.readInt();
            PolyNode head = null;
            PolyNode tail = null;

            if (numNodes > 0)
            {
                int count = 0;
                int exp = 0;
                int coeff = 0;
                PolyNode node = null;

                while (count < numNodes)
                {
                    node = new PolyNode();
                    coeff = instream.readInt();
                    exp = instream.readInt();
                    node.coefficient = coeff;
                    node.exponent = exp;

                    if (head == null)
                    {
                        head = node;
                        tail = head;
                    }
                    else
                    {
                        tail.next = node;
                        node.previous = tail;
                        tail = node;
                    }

                    count++;
                }
            }

            PolyList poly = new PolyList();
            //use java reflection to access private head field in polylist
            Class polyClass = poly.getClass();
            Field headField = polyClass.getDeclaredField("head");
            headField.setAccessible(true);
            headField.set(poly, head);
            retval = poly;
            instream.close();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        return retval;
    }


    /*
        readData reads the first line of text only from the specified
        text file. if readData encounters an error it returns null

        Preconditions: filename not null
    */
    private String readData(String filename)
    {
        String retval = null;

        try
        {
            BufferedReader reader = 
                new BufferedReader(new FileReader(filename));
            retval = reader.readLine();
            reader.close();
        }
        catch (Exception e)
        {
            System.out.printf("could not read the file: %s\n",filename);
        }

        return retval;
    }


    public void markAddNodeMethod()
    {
        addMethodMark = 0;
        PolyList expPoly = null;
        PolyList poly = null;

        System.out.println();
        System.out.println("====================================================");
        System.out.println("marking addNode method of PolyList");

        System.out.println("running test case #1 - checking that addNode method correctly added to end of list");

        //test case #1: can add multiple nodes (tests that method can add nodes to end of list)
        if ((expPoly = readPolynomial("addNodeTC1.dat")) != null)
        {
            if ((poly = createPolynomial(ADD_METHOD_TC_1_COEFFS,ADD_METHOD_TC_1_EXPONENTS,
                            ADD_METHOD_TC_1_EXP_RETVALS)) != null)
            {
                if (expPoly.equals(poly))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,poly);
                    System.out.println("test case #1 passed");
                    addMethodMark += ADD_METHOD_TC_1_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,poly);
                    System.out.println("test case #1 failed");
                }
            }
            else
            {
                System.out.println("test case #1 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #1");
        }


        System.out.println("running test case #2 - checking that addNode method correctly adds nodes to head of list");

        //test case #2: can add multiple nodes in reverse order (tests that method can add nodes to head of list)
        if ((expPoly = readPolynomial("addNodeTC2.dat")) != null)
        {
            if ((poly = createPolynomial(ADD_METHOD_TC_2_COEFFS,ADD_METHOD_TC_2_EXPONENTS,
                            ADD_METHOD_TC_2_EXP_RETVALS)) != null)
            {
                if (expPoly.equals(poly))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,poly);
                    System.out.println("test case #2 passed");
                    addMethodMark += ADD_METHOD_TC_2_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,poly);
                    System.out.println("test case #2 failed");
                }
            }
            else
            {
                System.out.println("test case #2 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #2");
        }


        System.out.println("running test case #3 - checking that addNode method correctly adds nodes within list");

        //test case #3: can add multiple nodes in random order (tests that 
        //method can add nodes anywhere in list)
        if ((expPoly = readPolynomial("addNodeTC3.dat")) != null)
        {
            if ((poly = createPolynomial(ADD_METHOD_TC_3_COEFFS,ADD_METHOD_TC_3_EXPONENTS,
                            ADD_METHOD_TC_3_EXP_RETVALS)) != null)
            {
                if (expPoly.equals(poly))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,poly);
                    System.out.println("test case #3 passed");
                    addMethodMark += ADD_METHOD_TC_3_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,poly);
                    System.out.println("test case #3 failed"); 
                }
            }
            else
            {
                System.out.println("test case #3 failed");
            }

            System.out.println("running test case #4 - checking that addNode does not add node with same " + 
                    "exponent as a node already in list");

            //test case #4: does not add node with the same exponent - uses same 
            //polynomial from previous test
            if ((poly = createPolynomial(ADD_METHOD_TC_4_COEFFS,ADD_METHOD_TC_4_EXPONENTS,
                            ADD_METHOD_TC_4_EXP_RETVALS)) != null)
            {
                if (expPoly.equals(poly))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,poly);
                    System.out.println("test case #4 passed");
                    addMethodMark += ADD_METHOD_TC_4_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,poly);
                    System.out.println("test case #4 failed");
                }
            }
            else
            {
                System.out.println("test case #4 failed");
            }

            System.out.println("running test case #5 - checking that addNode does not add node with " + 
                    "a coefficient of 0 to head of list");

            //test case #5: does not add node with coefficient of 0 to head of 
            //list - uses same polynomial
            if ((poly = createPolynomial(ADD_METHOD_TC_5_COEFFS,ADD_METHOD_TC_5_EXPONENTS,
                            ADD_METHOD_TC_5_EXP_RETVALS)) != null)
            {
                if (expPoly.equals(poly))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,poly);
                    System.out.println("test case #5 passed");
                    addMethodMark += ADD_METHOD_TC_5_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,poly);
                    System.out.println("test case #5 failed");
                }
            }
            else
            {
                System.out.println("test case #5 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for " + 
                    "test cases 3, 4, and 5");
        }

        System.out.println("running test case #6 - checking that addNode method does not crash with null arg");

        //test case #6: check that addNode method does not fail when called with 
        //null argument
        if (((expPoly = createPolynomial(ADD_METHOD_TC_6_COEFFS,ADD_METHOD_TC_6_EXPONENTS,
                            ADD_METHOD_TC_6_EXP_RETVALS)) != null) && 
                ((poly = createPolynomial(ADD_METHOD_TC_6_COEFFS,ADD_METHOD_TC_6_EXPONENTS,
                                          ADD_METHOD_TC_6_EXP_RETVALS)) != null))
        {
            try
            {
                boolean exp_retval = false;
                boolean retval = poly.addNode(null);

                if (retval == exp_retval)
                {
                    System.out.printf("expected the return value: %b, got: %b\n", 
                            exp_retval,retval);

                    if (expPoly.equals(poly))
                    {
                        System.out.printf("expected the polynomial: %s, got: %s\n", 
                                expPoly,poly);
                        System.out.println("test case #6 passed");
                        addMethodMark += ADD_METHOD_TC_6_MARK;
                    }
                    else
                    {
                        System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                                expPoly,poly);
                        System.out.println("test case #6 failed");
                    }
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,poly);
                    System.out.printf("expected the return value: %b, but got: %b instead\n", 
                            exp_retval,retval);
                    System.out.println("test case #6 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your addNode method threw the exception:");
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("test case 6 blocked");
        }

        System.out.println("addNode method marking completed");
        System.out.println("====================================================");
    }


    public void markReduceMethod() 
    {
        PolyList expPoly = null;
        PolyList poly = null;
        reduceMethodMark = 0;

        System.out.println();
        System.out.println("====================================================");
        System.out.println("marking reduce method of PolyList");

        System.out.println("running test case #1 - checking that reduce method does not change polynomial " +
                "when there are no nodes with a coefficient of 0");

        //test case #1: test that method leaves polynomial unchanged when no 
        //nodes have 0 coefficient
        if (((poly = readPolynomial("reduceMethodTC1.dat")) != null) &&
                ((expPoly = readPolynomial("reduceMethodTC1.dat")) != null))
        {
            try
            {
                poly.reduce();

                if (expPoly.equals(poly))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,poly);
                    System.out.println("test case #1 passed");
                    reduceMethodMark += REDUCE_METHOD_TC_1_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,poly);
                    System.out.println("test case #1 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your reduce method threw the following exception: ");
                e.printStackTrace();
                System.out.println("test case #1 failed");
            }
        }
        else
        {
            System.out.println("test case 1 blocked");
        }

        System.out.println("running test case #2 - checking that reduce method correctly removes node from " + 
                "end of list with a coefficient of 0");

        //test case #2: test that method removes node with 0 coefficient from 
        //end of list
        if (((poly = readPolynomial("reduceMethodTC2.dat")) != null) &&
                ((expPoly = readPolynomial("expPolyReduceMethodTC2.dat")) != null))
        {
            try
            {
                poly.reduce();

                if (expPoly.equals(poly))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,poly);
                    System.out.println("test case #2 passed");
                    reduceMethodMark += REDUCE_METHOD_TC_2_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,poly);
                    System.out.println("test case #2 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your reduce method threw the following exception: ");
                e.printStackTrace();
                System.out.println("test case #2 failed");
            }
        }
        else
        {
            System.out.println("test case 2 blocked");
        }


        System.out.println("running test case #3 - checking that reduce method correctly removes all nodes " + 
                "from within list that have coefficents of 0");
        //test case #3: test that method removes node with 0 coefficient within list
        if (((poly = readPolynomial("reduceMethodTC3.dat")) != null) &&
                ((expPoly = readPolynomial("expPolyReduceMethodTC3.dat")) != null))
        {
            try
            {
                poly.reduce();

                if (expPoly.equals(poly))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,poly);
                    System.out.println("test case #3 passed");
                    reduceMethodMark += REDUCE_METHOD_TC_3_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,poly);
                    System.out.println("test case #3 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your reduce method threw the following exception: ");
                e.printStackTrace();
                System.out.println("test case #3 failed");
            }
        }
        else
        {
            System.out.println("test case 3 blocked");
        }


        System.out.println("running test case #4 - checking that reduce method does not crash when called" + 
                "with a polynomial with no terms");
        //test case #4: test that method does not fail when called with a polynomial with 
        //no terms
        expPoly = new PolyList();
        poly = new PolyList();

        try
        {
            poly.reduce();

            if (expPoly.equals(poly))
            {
                System.out.printf("expected the polynomial: %s, got: %s\n", 
                        expPoly,poly);
                System.out.println("test case #4 passed");
                reduceMethodMark += REDUCE_METHOD_TC_4_MARK;
            }
            else
            {
                System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                        expPoly,poly);
                System.out.println("test case #4 failed");
            }
        }
        catch (Exception e)
        {
            System.out.println("your reduce method threw the following exception: ");
            e.printStackTrace();
            System.out.println("test case #4 failed");
        }

        System.out.println("reduce method marking completed");
        System.out.println("====================================================");
    }


    public void markGetNodeMethod() 
    {
        getNodeMethodMark = 0;
        PolyList poly = null;
        PolyNode node = null;
        PolyNode expNode = null;
        int targetExponent = 3;
        int targetCoeff = 1;

        System.out.println();
        System.out.println("====================================================");
        System.out.println("marking getNode method of PolyList");

        if ((poly = readPolynomial("getNodeTC1.dat")) != null)
        {
            System.out.println("running test case #1 - checking that getNode method returns matching node");

            //test case #1: test that method finds node
            expNode = new PolyNode();
            expNode.coefficient = targetCoeff;
            expNode.exponent = targetExponent;

            try 
            {
                node = poly.getNode(targetExponent);

                if (expNode.equals(node))
                {
                    System.out.printf("expected the node: %s, got: %s\n", 
                            expNode,node);
                    System.out.println("test case #1 passed");
                    getNodeMethodMark += GET_NODE_METHOD_TC_1_MARK;
                }
                else
                {
                    System.out.printf("expected the node: %s, but got: %s instead\n", 
                            expNode,node);
                    System.out.println("test case #1 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your getNode method threw the following exception: ");
                e.printStackTrace();
                System.out.println("test case #1 failed");
            }


            System.out.println("running test case #2 - checking that getNode method returns null for non-existent exponent");

            //test case #2: test that method returns null for non-existent 
            //exponent value
            expNode = null;
            targetExponent = Integer.MAX_VALUE;

            try
            {
                node = poly.getNode(targetExponent);

                if (expNode == node)
                {
                    System.out.printf("expected the node: %s, got: %s\n", 
                            expNode,node);
                    System.out.println("test case #2 passed");
                    getNodeMethodMark += GET_NODE_METHOD_TC_2_MARK;
                }
                else
                {
                    System.out.printf("expected the node: %s, but got: %s instead\n", 
                            expNode,node);
                    System.out.println("test case #2 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your getNode method threw the following exception: ");
                e.printStackTrace();
                System.out.println("test case #2 failed");
            }
        }
        else
        {
            System.out.println("getNode test cases 1 and 2 blocked");
        }


        System.out.println("running test case #3 - checking that getNode method returns null for " + 
                "polynomial with no terms");

        //test case #3: test that method returns null for empty list

        try
        {
            targetExponent = 2;
            expNode = null;
            poly = new PolyList();
            node = poly.getNode(targetExponent);

            if (expNode == node)
            {
                System.out.printf("expected the node: %s, got: %s\n", 
                        expNode,node);
                System.out.println("test case #3 passed");
                getNodeMethodMark += GET_NODE_METHOD_TC_3_MARK;
            }
            else
            {
                System.out.printf("expected the node: %s, but got: %s instead\n", 
                        expNode,node);
                System.out.println("test case #3 failed");
            }
        }
        catch (Exception e)
        {
            System.out.println("your getNode method threw the following exception: ");
            e.printStackTrace();
            System.out.println("test case #3 failed");
        }

        System.out.println("reduce getNode marking completed");
        System.out.println("====================================================");
    }


    public void markGetDegreeMethod() 
    {
        getDegreeMethodMark = 0;
        PolyList poly = null;
        System.out.println();
        System.out.println("====================================================");
        System.out.println("marking getDegree method of PolyList");
        int exp_degree = 3;
        int degree = 0;

        System.out.println("running test case #1 - checking that getDegree method returns correct degree " + 
                "of node at head of list");

        //test case #1: test that method returns exponent of first node in list
        if ((poly = readPolynomial("getDegreeTC1.dat")) != null)
        {
            try
            {
                degree = poly.getDegree();

                if (degree == exp_degree)
                {
                    System.out.printf("expected the degree: %d, got: %d\n", 
                            exp_degree, degree);
                    System.out.println("test case #1 passed");
                    getDegreeMethodMark += DEGREE_METHOD_TC_1_MARK;
                }
                else
                {
                    System.out.printf("expected the degree: %d, but got instead: %d\n", 
                            exp_degree, degree);
                    System.out.println("test case #1 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your getDegree method threw the following exception: ");
                e.printStackTrace();
                System.out.println("test case #3 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #1");
        }

        System.out.println("running test case #2 - checking that getDegree returns -1 when polynomial has no terms");

        //test case #2: test that method returns -1 if list empty and does not 
        //throw an exception
        poly = new PolyList();
        exp_degree = PolyList.EMPTY_LIST;

        try
        {
            degree = poly.getDegree();

            if (degree == exp_degree)
            {
                System.out.printf("expected the degree: %d, got: %d\n", 
                        exp_degree, degree);
                System.out.println("test case #2 passed");
                getDegreeMethodMark += DEGREE_METHOD_TC_2_MARK;
            }
            else
            {
                System.out.printf("expected the degree: %d, but got instead: %d\n", 
                        exp_degree, degree);
                System.out.println("test case #2 failed");
            }
        }
        catch (Exception e)
        {
            System.out.println("your getDegree method threw the following exception: ");
            e.printStackTrace();
            System.out.println("test case #3 failed");
        }

        System.out.println("getDegree method marking completed");
        System.out.println("====================================================");
    }


    public void markToStringMethod()
    {
        System.out.println();
        System.out.println("====================================================");
        System.out.println("marking toString method of PolyList");
        String exp_str = null;
        String str = null;
        PolyList poly = null;

        System.out.println("running test case #1 - checking that toString returns correctly formated " + 
                "string when polynomial terms are added");
        //test case #1: check that toString returns correct string 
        //representation for a valid polynomial with terms only added
        if (((poly = readPolynomial("toStringTC1.dat")) != null) &&
            ((exp_str = readData("toStringTC1.txt")) != null))
        {
            try
            {
                str = poly.toString();

                if (exp_str.equals(str))
                {
                    System.out.printf("expected the string: %s, got: %s\n",
                            exp_str, str);
                    System.out.println("test case #1 passed");
                    toStringMethodMark += TO_STRING_METHOD_TC_1_MARK;
                }
                else
                {
                    System.out.printf("expected the string: %s, but got instead: %s\n",
                            exp_str, str);
                    System.out.println("test case #1 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your toString method threw the following exception: ");
                e.printStackTrace();
                System.out.println("test case #3 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #1");
        }

        System.out.println("running test case #2 - checking that toString returns correctly formatted " + 
                "string when some terms of polynomial are subtracted");
        //test case #2: check that toString returns correct string representation 
        //for a valid polynomial with some terms subtracted
        if (((poly = readPolynomial("toStringTC2.dat")) != null) &&
            ((exp_str = readData("toStringTC2.txt")) != null))
        {
            try
            {
                str = poly.toString();

                if (exp_str.equals(str))
                {
                    System.out.printf("expected the string: %s, got: %s\n",
                            exp_str, str);
                    System.out.println("test case #2 passed");
                    toStringMethodMark += TO_STRING_METHOD_TC_2_MARK;
                }
                else
                {
                    System.out.printf("expected the string: %s, but got instead: %s\n",
                            exp_str, str);
                    System.out.println("test case #2 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your toString method threw the following exception: ");
                e.printStackTrace();
                System.out.println("test case #3 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #2");
        }

        System.out.println("running test case #3 - checking that toString returns the string: \"\" when " + 
                "a polynomial does not have any terms");

        //test case #3: check that toString returns empty string and
        //does not throw an exception when list empty
        exp_str = "";
        poly = new PolyList();

        try
        {
            str = poly.toString();

            if (exp_str.equals(str))
            {
                System.out.printf("expected the string: \"\", got: \"%s\"\n",str);
                System.out.println("test case #3 passed");
                toStringMethodMark += TO_STRING_METHOD_TC_3_MARK;
            }
            else
            {
                System.out.printf("expected the string: \"\", but got instead: %s\n",
                        str);
                System.out.println("test case #3 failed");
            }
        }
        catch (Exception e)
        {
            System.out.println("your toString method threw the following exception: ");
            e.printStackTrace();
            System.out.println("test case #3 failed");
        }

        System.out.println("toString method marking completed");
        System.out.println("====================================================");
    }


    public void markAddPolysMethod()
    {
        System.out.println();
        System.out.println("====================================================");
        System.out.println("marking addPolys method of PolyOps");
        PolyOps ops = new PolyOps();
        PolyList operand1 = null;
        PolyList operand2 = null;
        PolyList negExponentPoly = null;
        PolyList expPoly = null;
        PolyList result = null;
        addPolysMethodMark  = 0;

        System.out.println("running test case #1 - checking that addPolys throws exception when first " + 
                "argument is null");
        //test case 1: check that addPolys throws illegal argument exception when
        //the first argument is null

        if ((operand2 = readPolynomial("addPolysTC2.dat")) != null)
        {
            try
            {
                ops.addPolys(null,operand2);
                System.out.println("addPolys did not throw an exception as expected");
                System.out.println("test case #1 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #1 passed");
                addPolysMethodMark += ADD_POLYS_METHOD_TC_1_MARK;
            }
            catch (Exception e)
            {
                System.out.println("addPolys threw an exception but not the right one");
                System.out.println("test case #1 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #1");
        }

        System.out.println("running test case #2 - checking that addPolys throws exception when second " + 
                "argument is null");

        //test case 2: check that addPolys throws illegal argument exception when
        //the first argument is null
        if ((operand1 = readPolynomial("addPolysTC1.dat")) != null)
        {
            try
            {
                ops.addPolys(operand1,null);
                System.out.println("addPolys did not throw an exception as expected");
                System.out.println("test case #2 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #2 passed");
                addPolysMethodMark += ADD_POLYS_METHOD_TC_2_MARK;
            }
            catch (Exception e)
            {
                System.out.println("addPolys threw an exception but not the right one");
                System.out.println("test case #2 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #2");
        }


        System.out.println("running test case #3 - checking that addPolys correctly adds two valid polys");

        //test case 3: check that addPolys correctly adds two polynomials
        if ((operand1 != null) && (operand2 != null) && 
                ((expPoly = readPolynomial("addPolysTC3.dat")) != null))
        {
            try
            {
                result = ops.addPolys(operand1,operand2);

                if (expPoly.equals(result))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,result);
                    System.out.println("test case #3 passed");
                    addPolysMethodMark += ADD_POLYS_METHOD_TC_3_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,result);
                    System.out.println("test case #3 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your addPolys method threw the following exception:");
                e.printStackTrace();
                System.out.println("test case #3 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #3");
        }


        if ((negExponentPoly = readPolynomial("negExponentPoly.dat")) != null)
        {
            System.out.println("running test case #4 - checking that addPolys throws exception when first " + 
                    "argument contains negative exponents");

            //test case 4: check that addPolys throws illegal argument exception when
            //the first argument contains a negative exponent
            try
            {
                ops.addPolys(negExponentPoly,operand2);
                System.out.println("addPolys did not throw an exception as expected");
                System.out.println("test case #4 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #4 passed");
                addPolysMethodMark += ADD_POLYS_METHOD_TC_4_MARK;
            }
            catch (Exception e)
            {
                System.out.println("addPolys threw an exception but not the right one");
                System.out.println("test case #4 failed");
            }

            System.out.println("running test case #5 - checking that addPolys throws exception when " + 
                    "second argument contains negative exponents");

            //test case 5: check that addPolys throws illegal argument exception when
            //the second argument contains a negative exponent
            try
            {
                ops.addPolys(operand1,negExponentPoly);
                System.out.println("addPolys did not throw an exception as expected");
                System.out.println("test case #5 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #5 passed");
                addPolysMethodMark += ADD_POLYS_METHOD_TC_5_MARK;
            }
            catch (Exception e)
            {
                System.out.println("addPolys threw an exception but not the right one");
                System.out.println("test case #5 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #2");
        }

        System.out.println("addPolys method marking completed");
        System.out.println("====================================================");
    }


    public void markSubtractPolysMethod()
    {
        System.out.println();
        System.out.println("====================================================");
        System.out.println("marking subtractPolys method of PolyOps");

        PolyOps ops = new PolyOps();
        PolyList operand1 = null;
        PolyList operand2 = null;
        PolyList negExponentPoly = null;
        PolyList expPoly = null;
        PolyList result = null;
        subtractPolysMethodMark  = 0;

        System.out.println("running test case #1 - checking that subtractPolys throws exception when first " + 
                "argument is null");
        //test case 1: check that subtractPolys throws illegal argument exception when
        //the first argument is null

        if ((operand2 = readPolynomial("subtractPolysTC2.dat")) != null)
        {
            try
            {
                ops.subtractPolys(null,operand2);
                System.out.println("subtractPolys did not throw an exception as expected");
                System.out.println("test case #1 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #1 passed");
                subtractPolysMethodMark += SUBTRACT_POLYS_METHOD_TC_1_MARK;
            }
            catch (Exception e)
            {
                System.out.println("subtractPolys threw an exception but not the right one");
                System.out.println("test case #1 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #1");
        }

        System.out.println("running test case #2 - checking that subtractPolys throws exception when second " + 
                "argument is null");

        //test case 2: check that subtractPolys throws illegal argument exception when
        //the first argument is null
        if ((operand1 = readPolynomial("subtractPolysTC1.dat")) != null)
        {
            try
            {
                ops.subtractPolys(operand1,null);
                System.out.println("subtractPolys did not throw an exception as expected");
                System.out.println("test case #2 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #2 passed");
                subtractPolysMethodMark += SUBTRACT_POLYS_METHOD_TC_2_MARK;
            }
            catch (Exception e)
            {
                System.out.println("subtractPolys threw an exception but not the right one");
                System.out.println("test case #2 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #2");
        }


        System.out.println("running test case #3 - checking that subtractPolys correctly subtracts two valid polys");


        //test case 3: check that subtractPolys correctly subtracts two polynomials
        if ((operand1 != null) && (operand2 != null) && 
                ((expPoly = readPolynomial("subtractPolysTC3.dat")) != null))
        {
            try
            {
                result = ops.subtractPolys(operand1,operand2);

                if (expPoly.equals(result))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,result);
                    System.out.println("test case #3 passed");
                    subtractPolysMethodMark += SUBTRACT_POLYS_METHOD_TC_3_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,result);
                    System.out.println("test case #3 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your subtractPolys method threw the following exception:");
                e.printStackTrace();
                System.out.println("test case #3 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #3");
        }


        if ((negExponentPoly = readPolynomial("negExponentPoly.dat")) != null)
        {
            System.out.println("running test case #4 - checking that subtractPolys throws exception when first " + 
                    "argument contains negative exponents");

            //test case 4: check that subtractPolys throws illegal argument exception when
            //the first argument contains a negative exponent
            try
            {
                ops.subtractPolys(negExponentPoly,operand2);
                System.out.println("subtractPolys did not throw an exception as expected");
                System.out.println("test case #4 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #4 passed");
                subtractPolysMethodMark += SUBTRACT_POLYS_METHOD_TC_4_MARK;
            }
            catch (Exception e)
            {
                System.out.println("subtractPolys threw an exception but not the right one");
                System.out.println("test case #4 failed");
            }

            System.out.println("running test case #5 - checking that subtractPolys throws exception when " + 
                    "second argument contains negative exponents");

            //test case 5: check that subtractPolys throws illegal argument exception when
            //the second argument contains a negative exponent
            try
            {
                ops.subtractPolys(operand1,negExponentPoly);
                System.out.println("subtractPolys did not throw an exception as expected");
                System.out.println("test case #5 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #5 passed");
                subtractPolysMethodMark += SUBTRACT_POLYS_METHOD_TC_5_MARK;
            }
            catch (Exception e)
            {
                System.out.println("subtractPolys threw an exception but not the right one");
                System.out.println("test case #5 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #2");
        }


        System.out.println("subtractPolys method marking completed");
        System.out.println("====================================================");
    }


    public void markMultiplyPolysMethod()
    {
        System.out.println();
        System.out.println("====================================================");
        System.out.println("marking multiplyPolys method of PolyOps");

        PolyOps ops = new PolyOps();
        PolyList operand1 = null;
        PolyList operand2 = null;
        PolyList negExponentPoly = null;
        PolyList expPoly = null;
        PolyList result = null;
        multiplyPolysMethodMark  = 0;

        System.out.println("running test case #1 - checking that multiplyPolys throws exception when first " + 
                "argument is null");
        //test case 1: check that multiplyPolys throws illegal argument exception when
        //the first argument is null

        if ((operand2 = readPolynomial("multiplyPolysTC1.dat")) != null)
        {
            try
            {
                ops.multiplyPolys(null,operand2);
                System.out.println("multiplyPolys did not throw an exception as expected");
                System.out.println("test case #1 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #1 passed");
                multiplyPolysMethodMark += MULTIPLY_POLYS_METHOD_TC_1_MARK;
            }
            catch (Exception e)
            {
                System.out.println("multiplyPolys threw an exception but not the right one");
                System.out.println("test case #1 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #1");
        }

        System.out.println("running test case #2 - checking that multiplyPolys throws exception when second " + 
                "argument is null");

        //test case 2: check that multiplyPolys throws illegal argument exception when
        //the first argument is null
        if ((operand1 = readPolynomial("multiplyPolysTC2.dat")) != null)
        {
            try
            {
                ops.multiplyPolys(operand1,null);
                System.out.println("multiplyPolys did not throw an exception as expected");
                System.out.println("test case #2 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #2 passed");
                multiplyPolysMethodMark += MULTIPLY_POLYS_METHOD_TC_2_MARK;
            }
            catch (Exception e)
            {
                System.out.println("multiplyPolys threw an exception but not the right one");
                System.out.println("test case #2 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #2");
        }


        System.out.println("running test case #3 - checking that multiplyPolys correctly adds two valid polys");

        //test case 3: check that multiplyPolys correctly multiplys two polynomials
        if ((operand1 != null) && (operand2 != null) && 
                ((expPoly = readPolynomial("multiplyPolysTC3.dat")) != null))
        {
            try
            {
                result = ops.multiplyPolys(operand1,operand2);

                if (expPoly.equals(result))
                {
                    System.out.printf("expected the polynomial: %s, got: %s\n", 
                            expPoly,result);
                    System.out.println("test case #3 passed");
                    multiplyPolysMethodMark += MULTIPLY_POLYS_METHOD_TC_3_MARK;
                }
                else
                {
                    System.out.printf("expected the polynomial: %s, but got: %s instead\n", 
                            expPoly,result);
                    System.out.println("test case #3 failed");
                }
            }
            catch (Exception e)
            {
                System.out.println("your multiplyPolys method threw the following exception:");
                e.printStackTrace();
                System.out.println("test case #3 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #3");
        }


        if ((negExponentPoly = readPolynomial("negExponentPoly.dat")) != null)
        {
            System.out.println("running test case #4 - checking that multiplyPolys throws exception when first " + 
                    "argument contains negative exponents");

            //test case 4: check that multiplyPolys throws illegal argument exception when
            //the first argument contains a negative exponent
            try
            {
                ops.multiplyPolys(negExponentPoly,operand2);
                System.out.println("multiplyPolys did not throw an exception as expected");
                System.out.println("test case #4 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #4 passed");
                multiplyPolysMethodMark += MULTIPLY_POLYS_METHOD_TC_4_MARK;
            }
            catch (Exception e)
            {
                System.out.println("multiplyPolys threw an exception but not the right one");
                System.out.println("test case #4 failed");
            }

            System.out.println("running test case #5 - checking that multiplyPolys throws exception when " + 
                    "second argument contains negative exponents");

            //test case 5: check that multiplyPolys throws illegal argument exception when
            //the second argument contains a negative exponent
            try
            {
                ops.multiplyPolys(operand1,negExponentPoly);
                System.out.println("multiplyPolys did not throw an exception as expected");
                System.out.println("test case #5 failed");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("test case #5 passed");
                multiplyPolysMethodMark += MULTIPLY_POLYS_METHOD_TC_5_MARK;
            }
            catch (Exception e)
            {
                System.out.println("multiplyPolys threw an exception but not the right one");
                System.out.println("test case #5 failed");
            }
        }
        else
        {
            System.out.println("test blocked - could not read golden data for test case #2");
        }

        System.out.println("multiplyPolys method marking completed");
        System.out.println("====================================================");
    }


    public void printMark()
    {
        System.out.println("\n");
        System.out.println("===================== MARKS ========================");
        System.out.printf("addNode method mark: %2.1f out of %2.1f\n",
                addMethodMark,MAX_ADD_METHOD_MARK);
        System.out.printf("reduce method mark: %2.1f out of %2.1f\n",
                reduceMethodMark,MAX_REDUCE_METHOD_MARK);
        System.out.printf("getNode method mark: %2.1f out of %2.1f\n",
                getNodeMethodMark,MAX_GET_NODE_METHOD_MARK);
        System.out.printf("getDegree method mark: %2.1f out of %2.1f\n",
                getDegreeMethodMark,MAX_DEGREE_METHOD_MARK);
        System.out.printf("toString method mark: %2.1f out of %2.1f\n",
                toStringMethodMark,MAX_TO_STRING_METHOD_MARK);
        System.out.printf("addPolys method mark: %2.1f out of %2.1f\n",
                addPolysMethodMark,MAX_ADD_POLYS_METHOD_MARK);
        System.out.printf("subtractPolys method mark: %2.1f out of %2.1f\n",
                subtractPolysMethodMark,MAX_SUBTRACT_POLYS_METHOD_MARK);
        System.out.printf("multiplyPolys method mark: %2.1f out of %2.1f\n",
                multiplyPolysMethodMark,MAX_MULTIPLY_POLYS_METHOD_MARK);

        System.out.printf("\nTotal Marks: %2.1f out of %2.1f\n",
                (addMethodMark + reduceMethodMark + getDegreeMethodMark +
                 getNodeMethodMark  + toStringMethodMark + addPolysMethodMark +
                 subtractPolysMethodMark + multiplyPolysMethodMark), 
                MAX_TOTAL_MARK);
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Marking report complete");
    }


    public static void main(String args[])
    {
        Assignment1Marker marker = new Assignment1Marker();

        try
        {
            marker.markAddNodeMethod();
            marker.markReduceMethod();
            marker.markGetNodeMethod();
            marker.markGetDegreeMethod();
            marker.markToStringMethod();
            marker.markAddPolysMethod();
            marker.markSubtractPolysMethod();
            marker.markMultiplyPolysMethod();
            marker.printMark();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Congratulations, your code threw an error that I didn't " + 
                    "think was possible!!! Sorry but no extra marks for such an amazing " + 
                    "achievement - just more work for you to fix the problem :P");
        }
    }
}
