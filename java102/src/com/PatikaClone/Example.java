package com.PatikaClone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame{
    private JPanel wrapper;
    private JPanel wTop;
    private JTextField fld_username;
    private JPasswordField fld_password;
    private JButton btn_login;

    public Example(){
        // Yüklü olan temalar
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){

            System.out.println(info.getName() + " => " + info.getClassName());

            if("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        }
        
        
        
        setContentPane(wrapper);  //panelimizi ekledik.
//        add(wrapper);
        setSize(400,400); //pencereyi boyutlandırdık.
        setTitle("Uygulama Ekranı");  //başlık ekledik.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //pencerenin kapatma işareti ile uygulamanın durmasını sağlar.
        setResizable(false);  //Yeniden boyutlandırmayı kapatır default olarak true'dur.
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width)/ 2;  // Yatayda orta noktayı bulmayı sağlar.
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height)/ 2;  // Dikeyde orta noktayı bulmayı sağlar.
        setLocation(x,y);
        setVisible(true); //ekranın görünmesini söyledik.
        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*System.out.println("butona tıklandı");
                System.out.println(fld_username.getText());*/
                if(fld_password.getText().length() ==0 || fld_username.getText().length() == 0){
                    JOptionPane.showMessageDialog(null,"Tüm alanları doldurunuz.","Uyarı",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

}
