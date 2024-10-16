package view;

import java.util.Scanner;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalculoPanelView extends JFrame {
    public static Scanner yourName = new Scanner(System.in);
    public static Scanner weeklyGoal = new Scanner(System.in);
    public static Scanner monthlyGoal = new Scanner(System.in);
    public static Scanner yearlyGoal = new Scanner(System.in);

    private final JLabel resultJLabel = new JLabel("Resultado:", SwingConstants.CENTER);
    private final JLabel baseSalaryJLabel = new JLabel("Salário Mínimo:", SwingConstants.CENTER);
    private final JLabel JLabel = new JLabel("Bônus por meta semanal, alcançada:", SwingConstants.CENTER);
    private final JLabel finalSalaryJLabel = new JLabel("Insira sua meta anual:", SwingConstants.CENTER);

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

    public CalculoPanelView() {
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

        linha1.add(resultJLabel);
        add(linha1);

        linha2.add(espacador1);
        add(linha2);

        linha3.add(baseSalaryJLabel);
        add(linha3);

        linha4.add(weeklyGoalJTextField);
        add(linha4);

        linha5.add(finalSalaryJLabel);
        add(linha5);

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
        
        CalculoPanelView application = new CalculoPanelView();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
