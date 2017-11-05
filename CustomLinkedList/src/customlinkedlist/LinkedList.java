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
    
    public Node head;
    public int listCounter;
    public String listContents;
    
    public LinkedList(){
        head = new Node();
        listCounter = 0;
        listContents = "";
    }
    
    // Display the data in the LinkedList
    public String showData(){
        
        Node current = head;
        
        listContents = head.stringData;
        
        while(current.next != null){            
            System.out.print(current.stringData + " -> ");
            current = current.next;
            listContents += " --> " + current.stringData;
        }
        
        System.out.println(current.stringData);
        
        return listContents;
    }
    // End of showData method
    
    // Add node to the end of the LinkedList
    public boolean add(String d){
        
        Node end = new Node(d);
        Node current = head;
        
        while(current.next != null){
            current = current.next;
        }
        
        current.next = end;
        listCounter++;
        System.out.println(d + " appended to tail!!!");
        return true;
    }
    // End of add method
    
    // second add method ( adds node at specified index)
    public boolean add(String d, int index){
        
        Node end = new Node(d);
        Node current = head;
        int jump;
        
        // Check if the index the user enters is greater than the number of nodes in the
        // Linked list or the index is before the first node in the Linked list.
        // If either of these conditions are met, don't add the node.
        if(index > listCounter || index < 0){
            System.out.println("Add failed: index out of bounds of size of linked list!");
            return false;
        }
        else{
            
            jump = 0;
            
            // If the conditions wern't met, jump to the index and add the node. 
            // Lastly set the node after the node you created to the next index value
            // and add one to the listCount.
            while(jump < index){
                current = current.next;
                jump++;
            }
            
            end.next = current.next;
            current.next = end;
            listCounter++;
            System.out.println("Success! " + d + " added at index " + index);
            
            return true;
            
        }
                
    }
    // End of second add method
    
    // deleteNodeWithData method
    public boolean deleteNodeWithData(String d){
        
        Node current = head;
        
        // If there aren't any nodes in the linked list, ignore this while loop.
        // If there are nodes, find the node thats data is equal to what the user
        // entered. If it is equal, set the current index's data value equal to the next index's data value.
        // Finally, remove one from the listCount.
        while(current.next != null){
            if(current.next.stringData.equalsIgnoreCase(d)){
                current.next = current.next.next;
                listCounter--;
                System.out.println("Success! Node with data " + d + " deleted.");
                return true;
            }
            current = current.next;
        }
        System.out.println("Delete Failed: No node found with given data!");
        return false;
        
    }
    // End of deleteNodeWithData
    
    // deleteNodeAtIndex method
    public boolean deleteNodeAtIndex(int index){
    	
        Node current = head;
    	int jump;
        
        // If the index the user entered is greater than the number of nodes in the linked list or the index
        // is less than 0,(looking at less than the first node) show an error message.
    	if(index > listCounter || index < 0){
            System.out.println("Delete Failed: index out of bounds of size of linked list!!");
            return false;
    	}
    	else{
            
            jump = 0;
            
            // If the conditions above are not met, jump to the index specified and set the current node
            // equal to the next node's value.(This will essentially cause the current node to be erased)
            // Finally, subtract one from the listCount.
            while(jump < index){
    		current = current.next;
    		jump++;
            }
            
            current.next = current.next.next;
            System.out.println("Success! Node at index " + index + " deleted.");
            listCounter--;
            return true;
    	}
    }
    // End of deleteNodeAtIndex method
    
    // find method
    public String find(String data){
        
        Node current = head;
        String name = "";
        boolean found = false;
        
        // Find the node with the data that the user specifies and return that node and every node after it
        // that are connected to it.
        while(current.next != null){
            if(current.next.stringData.equalsIgnoreCase(data) && found == false){
                name = current.next.stringData;
                System.out.println("Success! Node with data " + data + " found.");
                found = true;
                
            }
            else if(!current.next.stringData.equalsIgnoreCase(data) && found == true){
                name += "-->" + current.next.stringData;
                current = current.next;
            }
            else{
                current = current.next;
            }
        }
        System.out.println("Find failed: No node found with given data!");
        return name;
    }
    // End of find method
    
}
