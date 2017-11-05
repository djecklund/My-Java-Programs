/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customlinkedlist;

/**
 *
 * @author Dillon
 */
public class LinkedList {
    
    public Node stringHead, intHead, doubleHead, floatHead, longHead;
    public int stringListCounter, intListCounter, doubleListCounter, floatListCounter, longListCounter;
    public String stringListContents, intListContents, doubleListContents, floatListContents, longListContents;
    
    public LinkedList(){
        stringHead = new Node();
        intHead = new Node();
        doubleHead = new Node();
        floatHead = new Node();
        longHead = new Node();
        
        stringListCounter = intListCounter = doubleListCounter = floatListCounter = longListCounter = 0;
        stringListContents = intListContents = doubleListContents = floatListContents = longListContents = "";
    }
    
    // show methods
    // showStringData method
    public String showStringData(){
        
        Node current;
        
        current = stringHead;
        
        stringListContents = stringHead.stringData;

        while(current.nextString != null){            
            System.out.print(current.stringData + " -> ");
            current = current.nextString;
            stringListContents += " --> " + current.stringData;
        }

        System.out.println(current.stringData);
        
        return stringListContents;
    }
    // End of showStringData method
    
    // showIntegerData method
    public String showIntegerData(){
        
        Node current = intHead;
        
        intListContents = "" + intHead.intData;
        
        while(current.nextInt != null){
            System.out.print(current.intData + " -> ");
            current = current.nextInt;
            intListContents += " --> " + current.intData;
        }
        
        System.out.println(current.intData);
        
        return intListContents;
    }
    // End of showIntegerData method
    
    // showDoubleData method
    public String showDoubleData(){
        
        Node current = doubleHead;
        
        doubleListContents = "" + doubleHead.doubleData;
        
        while(current.nextDouble != null){
            System.out.print(current.doubleData + " -> ");
            current = current.nextDouble;
            doubleListContents += " --> " + current.doubleData;
        }
        
        System.out.println(current.doubleData);
        
        return doubleListContents;
    }
    // End of showDoubleData method
    
    // showFloatData method
    public String showFloatData(){
        
        Node current = floatHead;
        
        floatListContents = "" + floatHead.floatData;
        
        while(current.nextFloat != null){
            System.out.print(current.floatData + " -> ");
            current = current.nextFloat;
            floatListContents += " --> " + current.floatData;
        }
        
        System.out.println(current.floatData);
        
        return floatListContents;
    }
    // Emd of showFloatData method
    
    // showLongData method
    public String showLongData(){
        
        Node current = longHead;
        
        longListContents = "" + longHead.longData;
        
        while(current.nextLong != null){
            System.out.print(current.longData + " -> ");
            current = current.nextLong;
            longListContents += " --> " + current.longData;
        }
        
        System.out.println(current.longData);
        return longListContents;
        
    }
    // End of showLongData method
    // End of showData methods
    
    // Add node to the end of the LinkedList
    // adding String method
    public boolean add(String d){
        
        Node end = new Node(d);
        Node current = stringHead;
        
        while(current.nextString != null){
            current = current.nextString;
        }
        
        current.nextString = end;
        stringListCounter++;
        System.out.println(d + " appended to tail!!!");
        return true;
    }
    // End of add String method
    
    // adding Integer method
    public boolean add(int d){
        
        Node end = new Node(d);
        Node current = intHead;
        
        while(current.nextInt != null){
            current = current.nextInt;
        }
        
        current.nextInt = end;
        intListCounter++;
        System.out.println(d + " appended to tail!!!");
        return true;
    }
    // End of add Integer method
    
    // Adding Double method
    public boolean add(double d){
        
        Node end = new Node(d);
        Node current = doubleHead;
        
        while(current.nextDouble != null){
            current = current.nextDouble;
        }
        
        current.nextDouble = end;
        doubleListCounter++;
        System.out.println(d + " appended to tail!!!");
        return true;
    }
    // End of add Double method
    
    // Adding Float method
    public boolean add(float d){
        
        Node end = new Node(d);
        Node current = floatHead;
        
        while(current.nextFloat != null){
            current = current.nextFloat;
        }
        
        current.nextFloat = end;
        floatListCounter++;
        System.out.println(d + " appended to tail!!!");
        return true;
    }
    // End of add Float method
    
    // Adding Long method
    public boolean add(long d){
        
        Node end = new Node(d);
        Node current = longHead;
        
        while(current.nextLong != null){
            current = current.nextLong;
        }
        
        current.nextLong = end;
        longListCounter++;
        System.out.println(d + " appended to tail!!!");
        return true;
    }
    // End of add Long method
    // End of add method
    
    // second add method ( adds node at specified index)
    public boolean add(String d, int index){
        
        Node end = new Node(d);
        Node current = stringHead;
        int jump;
        
        // Check if the index the user enters is greater than the number of nodes in the
        // Linked list or the index is before the first node in the Linked list.
        // If either of these conditions are met, don't add the node.
        if(index > stringListCounter || index < 0){
            System.out.println("Add failed: index out of bounds of size of linked list!");
            return false;
        }
        else{
            
            jump = 0;
            
            // If the conditions wern't met, jump to the index and add the node. 
            // Lastly set the node after the node you created to the next index value
            // and add one to the listCount.
            while(jump < index){
                current = current.nextString;
                jump++;
            }
            
            end.nextString = current.nextString;
            current.nextString = end;
            stringListCounter++;
            System.out.println("Success! " + d + " added at index " + index);
            
            return true;
            
        }
                
    }
    // Emd of add String to index method
    
    // second add method ( adds node at specified index)
    public boolean add(int d, int index){
        
        Node end = new Node(d);
        Node current = intHead;
        int jump;
        
        // Check if the index the user enters is greater than the number of nodes in the
        // Linked list or the index is before the first node in the Linked list.
        // If either of these conditions are met, don't add the node.
        if(index > intListCounter || index < 0){
            System.out.println("Add failed: index out of bounds of size of linked list!");
            return false;
        }
        else{
            
            jump = 0;
            
            // If the conditions wern't met, jump to the index and add the node. 
            // Lastly set the node after the node you created to the next index value
            // and add one to the listCount.
            while(jump < index){
                current = current.nextInt;
                jump++;
            }
            
            end.nextInt = current.nextInt;
            current.nextInt = end;
            intListCounter++;
            System.out.println("Success! " + d + " added at index " + index);
            
            return true;
            
        }
                
    }
    // Emd of add Integer to index method
    
    // second add method ( adds node at specified index)
    public boolean add(double d, int index){
        
        Node end = new Node(d);
        Node current = doubleHead;
        int jump;
        
        // Check if the index the user enters is greater than the number of nodes in the
        // Linked list or the index is before the first node in the Linked list.
        // If either of these conditions are met, don't add the node.
        if(index > doubleListCounter || index < 0){
            System.out.println("Add failed: index out of bounds of size of linked list!");
            return false;
        }
        else{
            
            jump = 0;
            
            // If the conditions wern't met, jump to the index and add the node. 
            // Lastly set the node after the node you created to the next index value
            // and add one to the listCount.
            while(jump < index){
                current = current.nextDouble;
                jump++;
            }
            
            end.nextDouble = current.nextDouble;
            current.nextDouble = end;
            doubleListCounter++;
            System.out.println("Success! " + d + " added at index " + index);
            
            return true;
            
        }
                
    }
    // Emd of add Double to index method
    
    // second add method ( adds node at specified index)
    public boolean add(float d, int index){
        
        Node end = new Node(d);
        Node current = floatHead;
        int jump;
        
        // Check if the index the user enters is greater than the number of nodes in the
        // Linked list or the index is before the first node in the Linked list.
        // If either of these conditions are met, don't add the node.
        if(index > floatListCounter || index < 0){
            System.out.println("Add failed: index out of bounds of size of linked list!");
            return false;
        }
        else{
            
            jump = 0;
            
            // If the conditions wern't met, jump to the index and add the node. 
            // Lastly set the node after the node you created to the next index value
            // and add one to the listCount.
            while(jump < index){
                current = current.nextFloat;
                jump++;
            }
            
            end.nextFloat = current.nextFloat;
            current.nextFloat = end;
            floatListCounter++;
            System.out.println("Success! " + d + " added at index " + index);
            
            return true;
            
        }
                
    }
    // Emd of add Float to index method
    
    // second add method ( adds node at specified index)
    public boolean add(long d, int index){
        
        Node end = new Node(d);
        Node current = longHead;
        int jump;
        
        // Check if the index the user enters is greater than the number of nodes in the
        // Linked list or the index is before the first node in the Linked list.
        // If either of these conditions are met, don't add the node.
        if(index > longListCounter || index < 0){
            System.out.println("Add failed: index out of bounds of size of linked list!");
            return false;
        }
        else{
            
            jump = 0;
            
            // If the conditions wern't met, jump to the index and add the node. 
            // Lastly set the node after the node you created to the next index value
            // and add one to the listCount.
            while(jump < index){
                current = current.nextLong;
                jump++;
            }
            
            end.nextLong = current.nextLong;
            current.nextLong = end;
            longListCounter++;
            System.out.println("Success! " + d + " added at index " + index);
            
            return true;
            
        }
                
    }
    // Emd of add Long to index method
    // End of second add method
    
    // deleteNodeWithData method
    public boolean deleteNodeWithData(String d){
        
        Node current = stringHead;
        
        // If there aren't any nodes in the linked list, ignore this while loop.
        // If there are nodes, find the node thats data is equal to what the user
        // entered. If it is equal, set the current index's data value equal to the next index's data value.
        // Finally, remove one from the listCount.
        while(current.nextString != null){
            if(current.nextString.stringData.equalsIgnoreCase(d)){
                current.nextString = current.nextString.nextString;
                stringListCounter--;
                System.out.println("Success! Node with data " + d + " deleted.");
                return true;
            }
            current = current.nextString;
        }
        System.out.println("Delete Failed: No node found with given data!");
        return false;
        
    }
    // End of deleteNodeWithData
    
    // deleteNodeAtIndex method
    public boolean deleteNodeAtIndex(int index){
    	
        Node current = stringHead;
    	int jump;
        
        // If the index the user entered is greater than the number of nodes in the linked list or the index
        // is less than 0,(looking at less than the first node) show an error message.
    	if(index > stringListCounter || index < 0){
            System.out.println("Delete Failed: index out of bounds of size of linked list!!");
            return false;
    	}
    	else{
            
            jump = 0;
            
            // If the conditions above are not met, jump to the index specified and set the current node
            // equal to the next node's value.(This will essentially cause the current node to be erased)
            // Finally, subtract one from the listCount.
            while(jump < index){
    		current = current.nextString;
    		jump++;
            }
            
            current.nextString = current.nextString.nextString;
            System.out.println("Success! Node at index " + index + " deleted.");
            stringListCounter--;
            return true;
    	}
    }
    // End of deleteNodeAtIndex method
    
    // find method
    // find String method
    public String find(String data){
        
        Node current = stringHead;
        String name = "";
        boolean found = false;
        
        // Find the node with the data that the user specifies and return that node and every node after it
        // that are connected to it.
        while(current.nextString != null){
            if(current.nextString.stringData.equalsIgnoreCase(data) && found == false){
                name = current.nextString.stringData;
                System.out.println("Success! Node with data " + data + " found.");
                found = true;
                
            }
            else if(!current.nextString.stringData.equalsIgnoreCase(data) && found == true){
                name += "-->" + current.nextString.stringData;
                current = current.nextString;
            }
            else{
                current = current.nextString;
            }
        }
        System.out.println("Find failed: No node found with given data!");
        return name;
    }
    // End of find String method
    
    // find Integer method
    public String find(int d){
        
        Node current = intHead;
        int data = d;
        String collectDescendents = "";
        boolean found = false;
        
        // Find the node with the data that the user specifies and return that node and every node after it
        // that are connected to it.
        while(current.nextInt != null){
            if(current.nextInt.intData == data && found == false){
                data = current.nextInt.intData;
                collectDescendents = "" + data;
                System.out.println("Success! Node with data " + data + " found.");
                found = true;
                
            }
            else if(current.nextInt.intData != data && found == true){
                collectDescendents += " --> " + current.nextInt.intData;
                current = current.nextInt;
            }
            else{
                current = current.nextInt;
            }
        }
        System.out.println("Find failed: No node found with given data!");
        return collectDescendents;
        
    }
    // end of find Integer method
    
    // find Double method
    public String find(double d){
        
        Node current = doubleHead;
        double data = d;
        String collectDescendents = "";
        boolean found = false;
        
        // Find the node with the data that the user specifies and return that node and every node after it
        // that are connected to it.
        while(current.nextDouble != null){
            if(current.nextDouble.doubleData == data && found == false){
                data = current.nextDouble.doubleData;
                collectDescendents = "" + data;
                System.out.println("Success! Node with data " + data + " found.");
                found = true;
                
            }
            else if(current.nextDouble.doubleData != data && found == true){
                collectDescendents += " --> " + current.nextDouble.doubleData;
                current = current.nextDouble;
            }
            else{
                current = current.nextDouble;
            }
        }
        System.out.println("Find failed: No node found with given data!");
        return collectDescendents;
        
    }
    // end of find Double method
    
    // find Float method
    public String find(float d){
        
        Node current = floatHead;
        float data = d;
        String collectDescendents = "";
        boolean found = false;
        
        // Find the node with the data that the user specifies and return that node and every node after it
        // that are connected to it.
        while(current.nextFloat != null){
            if(current.nextFloat.floatData == data && found == false){
                data = current.nextFloat.floatData;
                collectDescendents = "" + data;
                System.out.println("Success! Node with data " + data + " found.");
                found = true;
                
            }
            else if(current.nextFloat.floatData != data && found == true){
                collectDescendents += " --> " + current.nextFloat.floatData;
                current = current.nextFloat;
            }
            else{
                current = current.nextFloat;
            }
        }
        System.out.println("Find failed: No node found with given data!");
        return collectDescendents;
        
    }
    // end of find Float method
    
    // find Long method
    public String find(long d){
        
        Node current = longHead;
        long data = d;
        String collectDescendents = "";
        boolean found = false;
        
        // Find the node with the data that the user specifies and return that node and every node after it
        // that are connected to it.
        while(current.nextLong != null){
            if(current.nextLong.longData == data && found == false){
                data = current.nextLong.longData;
                collectDescendents = "" + data;
                System.out.println("Success! Node with data " + data + " found.");
                found = true;
                
            }
            else if(current.nextLong.longData != data && found == true){
                collectDescendents += " --> " + current.nextLong.longData;
                current = current.nextLong;
            }
            else{
                current = current.nextLong;
            }
        }
        System.out.println("Find failed: No node found with given data!");
        return collectDescendents;
        
    }
    // end of find Long method
    // End of find method
    
}
