import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Crear el JFrame
        JFrame frame = new JFrame("Mostrar Valor Ingresado");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Etiqueta para mostrar el resultado
        JLabel label = new JLabel("Valor Ingresado:");
        label.setBounds(30, 30, 150, 25);
        frame.add(label);

        // Campo de texto para que el usuario ingrese un número
        JTextField textField = new JTextField();
        textField.setBounds(160, 30, 150, 25);
        frame.add(textField);

        // Etiqueta para mostrar el valor ingresado
        JLabel resultado = new JLabel("");
        resultado.setBounds(30, 70, 300, 25);
        frame.add(resultado);

        // Botón para mostrar el valor
        JButton boton = new JButton("Mostrar");
        boton.setBounds(160, 100, 150, 25);
        frame.add(boton);

        // Acción del botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener el valor ingresado y convertirlo a double
                    double valorIngresado = Double.parseDouble(textField.getText());
                    // Mostrar el valor en la etiqueta resultado
                    resultado.setText("El valor ingresado es: " + valorIngresado);
                } catch (NumberFormatException ex) {
                    // Mostrar un mensaje de error si el valor no es un número válido
                    resultado.setText("Por favor, ingresa un número válido.");
                }
            }
        });

        // Mostrar el JFrame
        frame.setVisible(true);
    }
}
