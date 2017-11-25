/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaire;

import java.util.Random;

/**
 *
 * @author Dillon
 */
public class PhoneAFriend {
    
    int[] friendGuesses;
    Random friendGuess;
    int answer1, answer2, answer3, answer4;
    
    public PhoneAFriend(){
        friendGuesses = new int[4];
        friendGuess = new Random();
        
        answer1 = answer2 = answer3 = answer4 = 0;
    }
    
    // Ask your friend for an answer to the question
    public int[] phoneSmartFriend(int setUpAnswers){
        
        // Calculate the percent confidence your friend has in each answer.
        // Higher percentages mean your friend would most likely use that answer.
        for(int i = 1; i <= 100; i++){
            int guess = friendGuess.nextInt(100) + 1;
            
            // Determine the answer set and figure out what your friend
            // thinks of each question.
            switch(setUpAnswers){
                // If set zero, the correct answer will be 4.
                // Each set has a correct answer. You can find that answer in the
                // logoButtonActionPerformed function.
                case 0:
                    
                    if(guess <= 70){
                        answer4++;
                    }
                    else if(guess > 70 && guess <= 80){
                        answer1++;
                    }
                    else if(guess > 80 && guess <= 90){
                        answer2++;
                    }
                    else{
                        answer3++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
                case 1:
                    
                    if(guess <= 70){
                        answer2++;
                    }
                    else if(guess > 70 && guess <= 80){
                        answer1++;
                    }
                    else if(guess > 80 && guess <= 90){
                        answer3++;
                    }
                    else{
                        answer4++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
                case 2:
                    
                    if(guess <= 70){
                        answer3++;
                    }
                    else if(guess > 70 && guess <= 80){
                        answer1++;
                    }
                    else if(guess > 80 && guess <= 90){
                        answer2++;
                    }
                    else{
                        answer4++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
                case 3:
                    
                    if(guess <= 70){
                        answer1++;
                    }
                    else if(guess > 70 && guess <= 80){
                        answer2++;
                    }
                    else if(guess > 80 && guess <= 90){
                        answer3++;
                    }
                    else{
                        answer4++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
            }
            
        }
        
        return friendGuesses;
    }
    
    // Ask your Semi-Smart friend for an answer to the question
    public int[] phoneSemiSmartFriend(int setUpAnswers){
        
        for(int i = 1; i <= 100; i++){
            int guess = friendGuess.nextInt(100) + 1;
            
            switch(setUpAnswers){
                case 0:
                    
                    if(guess <= 50){
                        answer4++;
                    }
                    else if(guess > 50 && guess <= 65){
                        answer1++;
                    }
                    else if(guess > 65 && guess <= 80){
                        answer2++;
                    }
                    else{
                        answer3++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
                case 1:
                    
                    if(guess <= 50){
                        answer2++;
                    }
                    else if(guess > 50 && guess <= 65){
                        answer1++;
                    }
                    else if(guess > 65 && guess <= 80){
                        answer3++;
                    }
                    else{
                        answer4++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
                case 2:
                    
                    if(guess <= 50){
                        answer3++;
                    }
                    else if(guess > 50 && guess <= 65){
                        answer1++;
                    }
                    else if(guess > 65 && guess <= 80){
                        answer2++;
                    }
                    else{
                        answer4++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
                case 3:
                    
                    if(guess <= 50){
                        answer1++;
                    }
                    else if(guess > 50 && guess <= 65){
                        answer2++;
                    }
                    else if(guess > 65 && guess <= 80){
                        answer3++;
                    }
                    else{
                        answer4++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
            }
            
        }
        
        return friendGuesses;
    }
    
    // Ask your Dumb friend for an answer to the question
    // Hope and pray you don't get this guy, he is really dumb.
    // Though he still may answer the question right, fingers crossed.
    public int[] phoneDumbFriend(int setUpAnswers){
        
        for(int i = 1; i <= 100; i++){
            int guess = friendGuess.nextInt(100) + 1;
            
            switch(setUpAnswers){
                case 0:
                    
                    if(guess <= 40){
                        answer4++;
                    }
                    else if(guess > 40 && guess <= 55){
                        answer1++;
                    }
                    else if(guess > 55 && guess <= 70){
                        answer2++;
                    }
                    else{
                        answer3++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
                case 1:
                    
                    if(guess <= 40){
                        answer2++;
                    }
                    else if(guess > 40 && guess <= 55){
                        answer1++;
                    }
                    else if(guess > 55 && guess <= 70){
                        answer3++;
                    }
                    else{
                        answer4++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
                case 2:
                    
                    if(guess <= 40){
                        answer3++;
                    }
                    else if(guess > 40 && guess <= 55){
                        answer1++;
                    }
                    else if(guess > 55 && guess <= 70){
                        answer2++;
                    }
                    else{
                        answer4++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
                case 3:
                    
                    if(guess <= 40){
                        answer1++;
                    }
                    else if(guess > 40 && guess <= 55){
                        answer2++;
                    }
                    else if(guess > 55 && guess <= 70){
                        answer3++;
                    }
                    else{
                        answer4++;
                    }
                    
                    friendGuesses[0] = answer1;
                    friendGuesses[1] = answer2;
                    friendGuesses[2] = answer3;
                    friendGuesses[3] = answer4;
                    
                    break;
            }
            
        }
        
        return friendGuesses;
    }
    
}
