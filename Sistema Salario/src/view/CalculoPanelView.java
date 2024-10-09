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

    public static void main(String[] args) {
        System.out.println("Digite seu Nome Completo");
        String nome = yourName.nextLine();

        System.out.println("Defina sua Meta Semanal");
        int metaSemanal = weeklyGoal.nextInt();

        System.out.println("Defina sua Meta Mensal");
        int metaMensal = monthlyGoal.nextInt();

        System.out.println("Defina sua Meta Anual");
        int metaAnual = yearlyGoal.nextInt();
        
        System.out.println("Seu nome é: " + nome);
        System.out.println("Meta Semanal: " + metaSemanal);
        System.out.println("Meta Mensal: " + metaMensal);
        System.out.println("Meta Anual: " + metaAnual);
        
        
    }
}
