import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.EOFException;


class Main implements ActionListener {


    TextField bttext=new TextField();
    JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,bta,bts,btd,btm,btdisplay,btc=new JButton();
    Main()  {
        Frame frame = new Frame("calculator");



        frame.setBackground(new Color(90,190,25));



        bt1=new JButton("1");
        bt1.setBounds(55,110,55,35);
        bt1.addActionListener(this);
        bt2=new JButton("2");
        bt2.setBounds(125,110,55,35);
        bt2.addActionListener(this);
        bt3=new JButton("3");
        bt3.setBounds(195,110,55,35);
        bt3.addActionListener(this);
        bta=new JButton("+");
        bta.setBounds(265,110,55,35);
        bta.addActionListener(this);
        bt4=new JButton("4");
        bt4.setBounds(55,160,55,35);
        bt4.addActionListener(this);
        bt5=new JButton("5");
        bt5.setBounds(125,160,55,35);
        bt5.addActionListener(this);
        bt6=new JButton("6");
        bt6.setBounds(195,160,55,35);
        bt6.addActionListener(this);
        bts=new JButton("-");
        bts.setBounds(265,160,55,35);
        bts.addActionListener(this);
        bt7=new JButton("7");
        bt7.setBounds(55,210,55,35);
        bt7.addActionListener(this);
        bt8=new JButton("8");
        bt8.setBounds(125,210,55,35);
        bt8.addActionListener(this);
        bt9=new JButton("9");
        bt9.setBounds(195,210,55,35);
        bt9.addActionListener(this);
        btm=new JButton("*");
        btm.setBounds(265,210,55,35);
        btm.addActionListener(this);
        bt0=new JButton("0");
        bt0.setBounds(55,260,55,35);
        bt0.addActionListener(this);
        btdisplay=new JButton("=");
        btdisplay.setBounds(125,260,55,35);
        btdisplay.addActionListener(this);
        btd=new JButton("/");
        btd.setBounds(265,260,55,35);
        btd.addActionListener(this);
        btc=new JButton("C");
        btc.setBounds(195,260,55,35);
        btc.addActionListener(this);

        bttext.setBounds(55,50,280,50);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });


        frame.setLayout(null);
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bta);
        frame.add(bt4);
        frame.add(bt5);
        frame.add(bt6);
        frame.add(bts);
        frame.add(bt7);
        frame.add(bt8);
        frame.add(bt9);
        frame.add(btm);
        frame.add(bt0);
        frame.add(btdisplay);
        frame.add(btd);
        frame.add(btc);
        frame.add(bttext);

        frame.setVisible(true);
        frame.setSize(400, 400);


    }
    public static void main(String[] args) throws AWTException {
        new Main();
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==bt1){
            String sample=bttext.getText();
            sample+="1";
            bttext.setText(sample);

        }
        if(e.getSource()==bt2){
            String sample=bttext.getText();
            sample+="2";
            bttext.setText(sample);

        }
        if(e.getSource()==bt3){
            String sample=bttext.getText();
            sample+="3";
            bttext.setText(sample);

        }
        if(e.getSource()==bt4){
            String sample=bttext.getText();
            sample+="4";
            bttext.setText(sample);

        }
        if(e.getSource()==bt5){
            String sample=bttext.getText();
            sample+="5";
            bttext.setText(sample);

        }
        if(e.getSource()==bt6){
            String sample=bttext.getText();
            sample+="6";
            bttext.setText(sample);

        }
        if(e.getSource()==bt7){
            String sample=bttext.getText();
            sample+="7";
            bttext.setText(sample);

        }
        if(e.getSource()==bt8){
            String sample=bttext.getText();
            sample+="8";
            bttext.setText(sample);

        }
        if(e.getSource()==bt9){
            String sample=bttext.getText();
            sample+="9";
            bttext.setText(sample);

        }
        if(e.getSource()==bt0){
            String sample=bttext.getText();
            sample+="0";
            bttext.setText(sample);

        }
        if(e.getSource()==bta){
            String sample=bttext.getText();
            sample+="+";
            bttext.setText(sample);

        }
        if(e.getSource()==bts){
            String sample=bttext.getText();
            sample+="-";
            bttext.setText(sample);

        }
        if(e.getSource()==btm){
            String sample=bttext.getText();
            sample+="*";
            bttext.setText(sample);

        }
        if(e.getSource()==btd){
            String sample=bttext.getText();
            sample+="/";
            bttext.setText(sample);

        }
        if(e.getSource()==btc){
            String sample="";


            bttext.setText(sample);

        }
        if(e.getSource()==btdisplay){
            String b=bttext.getText();
             int result=0;
            char a = '+';
            char s = '-';
            char m = '*';
            char d = '/';
            String A = "";
            String B = "";
            int open = 0;
            char o = ' ';
            String C="";
            for (int i = 0; i < b.length(); i++) {
                char k = b.charAt(i);

                if (k == a) {
                    o = a;

                    open++;
                }
                if (k == s) {
                    o = s;

                    open++;

                }
                if (k == m) {
                    o = m;

                    open++;
                }
                if (k == d) {
                    o = d;

                    open++;

                }
                if (open == 0) {
                    A += k;
                } else if (open == 1) {
                    B+=k;


                }




            }
            for (int i=0;i<B.length();i++) {
                C += B.substring(1);
                break;
            }

            int add1=Integer.parseInt(A);
            int add2=Integer.parseInt(C);
            switch (o){
                case '+':result=add1+add2;
                bttext.setText(String.valueOf(result));
                break;


                case '-':result=add1-add2;
                    bttext.setText(String.valueOf(result));
                    break;
                case '*':result=add1*add2;
                    bttext.setText(String.valueOf(result));
                    break;
                case '/':result=add1/add2;
                bttext.setText(String.valueOf(result));
                break;
            }


              }






        }



    }
