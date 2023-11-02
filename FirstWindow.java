import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.ColorAttribute;



public class FirstWindow implements ActionListener{

    JFrame jf;
    JLabel displaylabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton;
    JButton dotButton,zeroButton,equalButton,divButton,mulButton,subButton,plusButton;
   

    public FirstWindow() {
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);
       

        /*label */
        displaylabel=new JLabel(" ");
        displaylabel.setFont(new Font("Serif", Font.PLAIN, 20));
        displaylabel.setBounds(30, 50, 540, 40);
        displaylabel.setBackground(Color.CYAN);
        displaylabel.setOpaque(true);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displaylabel.setForeground(Color.BLACK);
        jf.add(displaylabel); 

        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 130, 80,80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(130, 130, 80,80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(230, 130, 80,80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30, 230, 80,80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130, 230, 80,80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(230, 230, 80,80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30, 330, 80,80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(130, 330, 80,80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(230, 330, 80,80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30, 430, 80,80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(130, 430, 80,80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton=new JButton("=");
        equalButton.setBounds(230, 430, 80,80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton=new JButton("/");
        divButton.setBounds(330, 130, 80,80);
        divButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        divButton.addActionListener(this);
        jf.add(divButton);

        mulButton=new JButton("x");
        mulButton.setBounds(330, 230, 80,80);
        mulButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        mulButton.addActionListener(this);
        jf.add(mulButton);

        subButton=new JButton("-");
        subButton.setBounds(330, 330, 80,80);
        subButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        subButton.addActionListener(this);
        jf.add(subButton);

        plusButton=new JButton("+");
        plusButton.setBounds(330, 430, 80,80);
        plusButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        plusButton.addActionListener(this);
        jf.add(plusButton);
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String []args){
         new FirstWindow();
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==sevenButton){
            displaylabel.setText("7");
        }else if (e.getSource()==eightButton){
            displaylabel.setText("8");
        }else if (e.getSource()==nineButton){
            displaylabel.setText("9");
        }else if (e.getSource()==fourButton){
            displaylabel.setText("4");
        }else if (e.getSource()==fiveButton){
            displaylabel.setText("5");
        }else if (e.getSource()==sixButton){
            displaylabel.setText("6");
        }else if (e.getSource()==oneButton){
            displaylabel.setText("1");
        }else if (e.getSource()==twoButton){
            displaylabel.setText("2");
        }else if (e.getSource()==threeButton){
            displaylabel.setText("3");
        }else if(e.getSource()==dotButton){
            displaylabel.setText(".");
        }else if (e.getSource()==zeroButton){
            displaylabel.setText("0");
        }else if (e.getSource()==equalButton){
            displaylabel.setText("=");
        }else if (e.getSource()==divButton){
            displaylabel.setText("/");
        }else if (e.getSource()==mulButton){
            displaylabel.setText("x");
        }else if (e.getSource()==subButton){
            displaylabel.setText("-");
        }else if (e.getSource()==plusButton){
            displaylabel.setText("+");
        }
    }



    
    
}
