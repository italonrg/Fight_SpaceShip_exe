import model.Fase;
import javax.swing.*;

public class Container extends JFrame {

    //tela principal do game
    public Container (){

        add(new Fase());// adicionando a fase que criei no conteiner;
        setTitle("Tela Principal");// coloca titulo na tela
        setSize(1024,728);//define o tamanho da tela;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//isso e para fechar a tela;
        setLocationRelativeTo(null);//
        this.setResizable(false);// impede que a tela seja modificada;
        setVisible(true);
    }

    public static void main(String[] args) {
        new Container();//instanciado uma tela;
    }
}
