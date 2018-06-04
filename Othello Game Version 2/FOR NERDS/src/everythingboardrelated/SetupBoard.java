/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everythingboardrelated;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Dillon
 */
public class SetupBoard {
    
    private final String empty, whitePiece, blackPiece, gameBoardPath, background;
    
    public SetupBoard(){
        empty = "GameImages/Othello Empty Piece.jpg";
        whitePiece = "GameImages/White Piece.jpg";
        blackPiece = "GameImages/Black Piece.jpg";
        gameBoardPath = "GameImages/Othello Board.jpg";
        background = "GameImages/Othello Background.jpg";
    }
    
    public void setUpBoard(JButton tile1, JButton tile2, JButton tile3, JButton tile4, JButton tile5, JButton tile6, JButton tile7, JButton tile8,
    JButton tile9, JButton tile10, JButton tile11, JButton tile12, JButton tile13, JButton tile14, JButton tile15, JButton tile16,
    JButton tile17, JButton tile18, JButton tile19, JButton tile20, JButton tile21, JButton tile22, JButton tile23, JButton tile24,
    JButton tile25, JButton tile26, JButton tile27, JButton tile28, JButton tile29, JButton tile30, JButton tile31, JButton tile32,
    JButton tile33, JButton tile34, JButton tile35, JButton tile36, JButton tile37, JButton tile38, JButton tile39, JButton tile40,
    JButton tile41, JButton tile42, JButton tile43, JButton tile44, JButton tile45, JButton tile46, JButton tile47, JButton tile48,
    JButton tile49, JButton tile50, JButton tile51, JButton tile52, JButton tile53, JButton tile54, JButton tile55, JButton tile56,
    JButton tile57, JButton tile58, JButton tile59, JButton tile60, JButton tile61, JButton tile62, JButton tile63, JButton tile64,
    JLabel gameBoard, JLabel backgroundLBL ,JLabel blackPieceLBL, JLabel whitePieceLBL, JLabel playerTurnLabel, JButton restartButton){
        
        gameBoard.setIcon(new ImageIcon(gameBoardPath));
        backgroundLBL.setIcon(new ImageIcon(background));
        blackPieceLBL.setIcon(new ImageIcon(blackPiece));
        whitePieceLBL.setIcon(new ImageIcon(whitePiece));
        
        // Set all blank tiles to empty icon
        tile1.setIcon(new ImageIcon(empty));
        tile2.setIcon(new ImageIcon(empty));
        tile3.setIcon(new ImageIcon(empty));
        tile4.setIcon(new ImageIcon(empty));
        tile5.setIcon(new ImageIcon(empty));
        tile6.setIcon(new ImageIcon(empty));
        tile7.setIcon(new ImageIcon(empty));
        tile8.setIcon(new ImageIcon(empty));
        tile9.setIcon(new ImageIcon(empty));
        tile10.setIcon(new ImageIcon(empty));
        tile11.setIcon(new ImageIcon(empty));
        tile12.setIcon(new ImageIcon(empty));
        tile13.setIcon(new ImageIcon(empty));
        tile14.setIcon(new ImageIcon(empty));
        tile15.setIcon(new ImageIcon(empty));
        tile16.setIcon(new ImageIcon(empty));
        tile17.setIcon(new ImageIcon(empty));
        tile18.setIcon(new ImageIcon(empty));
        tile19.setIcon(new ImageIcon(empty));
        tile20.setIcon(new ImageIcon(empty));
        tile21.setIcon(new ImageIcon(empty));
        tile22.setIcon(new ImageIcon(empty));
        tile23.setIcon(new ImageIcon(empty));
        tile24.setIcon(new ImageIcon(empty));
        tile25.setIcon(new ImageIcon(empty));
        tile26.setIcon(new ImageIcon(empty));
        tile27.setIcon(new ImageIcon(empty));
        tile30.setIcon(new ImageIcon(empty));
        tile31.setIcon(new ImageIcon(empty));
        tile32.setIcon(new ImageIcon(empty));
        tile33.setIcon(new ImageIcon(empty));
        tile34.setIcon(new ImageIcon(empty));
        tile35.setIcon(new ImageIcon(empty));
        tile38.setIcon(new ImageIcon(empty));
        tile39.setIcon(new ImageIcon(empty));
        tile40.setIcon(new ImageIcon(empty));
        tile41.setIcon(new ImageIcon(empty));
        tile42.setIcon(new ImageIcon(empty));
        tile43.setIcon(new ImageIcon(empty));
        tile44.setIcon(new ImageIcon(empty));
        tile45.setIcon(new ImageIcon(empty));
        tile46.setIcon(new ImageIcon(empty));
        tile47.setIcon(new ImageIcon(empty));
        tile48.setIcon(new ImageIcon(empty));
        tile49.setIcon(new ImageIcon(empty));
        tile50.setIcon(new ImageIcon(empty));
        tile51.setIcon(new ImageIcon(empty));
        tile52.setIcon(new ImageIcon(empty));
        tile53.setIcon(new ImageIcon(empty));
        tile54.setIcon(new ImageIcon(empty));
        tile55.setIcon(new ImageIcon(empty));
        tile56.setIcon(new ImageIcon(empty));
        tile57.setIcon(new ImageIcon(empty));
        tile58.setIcon(new ImageIcon(empty));
        tile59.setIcon(new ImageIcon(empty));
        tile60.setIcon(new ImageIcon(empty));
        tile61.setIcon(new ImageIcon(empty));
        tile62.setIcon(new ImageIcon(empty));
        tile63.setIcon(new ImageIcon(empty));
        tile64.setIcon(new ImageIcon(empty));
        
        // Set up backgrounds
        tile1.setBackground(Color.yellow);
        tile2.setBackground(Color.yellow);
        tile3.setBackground(Color.yellow);
        tile4.setBackground(Color.yellow);
        tile5.setBackground(Color.yellow);
        tile6.setBackground(Color.yellow);
        tile7.setBackground(Color.yellow);
        tile8.setBackground(Color.yellow);
        tile9.setBackground(Color.yellow);
        tile10.setBackground(Color.yellow);
        tile11.setBackground(Color.yellow);
        tile12.setBackground(Color.yellow);
        tile13.setBackground(Color.yellow);
        tile14.setBackground(Color.yellow);
        tile15.setBackground(Color.yellow);
        tile16.setBackground(Color.yellow);
        tile17.setBackground(Color.yellow);
        tile18.setBackground(Color.yellow);
        tile19.setBackground(Color.yellow);
        tile20.setBackground(Color.yellow);
        tile21.setBackground(Color.yellow);
        tile22.setBackground(Color.yellow);
        tile23.setBackground(Color.yellow);
        tile24.setBackground(Color.yellow);
        tile25.setBackground(Color.yellow);
        tile26.setBackground(Color.yellow);
        tile27.setBackground(Color.yellow);
        tile30.setBackground(Color.yellow);
        tile31.setBackground(Color.yellow);
        tile32.setBackground(Color.yellow);
        tile33.setBackground(Color.yellow);
        tile34.setBackground(Color.yellow);
        tile35.setBackground(Color.yellow);
        tile38.setBackground(Color.yellow);
        tile39.setBackground(Color.yellow);
        tile40.setBackground(Color.yellow);
        tile41.setBackground(Color.yellow);
        tile42.setBackground(Color.yellow);
        tile43.setBackground(Color.yellow);
        tile44.setBackground(Color.yellow);
        tile45.setBackground(Color.yellow);
        tile46.setBackground(Color.yellow);
        tile47.setBackground(Color.yellow);
        tile48.setBackground(Color.yellow);
        tile49.setBackground(Color.yellow);
        tile50.setBackground(Color.yellow);
        tile51.setBackground(Color.yellow);
        tile52.setBackground(Color.yellow);
        tile53.setBackground(Color.yellow);
        tile54.setBackground(Color.yellow);
        tile55.setBackground(Color.yellow);
        tile56.setBackground(Color.yellow);
        tile57.setBackground(Color.yellow);
        tile58.setBackground(Color.yellow);
        tile59.setBackground(Color.yellow);
        tile60.setBackground(Color.yellow);
        tile61.setBackground(Color.yellow);
        tile62.setBackground(Color.yellow);
        tile63.setBackground(Color.yellow);
        tile64.setBackground(Color.yellow);
        
        // Starting tiles
        tile28.setBackground(Color.white);
        tile29.setBackground(Color.black);
        tile36.setBackground(Color.black);
        tile37.setBackground(Color.white);
               
        playerTurnLabel.setText("It's Player 1's turn");
        
        // Set the restart button invisible
        restartButton.setVisible(false);
        
        tile28.setIcon(new ImageIcon(whitePiece));
        tile29.setIcon(new ImageIcon(blackPiece));
        tile36.setIcon(new ImageIcon(blackPiece));
        tile37.setIcon(new ImageIcon(whitePiece));
        
    }
    
}
