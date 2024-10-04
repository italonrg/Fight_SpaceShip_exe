package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

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
    public void load(){
        ImageIcon referencia = new ImageIcon();
        image = referencia.getImage();

        altura = image.getHeight(null); // definindo a altura e largura da nave;
        largura = image.getWidth(null);

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
    public void keyRelesed(KeyEvent tecla){
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


}
