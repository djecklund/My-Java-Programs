/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

/**
 *
 * @author Dillon
 */
public class ClassInfo {
    
    String subject, title;
    char grade;
    int creditHours, qualityPoints, totalQualityPoints;
    
    public ClassInfo(){
        subject = title = "";
        creditHours = totalQualityPoints = 0;
    }
    
    public void setSubject(String s){
        subject = s;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public void setTitle(String t){
        title = t;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setGrade(char g){
        grade = g;
    }
    
    public char getGrade(){
        return grade;
    }
    
    public void setCreditHours(int c){
        creditHours = c;
    }
    
    public int getCreditHours(){
        return creditHours;
    }
    
    public void setQualityPoints(){
        
        /* The GPA calculator is based on a point system
           A = 4 points
           B = 3 points
           C = 2 points
           D = 1 point
           F = 0 points
        
        Quality points are calculated by multiplying the Grade points by the credit hours for the class.
        */
        switch(grade){
            case 'A':
                qualityPoints = 4 * creditHours;
                break;
            case 'B':
                qualityPoints = 3 * creditHours;
                break;
            case 'C':
                qualityPoints = 2 * creditHours;
                break;
            case 'D':
                qualityPoints = 1 * creditHours;
                break;
            case 'F':
                qualityPoints = 0 * creditHours;
        }
        
    }
    
    public int getQualityPoints(){
        return qualityPoints;
    }
    
}
