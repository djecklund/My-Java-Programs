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
public class AskAudience {
    
    int answer1, answer2, answer3, answer4, audienceSelections, audienceSelected1, audienceSelected2, audienceSelected3, audienceSelected4;
    int[] answers;
    Random randAnswer;
    
    public AskAudience(){
        answer1 = answer2 = answer3 = answer4 = audienceSelections = audienceSelected1 = audienceSelected2 = audienceSelected3 = audienceSelected4 = 0;
        answers = new int[4];
        randAnswer = new Random();
    }
    
    // Ask the audience what answer they think the user should pick.
    // Return the percentage of audience that picked each answer.
    // To add to challenge, as the game gets further along the audience is
    // less likely to give the correct answer.
    public int[] askTheAudience(int setUpAnswers, int questionNum){
        
        switch(questionNum){
            case 1:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                }
                
                break;
            case 2:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                }
                
                break;
            case 3:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                }
                
                break;
            case 4:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                }
                
                break;
            case 5:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 85){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 85 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                }
                
                break;
            case 6:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 70){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 70){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 70){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 70){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                }
                
                break;
            case 7:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 70){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 70){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 70){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 70){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                
                break;
            case 8:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 60){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 60 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 60){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 60 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 60){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 60 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 60){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 60 && audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                
                break;
            case 9:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 60){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 60 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 60){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 60 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 60){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 60 && audienceSelections <= 80){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 60){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 60 && audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 80 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                
                break;
            case 10:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 50){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 70){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 50){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 70){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 50){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 70){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 50){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 70){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                
                break;
            case 11:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 50){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 70){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 50){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 70){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 50){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 70){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 90){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 50){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 70){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 70 && audienceSelections <= 90){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                
                break;
            case 12:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 40){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 40 && audienceSelections <= 65){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 65 && audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 40){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 40 && audienceSelections <= 65){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 65 && audienceSelections <= 80){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 40){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 40 && audienceSelections <= 65){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 65 && audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 40){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 40 && audienceSelections <= 65){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 65 && audienceSelections <= 80){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                
                break;
            case 13:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 40){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 40 && audienceSelections <= 65){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 65 && audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 40){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 40 && audienceSelections <= 65){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 65 && audienceSelections <= 80){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 40){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 40 && audienceSelections <= 65){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 65 && audienceSelections <= 80){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 40){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 40 && audienceSelections <= 65){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 65 && audienceSelections <= 80){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                
                break;
            case 14:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 25){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 25 && audienceSelections <= 50){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 75){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 25){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 25 && audienceSelections <= 50){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 75){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 25){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 25 && audienceSelections <= 50){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 75){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 25){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 25 && audienceSelections <= 50){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 75){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                
                break;
            case 15:
                
                switch(setUpAnswers){
                    case 0:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 25){
                                audienceSelected4++;
                            }
                            else if(audienceSelections > 25 && audienceSelections <= 50){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 75){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected3++;
                            }
                            
                        }
                        
                        answers[3] = audienceSelected4;
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        
                        break;
                    case 1:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 25){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 25 && audienceSelections <= 50){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 75){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 2:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 25){
                                audienceSelected3++;
                            }
                            else if(audienceSelections > 25 && audienceSelections <= 50){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 75){
                                audienceSelected2++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                        
                        break;
                    case 3:
                        
                        for(int i = 1; i <= 100; i++){
                            
                            audienceSelections = randAnswer.nextInt(100) + 1;

                            if(audienceSelections <= 25){
                                audienceSelected1++;
                            }
                            else if(audienceSelections > 25 && audienceSelections <= 50){
                                audienceSelected2++;
                            }
                            else if(audienceSelections > 50 && audienceSelections <= 75){
                                audienceSelected3++;
                            }
                            else{
                                audienceSelected4++;
                            }
                            
                        }
                }
                        
                        answers[0] = audienceSelected1;
                        answers[1] = audienceSelected2;
                        answers[2] = audienceSelected3;
                        answers[3] = audienceSelected4;
                
                break;
            default:
                break;
        }
        
        return answers;
    }
    
}
