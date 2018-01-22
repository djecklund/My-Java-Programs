/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgrounddata;

import java.util.LinkedList;

/**
 *
 * @author Dillon
 */
public class UndoData {
    
    public LinkedList<String> undoData;
    public int currentIndex;
    
    public UndoData(){
        undoData = new LinkedList<>();
        currentIndex = -1;
    }
    
    // Add new elements to the LinkedList.
    public void newTextAdded(String newText){
        undoData.add(newText);
    }
    
}
