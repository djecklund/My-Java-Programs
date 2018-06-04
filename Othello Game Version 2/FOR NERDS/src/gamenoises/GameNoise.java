/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenoises;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

/**
 *
 * @author Dillon
 */
public class GameNoise {
    
    public void putPieceDown(){
        
        Thread t = new Thread(){
            
            @Override
            public void run(){
                
                File f = new File("Game Noises/Place Piece Sound.mp3");
        
                try{

                    FileInputStream fis = new FileInputStream(f);
                    BufferedInputStream bis = new BufferedInputStream(fis);

                    Player p = new Player(bis);
                    try {
                        p.play();
                    } catch (JavaLayerException ex) {
                        System.out.println("JavaLayerException");
                        Logger.getLogger(GameNoise.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }catch(IOException  ex){

                } catch (JavaLayerException ex) {
                    Logger.getLogger(GameNoise.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        };
        t.start();
        
    }
    
}
