import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Ventana extends JFrame {



    private List<String> values = Arrays.asList("1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15","");
    private ArrayList <JButton> botonlist = new ArrayList<>();
    private JButton b1 = new JButton();
    private JButton b2 = new JButton();
    private JButton b3 = new JButton();
    private JButton b4 = new JButton();
    private JButton b5 = new JButton();
    private JButton b6 = new JButton();
    private JButton b7 = new JButton();
    private JButton b8 = new JButton();
    private JButton b9 = new JButton();
    private JButton b10 = new JButton();
    private JButton b11 = new JButton();
    private JButton b12 = new JButton();
    private JButton b13 = new JButton();
    private JButton b14 = new JButton();
    private JButton b15 = new JButton();
    private JButton b16 = new JButton();



    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana frame = new Ventana();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 587, 476);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));



        botonlist.add(b1);
        botonlist.add(b2);
        botonlist.add(b3);
        botonlist.add(b4);
        botonlist.add(b5);
        botonlist.add(b6);
        botonlist.add(b7);
        botonlist.add(b8);
        botonlist.add(b9);
        botonlist.add(b10);
        botonlist.add(b11);
        botonlist.add(b12);
        botonlist.add(b13);
        botonlist.add(b14);
        botonlist.add(b15);
        botonlist.add(b16);


        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 51));
        panel.setLayout(new GridLayout(4, 4, 0, 0));
        reiniciarr();
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Arial", Font.BOLD, 19));

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(0);

            }
        });
        panel.add(b1);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Arial", Font.BOLD, 19));

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(1);
            }
        });
        panel.add(b2);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Arial", Font.BOLD, 19));

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(2);
            }
        });
        panel.add(b3);
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font("Arial", Font.BOLD, 19));

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(3);
            }
        });
        panel.add(b4);
        b5.setForeground(Color.BLACK);
        b5.setFont(new Font("Arial", Font.BOLD, 19));

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(4);
            }
        });
        panel.add(b5);
        b6.setForeground(Color.BLACK);
        b6.setFont(new Font("Arial", Font.BOLD, 19));

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(5);
            }
        });
        panel.add(b6);
        b7.setForeground(Color.BLACK);
        b7.setFont(new Font("Arial", Font.BOLD, 19));

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(6);
            }
        });
        panel.add(b7);
        b8.setForeground(Color.BLACK);
        b8.setFont(new Font("Arial", Font.BOLD, 19));

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(7);
            }
        });
        panel.add(b8);
        b9.setForeground(Color.BLACK);
        b9.setFont(new Font("Arial", Font.BOLD, 19));

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(8);
            }
        });
        panel.add(b9);
        b10.setForeground(Color.BLACK);
        b10.setFont(new Font("Arial", Font.BOLD, 19));

        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(9);
            }
        });
        panel.add(b10);
        b11.setForeground(Color.BLACK);
        b11.setFont(new Font("Arial", Font.BOLD, 19));

        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(10);
            }
        });
        panel.add(b11);
        b12.setForeground(Color.BLACK);
        b12.setFont(new Font("Arial", Font.BOLD, 19));

        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(11);
            }
        });
        panel.add(b12);
        b13.setForeground(Color.BLACK);
        b13.setFont(new Font("Arial", Font.BOLD, 19));

        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(12);
            }
        });
        panel.add(b13);
        b14.setForeground(Color.BLACK);
        b14.setFont(new Font("Arial", Font.BOLD, 19));

        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(13);
            }
        });
        panel.add(b14);
        b15.setForeground(Color.BLACK);
        b15.setFont(new Font("Arial", Font.BOLD, 19));

        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(14);
            }
        });
        panel.add(b15);
        b16.setForeground(Color.BLACK);
        b16.setFont(new Font("Arial", Font.BOLD, 19));

        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiar(15);
            }
        });
        panel.add(b16);
        contentPane.add(panel);



        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(0, 0, 51));
        FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
        flowLayout_1.setVgap(15);
        contentPane.add(panel_2, BorderLayout.NORTH);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 0, 51));
        FlowLayout flowLayout_2 = (FlowLayout) panel_3.getLayout();
        flowLayout_2.setHgap(15);
        contentPane.add(panel_3, BorderLayout.EAST);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(0, 0, 51));
        FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
        flowLayout.setHgap(15);
        contentPane.add(panel_4, BorderLayout.WEST);

        JPanel panel_5 = new JPanel();
        panel_5.setBackground(new Color(0, 0, 51));
        contentPane.add(panel_5, BorderLayout.SOUTH);
        panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JButton Reiniciar = new JButton("Reinicar");
        Reiniciar.setBackground(new Color(0, 204, 255));
        Reiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciarr();
            }
        });
        panel_5.add(Reiniciar);

        color();
    }


    public void cambiar(int lugar) {
        //derecha
        if(lugar-1>=0) {
            if(botonlist.get(lugar-1).getText().equals("") && lugar-1!=3 && lugar-1!=7 && lugar-1!=11) {
                botonlist.get(lugar-1).setText(botonlist.get(lugar).getText());
                botonlist.get(lugar).setText("");
            }}
        //izquierda
        if(lugar+1<=15) {
            if(botonlist.get(lugar+1).getText().equals("") && lugar+1!=4 && lugar+1!=8 && lugar+1!=12 ) {
                botonlist.get(lugar+1).setText(botonlist.get(lugar).getText());
                botonlist.get(lugar).setText("");
            }}
        //abajo
        if(lugar-4>=0) {
            if(botonlist.get(lugar-4).getText().equals("")) {
                botonlist.get(lugar-4).setText(botonlist.get(lugar).getText());
                botonlist.get(lugar).setText("");
            }}
        //arriba
        if(lugar+4<=15) {
            if(botonlist.get(lugar+4).getText().equals("")) {
                botonlist.get(lugar+4).setText(botonlist.get(lugar).getText());
                botonlist.get(lugar).setText("");
            }}
        if(botonlist.get(0).getText().equals("1") &&
                botonlist.get(1).getText().equals("2") &&
                botonlist.get(2).getText().equals("3") &&
                botonlist.get(3).getText().equals("4") &&
                botonlist.get(4).getText().equals("5") &&
                botonlist.get(5).getText().equals("6") &&
                botonlist.get(6).getText().equals("7") &&
                botonlist.get(7).getText().equals("8") &&
                botonlist.get(8).getText().equals("9") &&
                botonlist.get(9).getText().equals("10") &&
                botonlist.get(10).getText().equals("11") &&
                botonlist.get(11).getText().equals("12") &&
                botonlist.get(12).getText().equals("13") &&
                botonlist.get(13).getText().equals("14") &&
                botonlist.get(14).getText().equals("15") &&
                botonlist.get(15).getText().equals("")
        ) {
            JOptionPane.showMessageDialog(null, "Ganaste jeje","GG",JOptionPane.INFORMATION_MESSAGE);
            reiniciarr();
        }
        color();
    }

    public void reiniciarr(){
        Collections.shuffle(values);

        b1.setText(values.get(0));
        b2.setText(values.get(1));
        b3.setText(values.get(2));
        b4.setText(values.get(3));
        b5.setText(values.get(4));
        b6.setText(values.get(5));
        b7.setText(values.get(6));
        b8.setText(values.get(7));
        b9.setText(values.get(8));
        b10.setText(values.get(9));
        b11.setText(values.get(10));
        b12.setText(values.get(11));
        b13.setText(values.get(12));
        b14.setText(values.get(13));
        b15.setText(values.get(14));
        b16.setText(values.get(15));
        color();
    }

    public void color() {

        for(int i=0;i<16;i++) {
            if(botonlist.get(i).getText().equals("1")) {
                botonlist.get(i).setBackground(Color.decode("#FF5733"));
            }
            if(botonlist.get(i).getText().equals("2")) {
                botonlist.get(i).setBackground(Color.decode("#2471A3"));
            }
            if(botonlist.get(i).getText().equals("3")) {
                botonlist.get(i).setBackground(Color.decode("#2ECC71"));
            }
            if(botonlist.get(i).getText().equals("4")) {
                botonlist.get(i).setBackground(Color.decode("#F1C40F"));
            }
            if(botonlist.get(i).getText().equals("5")) {
                botonlist.get(i).setBackground(Color.decode("#F39C12"));
            }
            if(botonlist.get(i).getText().equals("6")) {
                botonlist.get(i).setBackground(Color.decode("#9B59B6"));
            }
            if(botonlist.get(i).getText().equals("7")) {
                botonlist.get(i).setBackground(Color.decode("#E91E63"));
            }
            if(botonlist.get(i).getText().equals("8")) {
                botonlist.get(i).setBackground(Color.decode("#1ABC9C"));
            }
            if(botonlist.get(i).getText().equals("9")) {
                botonlist.get(i).setBackground(Color.decode("#EAECEE"));
            }
            if(botonlist.get(i).getText().equals("10")) {
                botonlist.get(i).setBackground(Color.decode("#8B4513"));
            }
            if(botonlist.get(i).getText().equals("11")) {
                botonlist.get(i).setBackground(Color.decode("#0B5345"));
            }
            if(botonlist.get(i).getText().equals("12")) {
                botonlist.get(i).setBackground(Color.decode("#006442"));
            }
            if(botonlist.get(i).getText().equals("13")) {
                botonlist.get(i).setBackground(Color.decode("#2C3E50"));
            }
            if(botonlist.get(i).getText().equals("14")) {
                botonlist.get(i).setBackground(Color.decode("#FFC0CB"));
            }
            if(botonlist.get(i).getText().equals("15")) {
                botonlist.get(i).setBackground(Color.decode("#34495E"));
            }
            if(botonlist.get(i).getText().equals("")) {
                botonlist.get(i).setBackground(Color.decode("#FFFFFF"));
            }


        }


    }



}
