package view;

import model.Tarea;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TareasView extends JFrame {


    public TareasView(){
        this.setLocationRelativeTo(null);
        this.setBounds(0, 0, 1200, 1000);

        JPanel mainPanel = new JPanel(new GridLayout(1,2));

        JPanel panelControles = new JPanel(new GridLayout(2,1));
        panelControles.setBackground(Color.white);
        mainPanel.add(panelControles);

        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setBackground(Color.BLUE);
        panelControles.add(panel1);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.insets = new Insets(7, 7, 7, 7);
        restricciones.gridx = 0;
        restricciones.gridy = 0;

        JTextField btn1 = new JTextField();
        restricciones.gridy = 1;
        restricciones.gridx = 0;
        btn1.setPreferredSize(new Dimension(210,40));
        setBackground(Color.white);
        panel1.add(btn1, restricciones);

        JTextField btn2 = new JTextField();
        btn2.setPreferredSize(new Dimension(210,40));
        restricciones.gridy = 2;
        restricciones.gridx = 0;
        panel1.add(btn2, restricciones);

        JTextField btn3 = new JTextField();
        btn3.setPreferredSize(new Dimension(210,40));
        restricciones.gridy = 3;
        restricciones.gridx = 0;
        panel1.add(btn3, restricciones);

        JTextField btn4 = new JTextField();
        btn4.setPreferredSize(new Dimension(210,40));
        restricciones.gridy = 4;
        restricciones.gridx = 0;
        panel1.add(btn4, restricciones);

        JButton crear = new JButton("Crear Tarea");
        restricciones.gridy = 5;
        restricciones.gridx = 0;
        panel1.add(crear, restricciones);

        JPanel panel2 = new JPanel(new GridBagLayout());
        panel2.setBackground(Color.GREEN);
        panelControles.add(panel2);

        JTextField eliminar = new JTextField();
        restricciones.gridy = 1;
        restricciones.gridx = 0;
        eliminar.setPreferredSize(new Dimension(190,45));
        panel2.add(eliminar, restricciones);

        JButton quitar = new JButton("Eliminar Tarea");
        restricciones.gridy = 2;
        restricciones.gridx = 0;
        panel2.add(quitar, restricciones);

        JPanel panelTarea = new JPanel();
        panelTarea.setBackground(Color.WHITE);
        mainPanel.add(panelTarea);

        this.add(mainPanel);
        this.setVisible(true);
    }
}
