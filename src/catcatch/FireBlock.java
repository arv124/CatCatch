/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Alex
 */
public class FireBlock extends Block{
    private GamePanel gamePanel;
    private final Image fireImage;
    //Refactor: Removed unuse varible and declared variables as final -Qiu
    public static ArrayList<String> blockImages = new ArrayList<String>();
    private String fireImagePath="res/fireball.png";
    //Source: http://www.someicons.com/desktop-icons-games/donkey-kong-msl/Fireball2.gif
    
    public FireBlock(int panelHeight, int panelWidth, GamePanel gamePanel){
        super (panelHeight, panelWidth, gamePanel);
        fireImage= new ImageIcon(fireImagePath).getImage();
    }
    public Image getFireImage(){
        return fireImage;
    }
    public void paintComponent(Graphics g){
        move();
        g.drawImage(fireImage,this.x,this.y, 36, 32, gamePanel);
    }
}
