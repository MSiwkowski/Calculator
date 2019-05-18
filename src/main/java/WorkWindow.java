import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.RIGHT;

public class WorkWindow extends JFrame implements ActionListener {

    private final int COL1 = 30, COL2 = 130, COL3 = 230, COL4 =330;
    private final int ROW1 = 130, ROW2 = 230 , ROW3 = 330 , ROW4 = 430;

    public WorkWindow(String textToBeDisplayed) {
        super("Kalkulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 650);
        setLocation(450, 20);
        setResizable(false);

        final JFormattedTextField display = new JFormattedTextField();
        display.setSize(430, 100);
        display.setLocation(10, 15);
        display.setFont(new Font("Arial", Font.BOLD, 32));
        display.setHorizontalAlignment(RIGHT);
        display.setText(textToBeDisplayed);
        display.setVisible(true);

        BtnMath btn_Plus = new BtnMath();
        BtnMath btn_Minus = new BtnMath();
        BtnMath btn_Div = new BtnMath();
        BtnMath btn_Mult = new BtnMath();
        btn_Plus.setText("+");
        btn_Plus.setLocation(COL4, ROW4 + 5);
        btn_Plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(Kalkulator.signalOperation(43));
                display.repaint();
                }
            });
        btn_Minus.setText("-");
        btn_Minus.setLocation(COL4, ROW3 + 5);
        btn_Minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(Kalkulator.signalOperation(45));
                display.repaint();
                }
            });
        btn_Div.setText("/");
        btn_Div.setLocation(COL4, ROW2 + 5);
        btn_Div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(Kalkulator.signalOperation(47));
                display.repaint();
                }
            });
        btn_Mult.setText("*");
        btn_Mult.setLocation(COL4, ROW1 + 5);
        btn_Mult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(Kalkulator.signalOperation(42));
                display.repaint();
                }
            });

        BtnDigit btn_1 = new BtnDigit();
        BtnDigit btn_2 = new BtnDigit();
        BtnDigit btn_3 = new BtnDigit();
        BtnDigit btn_4 = new BtnDigit();
        BtnDigit btn_5 = new BtnDigit();
        BtnDigit btn_6 = new BtnDigit();
        BtnDigit btn_7 = new BtnDigit();
        BtnDigit btn_8 = new BtnDigit();
        BtnDigit btn_9 = new BtnDigit();
        BtnDigit btn_0 = new BtnDigit();
        BtnDigit btn_Coma = new BtnDigit();
        BtnDigit btn_Sign = new BtnDigit();
        btn_1.setText("1");
        btn_1.setLocation(COL1, ROW3);
        btn_1.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        display.setText(Kalkulator.signalDigit(49));
                                        display.repaint();
                                    }
                                });
        btn_2.setText("2");
        btn_2.setLocation(COL2, ROW3);
        btn_2.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        display.setText(Kalkulator.signalDigit(50));
                                        display.repaint();
                                    }
                                });
        btn_3.setText("3");
        btn_3.setLocation(COL3, ROW3);
        btn_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(Kalkulator.signalDigit(51));
                display.repaint();
            }
        });
        btn_4.setText("4");
        btn_4.setLocation(COL1, ROW2);
        btn_4.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                    display.setText(Kalkulator.signalDigit(52));
                                    display.repaint();
                                    }
                                });
        btn_5.setText("5");
        btn_5.setLocation(COL2, ROW2);
        btn_5.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                    display.setText(Kalkulator.signalDigit(53));
                                    display.repaint();
                                    }
                                });
        btn_6.setText("6");
        btn_6.setLocation(COL3, ROW2);
        btn_6.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        display.setText(Kalkulator.signalDigit(54));
                                        display.repaint();
                                    }
                                });
        btn_7.setText("7");
        btn_7.setLocation(COL1, ROW1);
        btn_7.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        display.setText(Kalkulator.signalDigit(55));
                                        display.repaint();
                                    }
                                });
        btn_8.setText("8");
        btn_8.setLocation(COL2, ROW1);
        btn_8.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        display.setText(Kalkulator.signalDigit(56));
                                        display.repaint();
                                    }
                                });
        btn_9.setText("9");
        btn_9.setLocation(COL3, ROW1);
        btn_9.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        display.setText(Kalkulator.signalDigit(57));
                                        display.repaint();
                                    }
                                });
        btn_0.setLocation(COL1, ROW4);
        btn_0.setText("0");
        btn_0.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        display.setText(Kalkulator.signalDigit(48));
                                        display.repaint();
                                    }
                                });
        btn_Coma.setText(",");
        btn_Coma.setLocation(COL2, ROW4);
        btn_Coma.addActionListener(new ActionListener() {
                                       public void actionPerformed(ActionEvent e) {
                                           display.setText(Kalkulator.signalComa());
                                           display.repaint();
                                       }
                                   });
        btn_Sign.setText("+/-");
        btn_Sign.setLocation(COL3, ROW4);
        btn_Sign.addActionListener(new ActionListener() {
                                       public void actionPerformed(ActionEvent e) {
                                           display.setText(Kalkulator.changeSign());
                                           display.repaint();
                                       }
                                   });

        BtnSpecial btn_Equal = new BtnSpecial();
        BtnSpecial btn_Clear = new BtnSpecial();
        BtnSpecial btn_ClearAll = new BtnSpecial();
        btn_Equal.setText("=");
        btn_Equal.setSize(150, 90);
        btn_Equal.setLocation(COL4 - 50, ROW4 + 90);
        btn_Equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(Kalkulator.calculate());
                display.repaint();
            }
        });
        btn_Clear.setText("C");
        btn_Clear.setSize(120, 90);
        btn_Clear.setLocation(10, ROW4 + 90);
        btn_Clear.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            display.setText(Kalkulator.clearOne());
                                            display.repaint();
                                        }
                                    });
        btn_ClearAll.setText("AC");
        btn_ClearAll.setSize(120, 90);
        btn_ClearAll.setLocation(COL2 + 10, ROW4 + 90);
        btn_ClearAll.addActionListener(new ActionListener() {
                                           public void actionPerformed(ActionEvent e) {
                                               display.setText(Kalkulator.clearAll());
                                               display.repaint();
                                           }
                                       });

        add(btn_9);
        add(btn_0);
        add(btn_1);
        add(btn_2);
        add(btn_3);
        add(btn_4);
        add(btn_5);
        add(btn_6);
        add(btn_7);
        add(btn_8);
        add(btn_Coma);
        add(btn_Sign);
        add(btn_Plus);
        add(btn_Minus);
        add(btn_Div);
        add(btn_Mult);
        add(btn_Equal);
        add(btn_Clear);
        add(btn_ClearAll);
        add(display);
        add(new JSeparator());

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

    }
}

