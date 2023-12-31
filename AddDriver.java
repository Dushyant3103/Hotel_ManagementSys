
package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddDriver extends JFrame  implements ActionListener{
    JButton add, cancel;
    JTextField tfname, tfage,tfcompany, tfmodel,tflocation;
    JComboBox typecombo, availablecombo, agecombo;
    
    AddDriver(){
        
        getContentPane().setBackground(Color.WHITE);
    
        setLayout(null);
        
        JLabel heading = new JLabel("Add Drivers");
        heading.setFont(new Font("Tahoma", Font.BOLD, 18) );
        heading.setBounds(150,10,200,20);
        add(heading);
        
        
        JLabel lblroomno = new JLabel("Name");
        lblroomno.setFont(new Font("Tahoma", Font.PLAIN, 16) );
        lblroomno.setBounds(60,70,120,20);
        add(lblroomno);
        
        tfname  = new JTextField();
        tfname.setBounds(200,70,150,30);
        add(tfname);
        
        
        JLabel lblavailable = new JLabel("Age");
        lblavailable.setFont(new Font("Tahoma", Font.PLAIN, 16) );
        lblavailable.setBounds(60,110,150,30);
        add(lblavailable );
        
        tfage  = new JTextField();
        tfage.setBounds(200,110,150,30);
        add(tfage);
        
      
        
        
        
        JLabel lblclean= new JLabel("Gender");
        lblclean.setFont(new Font("Tahoma", Font.PLAIN, 16) );
        lblclean.setBounds(60,150,120,30);
        add(lblclean);
        
        String cleanOptions []={"Male", "Female"};
        agecombo =  new JComboBox(cleanOptions);
        agecombo.setBounds(200,150,150,30);
        agecombo.setBackground(Color.WHITE);
        add(agecombo);
        
        
        JLabel lblprice = new JLabel("Car Company");
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16) );
        lblprice.setBounds(60,190,120,30);
        add(lblprice );
        
        
        
        tfcompany = new JTextField();
        tfcompany.setBounds(200,190,150,30);
        add(tfcompany);
        
        
        JLabel   lbltype  = new JLabel("Car-Model");
        lbltype.setFont(new Font("Tahoma", Font.PLAIN, 16) );
        lbltype.setBounds(60,230,120,30);
        add(lbltype);
        
        tfmodel = new JTextField();
        tfmodel.setBounds(200,230,150,30);
        add(tfmodel);
        
        
         JLabel lbhavailable= new JLabel("Available");
        lbhavailable.setFont(new Font("Tahoma", Font.PLAIN, 16) );
        lbhavailable.setBounds(60,270,150,30);
        add(lbhavailable);
        
        String availableOptions []={"Available", "Busy"};
        availablecombo =  new JComboBox(availableOptions);
        availablecombo.setBounds(200,270,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
        
        
        
        JLabel lblocation  = new JLabel("Location");
        lblocation.setFont(new Font("Tahoma", Font.PLAIN, 16) );
        lblocation.setBounds(60,310,150,30);
        add(lblocation);
        
        tflocation = new JTextField();
        tflocation.setBounds(200,310,150,30);
        add(tflocation);
        
        
        add = new JButton("Add");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(60,370,130,30);
        add.addActionListener(this);
        add(add);
        
        
        
        cancel = new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(220,370,130,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,30,500,300);
        add(image);
        
        setBounds(300,200,980,470);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== add){
    String name= tfname.getText();
    String age = tfage.getText();
    String gender =(String) agecombo.getSelectedItem();
    String company= tfcompany.getText();
    String brand = tfmodel.getText();
    String available =(String) availablecombo.getSelectedItem();
    String location = tflocation.getText();
//    String st = (String) cleancombo.getSelectedItem();
//    String price = tfprice.getText();
//    String type = (String) typecombo.getSelectedItem();
    
    try{
        Conn conn = new Conn();
        String str ="insert into driver values('"+name+"', '"+age+"', '"+gender+"', '"+company+"' ,'"+brand+"','"+available+"','"+location+"' )";
        conn.s.executeUpdate(str);
        
        
        JOptionPane.showMessageDialog(null," New Driver Added Successfully");
        
        setVisible(false);
    }
    
    catch(Exception e)
    {
        e.printStackTrace();
    
    }
    
    }
    else
    {
        setVisible(false);
    }
    }
    
    public static void main(String[] args){
        new AddDriver();
    
    }
    
}