/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everythinggamerelated;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Dillon
 */
public class GameMovements {
    
    
    
    public void checkIfWon(JButton tile1, JButton tile2, JButton tile3, JButton tile4, JButton tile5, JButton tile6, JButton tile7, JButton tile8,
    JButton tile9, JButton tile10, JButton tile11, JButton tile12, JButton tile13, JButton tile14, JButton tile15, JButton tile16,
    JButton tile17, JButton tile18, JButton tile19, JButton tile20, JButton tile21, JButton tile22, JButton tile23, JButton tile24,
    JButton tile25, JButton tile26, JButton tile27, JButton tile28, JButton tile29, JButton tile30, JButton tile31, JButton tile32,
    JButton tile33, JButton tile34, JButton tile35, JButton tile36, JButton tile37, JButton tile38, JButton tile39, JButton tile40,
    JButton tile41, JButton tile42, JButton tile43, JButton tile44, JButton tile45, JButton tile46, JButton tile47, JButton tile48,
    JButton tile49, JButton tile50, JButton tile51, JButton tile52, JButton tile53, JButton tile54, JButton tile55, JButton tile56,
    JButton tile57, JButton tile58, JButton tile59, JButton tile60, JButton tile61, JButton tile62, JButton tile63, JButton tile64,
    JLabel gameBoard, JLabel backgroundLBL ,JLabel blackPieceLBL, JLabel whitePieceLBL, JLabel playerTurnLabel, JButton restartButton,
    JLabel p1WinLabel, JLabel p2WinLabel, JLabel p1LoseLabel, JLabel p2LoseLabel,
    int p1TilesControlled, int p2TilesControlled, int p1GameWon, int p2GameWon, int p1GameLose, int p2GameLose){
        
        restartButton.setVisible(true);
            
            if(p1TilesControlled > p2TilesControlled){
                
                playerTurnLabel.setText("Player 1 Wins!!!");
                p1GameWon += 1;
                p2GameLose += 1;
                p1WinLabel.setText("" + p1GameWon);
                p2LoseLabel.setText("" + p2GameLose);
                
                
            }
            else{
                
                playerTurnLabel.setText("Player 2 Wins!!!");
                p2GameWon += 1;
                p1GameLose += 1;
                p2WinLabel.setText("" + p2GameWon);
                p1LoseLabel.setText("" + p1GameLose);
                
            }
        
    }
    
}
