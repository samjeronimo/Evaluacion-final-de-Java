package view;

import model.Tarea;
import servicies.DataTareas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class NuevaTareaView {
    public static JPanel panelTarea(ArrayList<Tarea> tareas){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.setBackground(Color.BLACK);
        JLabel [] campos = {new JLabel(""), new JLabel(), new JLabel(), new JLabel()};
        campos[0].setFont(new Font("Nimbus Sans", Font.BOLD, 22));
        for (JLabel campo : campos) {
            panel.add(campo);
        }

        String [] campos2 = {"Titulo","Descripcion","Estado"};
        for (String campo2 : campos2) {
            panel.add(new JLabel(campo2));
        }

        ArrayList<Tarea> listaPacientes = DataTareas.listaTareas();

        for (Tarea infoPaciente : listaPacientes) {
            panel.add(new JLabel(infoPaciente.getTitulo()));
            panel.add(new JLabel(infoPaciente.getDescripcion()));
            panel.add(new JLabel(infoPaciente.getEstado()));
        }
        return panel;
    }
}
