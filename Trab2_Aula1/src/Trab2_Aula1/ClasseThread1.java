package Trab2_Aula1;

import java.util.Random;

public class ClasseThread1 extends Thread {
    javax.swing.JLabel obj1;
    javax.swing.JFrame formulario;
    int ZzZz;
    public ClasseThread1(int ZzZz, javax.swing.JLabel um, javax.swing.JFrame form) {
        this.obj1 = um;
        this.formulario = form;
        this.ZzZz = ZzZz;
    }

    @Override
    public void run() {
        for (;;) {
            /*
             Utiliza a classe RANDOM para gerar um número aleatório, que vai indicar as posições X e Y na localização 
            do label do objeto. 
             Também pega a largura e altura do forumlario e subtrai com a largura e altura do label, 
            fazendo com q o número sorteado pelo Random não passe do tamanho total do formulario
             */
            obj1.setLocation(new Random().nextInt(formulario.getContentPane().getSize().width - obj1.getWidth()), new Random().nextInt(formulario.getContentPane().getSize().height - obj1.getHeight()));
            try {
                //Intervalo de 1s para os objetos se moverem
                ClasseThread1.sleep(ZzZz);
            } catch (Exception ex) {
            }
        }
    }
}
