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
public class Node {
    
    // Create the next Node object to link to
    Node nextString;
    Node nextInt;
    Node nextDouble;
    Node nextChar;
    Node nextFloat;
    Node nextLong;
    
    // Create all the datatypes for the linked list
    String stringData;
    char charData;
    int intData;
    double doubleData;
    float floatData;
    long longData;
    boolean booleanData;
    
    public Node(){
        
    }
    
    public Node(String d){
        stringData = d;
    }
    
    // Still Working on this to make a more dynamic LinkedList
    public Node(char d){
        charData = d;
    }
    
    public Node(int d){
        intData = d;
    }
    
    public Node(double d){
        doubleData = d;
    }
    
    public Node(float d){
        floatData = d;
    }
    
    public Node(long d){
        longData = d;
    }
    
    public Node(boolean d){
        booleanData = d;
    }
    
}
