package model;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Player {
    private int x,y;// usado para mover a nave;
    private int dy,dx;// isso e usado para mover a nave;
    private Image image;// imagem da nave;
    private int altura , largura; // postriormente usado para o efeito de colisão;

    //construtor
    public Player(){
        this.x = 100;
        this.y = 100;// esses valores são as cordenadas de onde a nave vai aparecer;

    }
    // carregar a imagem da nave/Player
   public void load() throws IOException {
       ClassLoader classLoader = getClass().getClassLoader();
       InputStream xs = classLoader.getResourceAsStream("res/nave_player.png");
       if (xs != null) {
           image = ImageIO.read(xs);
           altura = image.getHeight(null);
           largura = image.getWidth(null);
           image.getScaledInstance(250,250,0);
       } else {
           System.err.println("Imagem da nave não encontrada!");
       }
   }

    //definindo o movimento da nave;
    public void update (){
        x += dx;
        y +=dy;
    }

    //metodo para receber o comando do teclado
    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_UP){
            dy=-3;
        }
        if (codigo == KeyEvent.VK_DOWN){
            dy=3;
        }
        if (codigo == KeyEvent.VK_LEFT){
            dx=-3;
        }
        if (codigo == KeyEvent.VK_RIGHT){
            dx=3;
        }
    }

    //metodo para que quando a tecla parar de ser apertada a nave pare;
    public void keyReleased(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_UP){
            dy=0;
        }
        if (codigo == KeyEvent.VK_DOWN){
            dy=0;
        }
        if (codigo == KeyEvent.VK_LEFT){
            dx=0;
        }
        if (codigo == KeyEvent.VK_RIGHT){
            dx=0;
        }
    }

    public Image getImage() {
        return image;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

}
