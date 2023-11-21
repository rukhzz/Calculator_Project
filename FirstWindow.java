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

    boolean isOpreatorClicked=false;
    double num1=0,num2=0,result=0;
	char operator;
    

    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;

    
    
    JButton eightButton,clearButton,numberButtons,delButton,percentageButton,negButton;
    JButton nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton;
    JButton dotButton,zeroButton,equalButton,divButton,mulButton,subButton,plusButton;
   

    public FirstWindow() {
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);
       

        /*label */
        displayLabel=new JLabel(" ");
        displayLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.blue);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel); 

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

        clearButton=new JButton("AC");
        clearButton.setBounds(430, 430, 80,80);
        clearButton.setFont(new Font("Arial", Font.PLAIN, (20)));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        delButton=new JButton("Del");
        delButton.setBounds(430, 330, 80,80);
        delButton.setFont(new Font("Arial", Font.PLAIN, (20)));
        delButton.addActionListener(this);
        jf.add(delButton);

        percentageButton=new JButton("%");
        percentageButton.setBounds(430, 230, 80,80);
        percentageButton.setFont(new Font("Arial", Font.PLAIN, (40)));
        percentageButton.addActionListener(this);
        jf.add(percentageButton);

        negButton=new JButton("(-)");
        negButton.setBounds(430, 130, 80,80);
        negButton.setFont(new Font("Arial", Font.PLAIN, (20)));
        negButton.addActionListener(this);
        jf.add(negButton);
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String []args){
         new FirstWindow();
    }

    public void actionPerformed(ActionEvent e){
       
        if (e.getSource()==sevenButton){

            
            displayLabel.setText(displayLabel.getText()+"7");

        }else if (e.getSource()==eightButton){

            displayLabel.setText(displayLabel.getText()+"8");
            
        }else if (e.getSource()==nineButton){

            
            displayLabel.setText(displayLabel.getText()+"9");

        }else if (e.getSource()==fourButton){

          
            displayLabel.setText(displayLabel.getText()+"4");

        }else if (e.getSource()==fiveButton){

            
            displayLabel.setText(displayLabel.getText()+"5");

        }else if (e.getSource()==sixButton){

            
            displayLabel.setText(displayLabel.getText()+"6");

        }else if (e.getSource()==oneButton){

            
            displayLabel.setText(displayLabel.getText()+"1");

        }else if (e.getSource()==twoButton){

           
            displayLabel.setText(displayLabel.getText()+"2");

        }else if (e.getSource()==threeButton){

            
            displayLabel.setText(displayLabel.getText()+"3");

        }else if(e.getSource()==dotButton){
            displayLabel.setText(displayLabel.getText()+".");

        }else if (e.getSource()==zeroButton){

         
            displayLabel.setText(displayLabel.getText()+"0");

        }else if (e.getSource()==percentageButton){

         
            
            num1 = Double.parseDouble(displayLabel.getText());
			operator ='%';
           
			displayLabel.setText("");
         

        }else if (e.getSource()==equalButton){
            
            num2=Double.parseDouble(displayLabel.getText());
			
			switch(operator) {
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
                if(num1!=0){
                    result=num1/num2;
                }
                else{
                System.out.println("Error:Cannot divided by zero");
                }
				break;
            case'%':
                
                result=num1%num2;
                break;
			}
			displayLabel.setText(String.valueOf(result));
			num1=result;

        }else if (e.getSource()==divButton){
            num1 =Double.parseDouble(displayLabel.getText());
			operator ='/';
          
			displayLabel.setText("");
           
            

        }else if (e.getSource()==mulButton){
            num1 = Double.parseDouble(displayLabel.getText());
			operator ='*';
			displayLabel.setText("");
         
            
        }else if (e.getSource()==subButton){
            num1 = Double.parseDouble(displayLabel.getText());
			operator ='-';
			displayLabel.setText("");
            
           
         }else if (e.getSource()==plusButton){
            num1 = Double.parseDouble(displayLabel.getText());
			operator ='+';
			displayLabel.setText("");


        }else if (e.getSource()==clearButton){
            displayLabel.setText(" ");
        }
        else if(e.getSource()==delButton) {
			String string = displayLabel.getText();
			displayLabel.setText("");
			for(int i=0;i<string.length()-1;i++) {
				displayLabel.setText(displayLabel.getText()+string.charAt(i));
            }
        }
        else if(e.getSource()==negButton) {
                double temp = Double.parseDouble(displayLabel.getText());
                temp*=-1;
                displayLabel.setText(String.valueOf(temp));
        }
            
    }
}