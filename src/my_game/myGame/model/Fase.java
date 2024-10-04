package model;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class Fase extends JPanel {

    //tudo que ocorrerá na fase será feito aqui
    private final Image fundo;
    private Player player;


    public Fase() throws IOException {
        // Utilizando ClassLoader para carregar a imagem
        ClassLoader classLoader = getClass().getClassLoader();// usado para carregar a imagem
        InputStream is = classLoader.getResourceAsStream("res/backgound_space.png");
        fundo = ImageIO.read(is);

        player = new Player();
        player.load();
    }
    //metodo para printar na tela o fundo de tela, não e apenas chamar a imagem;
    public void paint( Graphics g){
        Graphics2D graficos = (Graphics2D) g;//tive que fazer um casting aqui;
        graficos.drawImage(fundo,0,0,null);
        g.dispose();
    }



}
