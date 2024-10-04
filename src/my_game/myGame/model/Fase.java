package model;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;

public class Fase extends JPanel implements ActionListener {

    //tudo que ocorrerá na fase será feito aqui
    private Image fundo;
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
        graficos.drawImage(player.getImage(),player.getX(), player.getY(), this);
        g.dispose();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // este metodo e o metodo que se usa para atualizar a pagina quanda a nave for se movendo;
        player.update();
        repaint();
    }

    private class TecladoAdapter extends KeyAdapter {

        public void Keypressed(KeyEvent e){
        player.keyPressed(e);// metodo que recebe a entrada do teclado;
        }

        public void Keyrelesed(KeyEvent e){
            player.keyPressed(e);// metodo que recebe a entrada do teclado;
        }

    }
}
