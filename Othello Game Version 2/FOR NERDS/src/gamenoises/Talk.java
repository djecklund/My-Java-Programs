/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenoises;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author Dillon
 */
public class Talk {
    
    private final String voiceName;
    
    public Talk(){
        voiceName = "kevin16";
    }
    
    public void startOfGame(){
        
        Thread t = new Thread(){
            
            @Override
            public void run(){
                
                Voice voice;
                VoiceManager vm = VoiceManager.getInstance();
                voice = vm.getVoice(voiceName);

                voice.allocate();

                try{

                    voice.speak("Starting Game.");

                }catch(Exception e){

                }
                
            }
            
        };
        t.start();
        
    }
    
    public void whosTurnIsItAnyway(String player){
        
        Thread t = new Thread(){
            
            @Override
            public void run(){
                
                Voice voice;
                VoiceManager vm = VoiceManager.getInstance();
                voice = vm.getVoice(voiceName);

                voice.allocate();

                try{

                    voice.speak(player + ", it is your turn.");

                }catch(Exception e){

                }
                
            }
            
        };
        t.start();
        
        
    }
    
}
