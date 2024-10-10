package view;

import java.util.Scanner;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MetaPanelView extends JFrame {
    public static Scanner yourName = new Scanner(System.in);
    public static Scanner weeklyGoal = new Scanner(System.in);
    public static Scanner monthlyGoal = new Scanner(System.in);
    public static Scanner yearlyGoal = new Scanner(System.in);

    private final JLabel nameJLabel = new JLabel("Insira seu nome:", SwingConstants.CENTER);
    private final JLabel weeklyGoalJLabel = new JLabel("Insira sua meta semanal:", SwingConstants.CENTER);
    private final JLabel monthlyGoalJLabel = new JLabel("Insira sua meta mensal:", SwingConstants.CENTER);
    private final JLabel yearlyGoalJLabel = new JLabel("Insira sua meta anual:", SwingConstants.CENTER);

    private final JTextField nameJTextField = new JTextField("", SwingConstants.CENTER);
    private final JTextField weeklyGoalJTextField = new JTextField("", SwingConstants.CENTER);
    private final JTextField monthlyGoalJTextField = new JTextField("", SwingConstants.CENTER);
    private final JTextField yearlyGoalJTextField = new JTextField("", SwingConstants.CENTER);

    private final JLabel espacador1 = new JLabel("");
    private final JLabel espacador2 = new JLabel("");
    private final JLabel espacador3 = new JLabel("");
    private final JLabel espacador4 = new JLabel("");
    private final JLabel espacador5 = new JLabel("");
    private final JLabel espacador6 = new JLabel("");

    private final JButton calculateJButton = new JButton("Calcular");

    public MetaPanelView() {
        super("Calculo");   
        setLayout(new GridLayout(9,3,5,5));

        JPanel linha1 = new JPanel(new GridLayout(1, 3, 5, 5));

        JPanel linha2 = new JPanel(new GridLayout(1, 2, 5, 5));

        JPanel linha3 = new JPanel(new GridLayout(1, 3, 5, 5));

        JPanel linha4 = new JPanel(new GridLayout(1, 3, 5, 5));

        JPanel linha5 = new JPanel(new GridLayout(1, 2, 5, 5));

        JPanel linha6 = new JPanel(new GridLayout(1, 4, 5, 5));

        JPanel linha7 = new JPanel(new GridLayout(1, 3, 5, 5));

        JPanel linha8 = new JPanel(new GridLayout(1, 1, 5, 5));

        JPanel linha9 = new JPanel(new GridLayout(1, 1, 5, 5));

        linha1.add(nameJLabel);
        add(linha1);

        linha2.add(nameJTextField);
        add(linha2);

        linha3.add(weeklyGoalJLabel);
        add(linha3);

        linha4.add(weeklyGoalJTextField);
        add(linha4);

        linha5.add(monthlyGoalJLabel);
        add(linha5);

        linha6.add(monthlyGoalJTextField);
        add(linha6);

        linha7.add(yearlyGoalJLabel);
        add(linha7);

        linha8.add(yearlyGoalJTextField);
        add(linha8);

        linha9.add(calculateJButton);
        add(linha9);

        setSize(600, 300);
        setVisible(true);

        calculateJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {

                } catch (Exception ex) {
                    ex.printStackTrace();;
                }
            }
        });
    }
    

    public static void main(String[] args) {
        
        MetaPanelView application = new MetaPanelView();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
