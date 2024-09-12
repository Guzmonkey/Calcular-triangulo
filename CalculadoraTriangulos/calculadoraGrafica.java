import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.Graphics;
import javax.swing.JButton;

public class calculadoraGrafica{
    private calcularTriangulo calcular;
    public calculadoraGrafica(){

    }

    public void calculadoraTrianguloGrafico(){
        
        JButton boton = new JButton("Calcular");

        JLabel labelLadoA = new JLabel("Lado A:");
        JLabel labelLadoB = new JLabel("Lado B:");
        JLabel labelLadoC = new JLabel("Lado C:");
        JLabel labelAnguloA = new JLabel("A°");
        JLabel labelAnguloB = new JLabel("B°");
        JLabel labelAnguloC = new JLabel("C°");

        JTextField textLadoA = new JTextField(1);
        JTextField textAnguloA = new JTextField(1);
        JTextField textLadoB = new JTextField(1);
        JTextField textAnguloB = new JTextField(1);
        JTextField textLadoC = new JTextField(1);
        JTextField textAnguloC = new JTextField(1);

        JLabel labelLadoAResultado = new JLabel("Lado A:");
        JLabel labelLadoBResultado = new JLabel("Lado B:");
        JLabel labelLadoCResultado = new JLabel("Lado C:");
        JLabel labelAnguloAResultado = new JLabel("Angulo A:");
        JLabel labelAnguloBResultado = new JLabel("Angulo B:");
        JLabel labelAnguloCResultado = new JLabel("Angulo C:");
        JLabel labelArea = new JLabel("Area:");
        JLabel labelPerimetro = new JLabel("Perimetro:");
        JLabel labelSemiPerimetro = new JLabel("Semiperimetro:");
        JLabel labelHA = new JLabel("Altura ha:");
        JLabel labelHB = new JLabel("Altura hb");
        JLabel labelHC = new JLabel("Altura hc:");
        JLabel labelMA = new JLabel("Median ma: ");
        JLabel labelMB = new JLabel("Median mb:");
        JLabel labelMC = new JLabel("Median mc:");
        JLabel labelRadioInterno = new JLabel("Inradius r:"); 
        JLabel labelRadioExterno = new JLabel("Circumradius R:");

        JTextField textLadoAResultado = new JTextField(1); 
        textLadoAResultado.setEditable(false);
        
        JTextField textLadoBResultado = new JTextField(1);
        textLadoBResultado.setEditable(false);
        
        JTextField textLadoCResultado = new JTextField(1);
        textLadoCResultado.setEditable(false);
        
        JTextField textAnguloAResultado = new JTextField(1);
        textAnguloAResultado.setEditable(false);
       
        JTextField textAnguloBResultado = new JTextField(1);
        textAnguloBResultado.setEditable(false);

        JTextField textAnguloCResultado = new JTextField(1);
        textAnguloCResultado.setEditable(false);

        JTextField textArea = new JTextField(1);
        textArea.setEditable(false);

        JTextField textPerimetro = new JTextField(1);
        textPerimetro.setEditable(false);

        JTextField textSemiPerimetro = new JTextField(1);
        textSemiPerimetro.setEditable(false);

        JTextField textHA = new JTextField(1);
        textHA.setEditable(false);

        JTextField textHB = new JTextField(1);
        textHB.setEditable(false);

        JTextField textHC = new JTextField(1);
        textHC.setEditable(false);

        JTextField textMA = new JTextField(1);
        textMA.setEditable(false);

        JTextField textMB = new JTextField(1);
        textMB.setEditable(false);

        JTextField textMC = new JTextField(1);
        textMC.setEditable(false);

        JTextField textRadioInterno = new JTextField(1);
        textRadioInterno.setEditable(false);

        JTextField textRadioExterno = new JTextField(1);
        textRadioExterno.setEditable(false);

        JFrame frame = new JFrame();
        JPanel panel = new JPanel(null){
            @Override 
            protected void paintComponent(Graphics g){
                ImageIcon imagen = new ImageIcon("TrianguloImagen.png");
                g.drawImage(imagen.getImage(),40, 40, 550, 550, this);
            }
        };

        labelLadoA.setBounds(440, 240, 100, 40);
        panel.add(labelLadoA);
        textLadoA.setBounds(485, 240, 100, 40);
        panel.add(textLadoA);

        labelAnguloA.setBounds(150, 440, 100, 40);
        panel.add(labelAnguloA);
        textAnguloA.setBounds(165, 440, 100, 40);
        panel.add(textAnguloA);

        labelLadoB.setBounds(50, 240, 100, 40);
        panel.add(labelLadoB);
        textLadoB.setBounds(95, 240, 100, 40);
        panel.add(textLadoB);

        labelAnguloB.setBounds(375, 440, 100, 40);
        panel.add(labelAnguloB);
        textAnguloB.setBounds(390, 440, 100, 40);
        panel.add(textAnguloB);

        labelLadoC.setBounds(300, 500, 100, 40);
        panel.add(labelLadoC);
        textLadoC.setBounds(350, 500, 100, 40);
        panel.add(textLadoC);

        labelAnguloC.setBounds(310, 120, 100, 40);
        panel.add(labelAnguloC);
        textAnguloC.setBounds(272, 170, 100, 40);
        panel.add(textAnguloC);

        labelLadoAResultado.setBounds(700, 0, 100, 40);
        panel.add(labelLadoAResultado);
        textLadoAResultado.setBounds(790, 0, 100, 40);
        panel.add(textLadoAResultado);

        labelLadoBResultado.setBounds(700, 40, 100, 40);
        panel.add(labelLadoBResultado);
        textLadoBResultado.setBounds(790, 40, 100, 40);
        panel.add(textLadoBResultado);

        labelLadoCResultado.setBounds(700, 80, 100, 40);
        panel.add(labelLadoCResultado);
        textLadoCResultado.setBounds(790, 80, 100, 40);
        panel.add(textLadoCResultado);

        labelAnguloAResultado.setBounds(700, 120, 100, 40);
        panel.add(labelAnguloAResultado);
        textAnguloAResultado.setBounds(790, 120, 100, 40);
        panel.add(textAnguloAResultado);

        labelAnguloBResultado.setBounds(700, 160, 100, 40);
        panel.add(labelAnguloBResultado);
        textAnguloBResultado.setBounds(790, 160, 100, 40);
        panel.add(textAnguloBResultado);

        labelAnguloCResultado.setBounds(700, 200, 100, 40);
        panel.add(labelAnguloCResultado);
        textAnguloCResultado.setBounds(790, 200, 100, 40);
        panel.add(textAnguloCResultado);

        labelArea.setBounds(700, 240, 100, 40);
        panel.add(labelArea);
        textArea.setBounds(790, 240, 100, 40);
        panel.add(textArea);

        labelPerimetro.setBounds(700, 280, 100, 40);
        panel.add(labelPerimetro);
        textPerimetro.setBounds(790, 280, 100, 40);
        panel.add(textPerimetro);

        labelSemiPerimetro.setBounds(700, 320, 100, 40);
        panel.add(labelSemiPerimetro);
        textSemiPerimetro.setBounds(790, 320, 100, 40);
        panel.add(textSemiPerimetro);

        labelHA.setBounds(700, 360, 100, 40);
        panel.add(labelHA);
        textHA.setBounds(790, 360, 100, 40);
        panel.add(textHA);

        labelHB.setBounds(700, 400, 100, 40);
        panel.add(labelHB);
        textHB.setBounds(790, 400, 100, 40);
        panel.add(textHB);

        labelHC.setBounds(700, 440, 100, 40);
        panel.add(labelHC);
        textHC.setBounds(790, 440, 100, 40);
        panel.add(textHC);
    
        labelMA.setBounds(700, 480, 100, 40);
        panel.add(labelMA);
        textMA.setBounds(790, 480, 100, 40);
        panel.add(textMA);

        labelMB.setBounds(700, 520, 100, 40);
        panel.add(labelMB);
        textMB.setBounds(790, 520, 100, 40);
        panel.add(textMB);

        labelMC.setBounds(700, 560, 100, 40);
        panel.add(labelMC);
        textMC.setBounds(790, 560, 100, 40);
        panel.add(textMC);

        labelRadioInterno.setBounds(700, 600, 100, 40);
        panel.add(labelRadioInterno);
        textRadioInterno.setBounds(790, 600, 100, 40);
        panel.add(textRadioInterno);

        labelRadioExterno.setBounds(700, 640, 100, 40);
        panel.add(labelRadioExterno);
        textRadioExterno.setBounds(790, 640, 100, 40);
        panel.add(textRadioExterno);

        boton.setBounds(260, 630, 100, 40);
        panel.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int contador = 0;
                double ladoA = 0;
                double ladoB = 0;
                double ladoC = 0;
                double anguloA = 0;
                double anguloB = 0;
                double anguloC = 0;
                double area = 0;
                double perimetro = 0; 
                double semiPerimetro = 0;
                double ha = 0;
                double hb = 0;
                double hc = 0;
                double ma = 0;
                double mb = 0;
                double mc = 0;
                double radioInterno = 0;
                double radioExterno = 0;
                calcular = new calcularTriangulo();

                if(!textLadoA.getText().isEmpty()){
                    try {
                        ladoA = Double.parseDouble(textLadoA.getText());
                        if(ladoA > 0){
                            contador++;
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "No puedes ingresar letras!",  "Error", JOptionPane.WARNING_MESSAGE);
                    }

                }

                if(!textLadoB.getText().isEmpty()){
                    try {
                        ladoB = Double.parseDouble(textLadoB.getText());
                        if (ladoB > 0) {
                            contador++;
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "No puedes ingresar letras!",  "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }

                if(!textLadoC.getText().isEmpty()){
                    try {
                        ladoC = Double.parseDouble(textLadoC.getText());
                        if(ladoC > 0 ){
                            contador++;
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "No puedes ingresar letras!",  "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }

                if(!textAnguloA.getText().isEmpty()){
                    try {
                        anguloA = Double.parseDouble(textAnguloA.getText());  
                        if(anguloA > 0){
                            contador++;
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede calcular un triangulo con ese número de angulos!","Error", JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "No puedes ingresar letras!",  "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }

                if(!textAnguloB.getText().isEmpty()){
                    try{
                        anguloB = Double.parseDouble(textAnguloB.getText());
                        if(anguloB > 0){
                            contador++;
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede calcular un triangulo con ese número de angulos!","Error", JOptionPane.WARNING_MESSAGE);
                        }

                    } catch(NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "No puedes ingresar letras!",  "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }
                if(!textAnguloC.getText().isEmpty()){
                    try {
                        anguloC = Double.parseDouble(textAnguloC.getText());
                        if(anguloC > 0){
                            contador++;
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede calcular un triangulo con ese número de angulos!","Error", JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "No puedes ingresar letras!",  "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }

                if(contador == 3 && ladoA >= 1 && ladoB >= 1 && ladoC >= 1){
                    if(!calcular.validarTrianguloCon3Lados(ladoA, ladoB, ladoC)){
                        JOptionPane.showMessageDialog(null, "No se puede calcular un triangulo con ese número de lados!","Error", JOptionPane.WARNING_MESSAGE);
                    }else{
                    calcular.calcular3Angulos(ladoA, ladoB, ladoC);
                    anguloA = calcular.getAnguloA();
                    anguloB = calcular.getAnguloB();
                    anguloC = calcular.getAnguloC(); ha = calcular.heightHa(ladoA, ladoB, ladoC);
                    area = calcular.calcularArea(ladoA, ladoB, calcular.getAnguloC());
                    perimetro = calcular.calcularPerimetro(ladoA, ladoB, ladoC);
                    semiPerimetro = calcular.calcularSemiPerimetro(ladoA, ladoB, ladoC);
                    hb = calcular.heightHb(ladoA, ladoB, ladoC);
                    hc = calcular.heightHc(ladoA, ladoB, ladoC);
                    ma = calcular.medianMa(ladoA, ladoC, calcular.getAnguloB());
                    mb = calcular.medianMb(ladoA, ladoB, calcular.getAnguloC());
                    mc = calcular.medianMc(ladoB, ladoC, calcular.getAnguloA());
                    radioInterno = calcular.calcularRadioInterno(ladoA, ladoB, ladoC);
                    radioExterno = calcular.calcularRadioExterno(ladoA, calcular.getAnguloA());

                    textLadoAResultado.setText(String.format("%.4f", ladoA));
                    textLadoBResultado.setText(String.format("%.4f", ladoB));
                    textLadoCResultado.setText(String.format("%.4f", ladoC));
                    textAnguloAResultado.setText(String.format("%.4f", calcular.getAnguloA())); 
                    textAnguloBResultado.setText(String.format("%.4f", calcular.getAnguloB())); 
                    textAnguloCResultado.setText(String.format("%.4f", calcular.getAnguloC())); 
                    textArea.setText(String.valueOf(String.format("%.4f",area)));
                    textPerimetro.setText(String.format("%.4f",perimetro));
                    textSemiPerimetro.setText(String.format("%.4f",semiPerimetro));
                    textHA.setText(String.format("%.4f", ha));
                    textHB.setText(String.format("%.4f",hb));
                    textHC.setText(String.format("%.4f", hc));
                    textMA.setText(String.format("%.4f", ma));
                    textMB.setText(String.format("%.4f", mb));
                    textMC.setText(String.format("%.4f", mc));
                    textRadioInterno.setText(String.format("%.4f", radioInterno));
                    textRadioExterno.setText(String.format("%.4f", radioExterno));
                    }
                } else if(contador == 3 && ((ladoA >= 1 && ladoB >= 1 && anguloA >= 1) || (ladoA >= 1 && ladoB >= 1 && anguloB >= 1) || (ladoA >= 1 && ladoB >= 1 && anguloC >= 1) || 
                (ladoA >= 1 && ladoC >= 1 && anguloA >= 1) || (ladoA >= 1 && ladoC >= 1 && anguloB >= 1) || (ladoA >= 1 && ladoC >= 1 && anguloC >= 1) || 
                (ladoB >= 1 && ladoC >= 1 && anguloA >= 1) || (ladoB >= 1 && ladoC >= 1 && anguloB >= 1) || (ladoB >= 1 && ladoC >= 1 && anguloC >= 1))){
                    if(anguloA >= 180 || anguloB >= 180 || anguloC >= 180 || anguloA < 0 || anguloB < 0 || anguloC < 0 ){
                        JOptionPane.showMessageDialog(null, "No se puede calcular un triangulo con ese número de angulos!","Error", JOptionPane.WARNING_MESSAGE);
                    }else{
                    calcular.calcular1Lado2Angulos(ladoA, ladoB, ladoC, anguloA, anguloB, anguloC);
                    ladoA = calcular.getLadoA();
                    ladoB = calcular.getLadoB();
                    ladoC = calcular.getLadoC();
                    anguloA = calcular.getAnguloA();
                    anguloB = calcular.getAnguloB();
                    anguloC = calcular.getAnguloC(); 
                    ha = calcular.heightHa(ladoA, ladoB, ladoC);
                    area = calcular.calcularArea(ladoA, ladoB, calcular.getAnguloC());
                    perimetro = calcular.calcularPerimetro(ladoA, ladoB, ladoC);
                    semiPerimetro = calcular.calcularSemiPerimetro(ladoA, ladoB, ladoC);
                    hb = calcular.heightHb(ladoA, ladoB, ladoC);
                    hc = calcular.heightHc(ladoA, ladoB, ladoC);
                    ma = calcular.medianMa(ladoA, ladoC, calcular.getAnguloB());
                    mb = calcular.medianMb(ladoA, ladoB, calcular.getAnguloC());
                    mc = calcular.medianMc(ladoB, ladoC, calcular.getAnguloA());
                    radioInterno = calcular.calcularRadioInterno(ladoA, ladoB, ladoC);
                    radioExterno = calcular.calcularRadioExterno(ladoA, calcular.getAnguloA());

                    textLadoAResultado.setText(String.format("%.4f",calcular.getLadoA()));
                    textLadoBResultado.setText(String.format("%.4f",calcular.getLadoB()));
                    textLadoCResultado.setText(String.format("%.4f",calcular.getLadoC()));
                    textAnguloAResultado.setText(String.format("%.4f", calcular.getAnguloA())); 
                    textAnguloBResultado.setText(String.format("%.4f", calcular.getAnguloB())); 
                    textAnguloCResultado.setText(String.format("%.4f", calcular.getAnguloC())); 
                    textArea.setText(String.valueOf(String.format("%.4f",area)));
                    textPerimetro.setText(String.format("%.4f",perimetro));
                    textSemiPerimetro.setText(String.format("%.4f",semiPerimetro));
                    textHA.setText(String.format("%.4f", ha));
                    textHB.setText(String.format("%.4f",hb));
                    textHC.setText(String.format("%.4f", hc));
                    textMA.setText(String.format("%.4f", ma));
                    textMB.setText(String.format("%.4f", mb));
                    textMC.setText(String.format("%.4f", mc));
                    textRadioInterno.setText(String.format("%.4f", radioInterno));
                    textRadioExterno.setText(String.format("%.4f", radioExterno));
                    }
                } else if(contador == 3 && ((ladoA >= 1 && anguloA >= 1 && anguloB >= 1) || (ladoA >= 1 && anguloA >= 1 && anguloC >= 1) || (ladoA >= 1 && anguloB >= 1 && anguloC >= 1) || 
                (ladoB >= 1 && anguloA >= 1 && anguloB >= 1) || (ladoB >= 1 && anguloA >= 1 && anguloC >= 1) || (ladoB >= 1 && anguloB >= 1 && anguloC >= 1) || 
                (ladoC >= 1 && anguloA >= 1 && anguloB >= 1) || (ladoC >= 1 && anguloA >= 1 && anguloC >= 1) || (ladoC >= 1 && anguloB >= 1 && anguloC >= 1))){
                    if(anguloA >= 180 || anguloB >= 180 || anguloC >= 180 || anguloA < 0 || anguloB < 0 || anguloC < 0 ){
                        JOptionPane.showMessageDialog(null, "No se puede calcular un triangulo con ese número de angulos!","Error", JOptionPane.WARNING_MESSAGE);
                    }else{
                    calcular.calcular2Lados1Angulo(ladoA, ladoB, ladoC, anguloA, anguloB, anguloC);
                    ladoA = calcular.getLadoA();
                    ladoB = calcular.getLadoB();
                    ladoC = calcular.getLadoC();
                    anguloA = calcular.getAnguloA();
                    anguloB = calcular.getAnguloB();
                    anguloC = calcular.getAnguloC(); 
                    ha = calcular.heightHa(ladoA, ladoB, ladoC);
                    area = calcular.calcularArea(ladoA, ladoB, calcular.getAnguloC());
                    perimetro = calcular.calcularPerimetro(ladoA, ladoB, ladoC);
                    semiPerimetro = calcular.calcularSemiPerimetro(ladoA, ladoB, ladoC);
                    hb = calcular.heightHb(ladoA, ladoB, ladoC);
                    hc = calcular.heightHc(ladoA, ladoB, ladoC);
                    ma = calcular.medianMa(ladoA, ladoC, calcular.getAnguloB());
                    mb = calcular.medianMb(ladoA, ladoB, calcular.getAnguloC());
                    mc = calcular.medianMc(ladoB, ladoC, calcular.getAnguloA());
                    radioInterno = calcular.calcularRadioInterno(ladoA, ladoB, ladoC);
                    radioExterno = calcular.calcularRadioExterno(ladoA, calcular.getAnguloA());

                    textLadoAResultado.setText(String.format("%.4f",calcular.getLadoA()));
                    textLadoBResultado.setText(String.format("%.4f",calcular.getLadoB()));
                    textLadoCResultado.setText(String.format("%.4f",calcular.getLadoC()));
                    textAnguloAResultado.setText(String.format("%.4f", calcular.getAnguloA())); 
                    textAnguloBResultado.setText(String.format("%.4f", calcular.getAnguloB())); 
                    textAnguloCResultado.setText(String.format("%.4f", calcular.getAnguloC())); 
                    textArea.setText(String.valueOf(String.format("%.4f",area)));
                    textPerimetro.setText(String.format("%.4f",perimetro));
                    textSemiPerimetro.setText(String.format("%.4f",semiPerimetro));
                    textHA.setText(String.format("%.4f", ha));
                    textHB.setText(String.format("%.4f",hb));
                    textHC.setText(String.format("%.4f", hc));
                    textMA.setText(String.format("%.4f", ma));
                    textMB.setText(String.format("%.4f", mb));
                    textMC.setText(String.format("%.4f", mc));
                    textRadioInterno.setText(String.format("%.4f", radioInterno));
                    textRadioExterno.setText(String.format("%.4f", radioExterno));
                    }
                }else if(contador > 3){
                    JOptionPane.showMessageDialog(null, "No puedes ingresar más de 3 datos!", "Error", JOptionPane.WARNING_MESSAGE);
                }else if(contador < 3){
                    JOptionPane.showMessageDialog(null, "No puedes ingresar menos de 3 datos!", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        frame.add(panel);
        frame.setTitle("Calculadora de triangulos");
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args){
        calculadoraGrafica calculadora = new calculadoraGrafica();
        calculadora.calculadoraTrianguloGrafico();
    }
}