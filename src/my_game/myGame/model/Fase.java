package model;
import javax.swing.*;
import java.awt.*;

public class Fase extends JPanel {

    //tudo que ocorrerá na fase será feito aqui
    private final Image fundo;// fundo de tela;

    //construtor para instanciar a imagem de fundo
    public Fase(){
        ImageIcon referencia = new ImageIcon("jetbrains://idea/navigate/reference?project=Fight_Bots_exe&path=res/backgound_space.png");
        fundo = referencia.getImage();
    }
    //metodo para printar na tela o fundo de tela, não e apenas
    public void paint( Graphics g){
        Graphics2D graficos = (Graphics2D) g;//tive que fazer um casting aqui;
        graficos.drawImage(fundo,0,0,null);
        g.dispose();
    }



}
