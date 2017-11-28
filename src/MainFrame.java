import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private int fmW=900,fmH=700,screenW= dim.width,screenH=dim.height;
    private Container cp;
    private JPanel jpset = new JPanel(new GridLayout(7,1,3,3));
    private JPanel jpm = new JPanel();
    private JPanel jpox = new JPanel(new GridLayout(3,3,3,3));

    private JLabel lab1=new JLabel("Server IP:");
    private JLabel lab2=new JLabel("10.51.3.69");
    private JLabel lab3=new JLabel("Port:");
    private JTextField tfp=new JTextField();
    private JButton btn1=new JButton("Start");
    private JButton btn2=new JButton("Stop");
    private JButton btn3=new JButton("Exit");
    private JButton btn4=new JButton("Send");

    private JButton btnox1=new JButton();
    private JButton btnox2=new JButton();
    private JButton btnox3=new JButton();
    private JButton btnox4=new JButton();
    private JButton btnox5=new JButton();
    private JButton btnox6=new JButton();
    private JButton btnox7=new JButton();
    private JButton btnox8=new JButton();
    private JButton btnox9=new JButton();

    private JTextArea jta = new JTextArea();
    private JScrollPane jsp = new JScrollPane(jta);//訊息框
    private JTextField jtw=new JTextField();//輸入文字
    private boolean flag=false;

    public MainFrame(){initComp();}

    public void initComp(){
        this.setBounds(screenW/2-fmW/2,screenH/2-fmH/2,fmW,fmH);
        this.setTitle("Server");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(jpset,BorderLayout.EAST);
        cp.add(jpm,BorderLayout.SOUTH);
        cp.add(jsp,BorderLayout.WEST);
        cp.add(jpox,BorderLayout.CENTER);
        jpset.add(lab1);
        jpset.add(lab2);
        jpset.add(lab3);
        jpset.add(tfp);
        jpset.add(btn1);
        jpset.add(btn2);
        jpset.add(btn3);

        jpm.add(jtw,BorderLayout.CENTER);
        jpm.add(btn4,BorderLayout.EAST);


        jpox.add(btnox1);
        jpox.add(btnox2);
        jpox.add(btnox3);
        jpox.add(btnox4);
        jpox.add(btnox5);
        jpox.add(btnox6);
        jpox.add(btnox7);
        jpox.add(btnox8);
        jpox.add(btnox9);

        btnox1.setEnabled(flag);
        btnox2.setEnabled(flag);
        btnox3.setEnabled(flag);
        btnox4.setEnabled(flag);
        btnox5.setEnabled(flag);
        btnox6.setEnabled(flag);
        btnox7.setEnabled(flag);
        btnox8.setEnabled(flag);
        btnox9.setEnabled(flag);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=true;
                btnox1.setEnabled(flag);
                btnox2.setEnabled(flag);
                btnox3.setEnabled(flag);
                btnox4.setEnabled(flag);
                btnox5.setEnabled(flag);
                btnox6.setEnabled(flag);
                btnox7.setEnabled(flag);
                btnox8.setEnabled(flag);
                btnox9.setEnabled(flag);
            }
        });


        btn3.setBackground(new Color(0xFFB0C1));
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jta.setEditable(false);
        jta.setPreferredSize(new Dimension(200,400));
        jtw.setPreferredSize(new Dimension(700,25));
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setText(jtw.getText());
                jta.setLineWrap(true);
            }
        });


    }
}
