import javax.swing.JFrame;

public class FirstWindow {

    public FirstWindow() {
        JFrame jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String []args){
         new FirstWindow();
    }



    
    
}
