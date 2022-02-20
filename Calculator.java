package com.company;
import java.awt.EventQueue;

import javax.swing.*;       //Swing is used to create light window-based applications

import java.awt.*;          //Java AWT (Abstract Window Toolkit) is an API to develop GUI

import java.awt.event.*;


public class Calculator {

    public JFrame frame;                // is a top-level container that provides a window on the screen
    public JTextField textField;        // is a component that allows editing of a single line of text.
    public double first,second,result;
    String answer,operation;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator window = new Calculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Sardor Calculator");                                    // title of the window

        frame.setSize(376, 576);                                            //size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                           // ... and etc with window/frame panel
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();                                                   // assigning a textField to a new variable
        textField.setHorizontalAlignment(SwingConstants.RIGHT);                         // setting the text field
        textField.setFont(new Font("Tahoma", Font.PLAIN, 32));                // ... and etc with textfiled
        textField.setBounds(10, 13, 348, 82);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        ButtonGroup btg=new ButtonGroup();                                               // ButtonGroup instance guarantees that only one button can be selected at a time
        JRadioButton onButton = new JRadioButton("On");                             // Radio button is used to select one option from multiple options
        onButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        onButton.setBounds(12, 108, 74, 32);
        frame.getContentPane().add(onButton);

        JRadioButton offButton = new JRadioButton("Off");                          // ButtonGroup instance guarantees that only one button can be selected at a time
        offButton.setFont(new Font("Tahoma", Font.PLAIN, 17));               // Radio button is used to select one option from multiple options
        offButton.setBounds(12, 145, 74, 32);
        frame.getContentPane().add(offButton);
        btg.add(onButton);
        btg.add(offButton);


        JButton fieldEraser = new JButton("<");                                     // creating a button named fieldEraser with the string text "<"
        fieldEraser.addActionListener(new ActionListener() {
            String erase;
            public void actionPerformed(ActionEvent e) {
                try {                                                                   // try and catching exception
                    if(textField.getText().length()>0)                                  // if condition if textField has 1 or more than 1 characters then True
                    {
                        StringBuilder obj=new StringBuilder(textField.getText());
                        obj.deleteCharAt(textField.getText().length()-1);
                        erase=obj.toString();
                        textField.setText(erase);
                    }

                } catch (Exception e1) {
                    System.out.println("<");
                }
            }
        });
        fieldEraser.setFont(new Font("Tahoma", Font.BOLD, 22));
        fieldEraser.setForeground(new Color(0, 0, 0));
        fieldEraser.setBounds(94, 108, 72, 69);
        frame.getContentPane().add(fieldEraser);

        JButton bc = new JButton("C");
        bc.setFont(new Font("Tahoma", Font.BOLD, 22));
        bc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });
        bc.setBounds(178, 108, 85, 69);
        frame.getContentPane().add(bc);


        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    first=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="+";
                } catch (Exception e1) {
                    System.out.println("error in : " + operation);
                }
            }
        });
        plus.setFont(new Font("Tahoma", Font.BOLD, 22));
        plus.setBounds(275, 108, 85, 69);
        frame.getContentPane().add(plus);


        ////////////////ROW/////////////////////////



        JButton b7 = new JButton("7");
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText()+b7.getText();
                textField.setText(num);
            }
        });
        b7.setFont(new Font("Tahoma", Font.BOLD, 22));
        b7.setBounds(12, 190, 85, 75);
        frame.getContentPane().add(b7);


        JButton b8 = new JButton();
        b8.setText("8");
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText()+b8.getText();
                textField.setText(num);
            }
        });
        b8.setFont(new Font("Tahoma", Font.BOLD, 22));
        b8.setBounds(108, 190, 85, 75);
        frame.getContentPane().add(b8);


        JButton b9 = new JButton("9");
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText()+b9.getText();
                textField.setText(num);
            }
        });
        b9.setFont(new Font("Tahoma", Font.BOLD, 22));
        b9.setBounds(205, 190, 85, 75);
        frame.getContentPane().add(b9);


        JButton min = new JButton("-");
        min.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    first=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="-";
                } catch (Exception e1) {
                    System.out.println("error in : " + operation);
                }
            }
        });
        min.setFont(new Font("Tahoma", Font.BOLD, 22));
        min.setBounds(297, 190, 63, 75);
        frame.getContentPane().add(min);

        /////////////////////Row 3/////////////////////


        JButton b4 = new JButton("4");
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText()+b4.getText();
                textField.setText(num);
            }
        });
        b4.setFont(new Font("Tahoma", Font.BOLD, 22));
        b4.setBounds(12, 278, 85, 75);
        frame.getContentPane().add(b4);


        JButton b5 = new JButton("5");
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText()+b5.getText();
                textField.setText(num);
            }
        });
        b5.setFont(new Font("Tahoma", Font.BOLD, 22));
        b5.setBounds(108, 278, 85, 75);
        frame.getContentPane().add(b5);


        JButton b6 = new JButton("6");
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText()+b6.getText();
                textField.setText(num);
            }
        });
        b6.setFont(new Font("Tahoma", Font.BOLD, 22));
        b6.setBounds(205, 278, 85, 75);
        frame.getContentPane().add(b6);


        JButton bx = new JButton("x");
        bx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    first=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="x";
                } catch (Exception e1) {
                    System.out.println("error in : " + operation);
                }
            }
        });
        bx.setFont(new Font("Tahoma", Font.BOLD, 22));
        bx.setBounds(297, 278, 63, 75);
        frame.getContentPane().add(bx);

        //////////////////////Row 4



        JButton b1 = new JButton("1");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText()+b1.getText();
                textField.setText(num);
            }
        });
        b1.setFont(new Font("Tahoma", Font.BOLD, 22));
        b1.setBounds(12, 366, 85, 75);
        frame.getContentPane().add(b1);


        JButton b2 = new JButton("2");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText()+b2.getText();
                textField.setText(num);
            }
        });
        b2.setFont(new Font("Tahoma", Font.BOLD, 22));
        b2.setBounds(108, 366, 85, 75);
        frame.getContentPane().add(b2);


        JButton b3 = new JButton("3");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText()+b3.getText();
                textField.setText(num);
            }
        });
        b3.setFont(new Font("Tahoma", Font.BOLD, 22));
        b3.setBounds(205, 366, 85, 75);
        frame.getContentPane().add(b3);


        JButton bd = new JButton("/");
        bd.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    first=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="/";
                } catch (Exception e1) {
                    System.out.println("error in : " + operation);
                }
            }
        });
        bd.setFont(new Font("Tahoma", Font.BOLD, 22));
        bd.setBounds(297, 366, 63, 75);
        frame.getContentPane().add(bd);

        //////////////////////ROW 5///////////////////////////////////////////////////////


        JButton b0 = new JButton("0");
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textField.getText()+b0.getText();
                textField.setText(num);

            }
        });
        b0.setFont(new Font("Tahoma", Font.BOLD, 22));
        b0.setBounds(12, 454, 56, 75);
        frame.getContentPane().add(b0);


        JButton bp = new JButton("%");
        bp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    first=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="%";
                } catch (Exception e1) {
                    System.out.println("error in : " + operation);
                }
            }
        });
        bp.setFont(new Font("Tahoma", Font.BOLD, 28));
        bp.setBounds(149, 454, 74, 75);
        frame.getContentPane().add(bp);


        JButton btnNewButton = new JButton(".");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String num=textField.getText()+btnNewButton.getText();
                    textField.setText(num);
                } catch (Exception e1) {
                    System.out.println("error in textField.setText(num) ");
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 28));
        btnNewButton.setBounds(81, 454, 56, 75);
        frame.getContentPane().add(btnNewButton);



        JButton equal = new JButton("=");
        equal.setFont(new Font("Tahoma", Font.BOLD, 28));
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    second=Double.parseDouble(textField.getText());
                    switch(operation)
                    {
                        case "+":
                            result=first+second;
                            answer=String.format("%.2f",result);
                            textField.setText(answer);
                            break;
                        case "-":
                            result=first-second;
                            answer=String.format("%.2f",result);
                            textField.setText(answer);
                            break;
                        case "x":
                            result=first*second;
                            answer=String.format("%.2f",result);
                            textField.setText(answer);
                            break;
                        case "/":
                            result=first/second;
                            answer=String.format("%.2f",result);
                            textField.setText(answer);
                            break;
                        case "%":
                            result=first%second;
                            answer=String.format("%.2f",result);
                            textField.setText(answer);
                            break;
                    }
                }
                catch(Exception e1){
                    System.out.println("error in : " + operation);
                }

            }
        });
        equal.setBounds(236, 454, 124, 75);
        frame.getContentPane().add(equal);



        onButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                onButton.setEnabled(false);
                offButton.setEnabled(true);
                textField.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b0.setEnabled(true);
                fieldEraser.setEnabled(true);
                plus.setEnabled(true);
                min.setEnabled(true);
                bx.setEnabled(true);
                bd.setEnabled(true);
                equal.setEnabled(true);
                bc.setEnabled(true);
                bp.setEnabled(true);
                btnNewButton.setEnabled(true);
            }
        });

        offButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                onButton.setEnabled(true);
                offButton.setEnabled(false);
                textField.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b0.setEnabled(false);
                fieldEraser.setEnabled(false);
                plus.setEnabled(false);
                min.setEnabled(false);
                bx.setEnabled(false);
                bd.setEnabled(false);
                equal.setEnabled(false);
                bc.setEnabled(false);
                bp.setEnabled(false);
                btnNewButton.setEnabled(false);
            }
        });
    }
}

