/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howfastcanyoutype;

/**
 *
 * @author Dillon
 */
public class UserInfo {
    
    private String idiom;
    private long totalTime;
    
    public UserInfo(){
        idiom = "";
        totalTime = 0;
    }
    
    public void setIdiom(String i){
        idiom = i;
    }
    
    public String getIdiom(){
        return idiom;
    }
    
    // Determine how many seconds it took the user to type the idiom in the textfield
    public void setTotalTime(long start, long end){
        totalTime = (end - start) / 1000;
    }
    
    public long getTotalTime(){
        return totalTime;
    }
    
}
