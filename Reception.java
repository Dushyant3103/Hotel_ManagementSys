
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Reception  extends JFrame implements ActionListener {
    
    JButton newCustomer ,rooms, department,allempolyee,  manager, customer,    searchroom,update, roomStatus;
    Reception(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(  newCustomer);
        
        
            
        rooms = new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add( rooms );
        
        
             
        department = new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add( department );
        
        
        allempolyee = new JButton("All Empolyee");
        allempolyee.setBounds(10,150,200,30);
        allempolyee.setBackground(Color.BLACK);
        allempolyee.setForeground(Color.WHITE);
        allempolyee.addActionListener(this);
        add( allempolyee );
        
        
        customer = new JButton("All Customer");
        customer.setBounds(10,190,200,30);
        customer.setBackground(Color.BLACK);
        customer.setForeground(Color.WHITE);
        customer.addActionListener(this);
        add(  customer  );
        
        
        
          
        manager = new JButton("Manager Info");
        manager.setBounds(10,230,200,30);
        manager.setBackground(Color.BLACK);
        manager.setForeground(Color.WHITE);
        manager.addActionListener(this);
        add(  manager  );
        
        
          
        JButton  checkout = new JButton("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        add(  checkout );
        
        
        
        update = new JButton("Update Status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(  update );
        
        
        roomStatus = new JButton("Update Room Status");
        roomStatus.setBounds(10,350,200,30);
        roomStatus.setBackground(Color.BLACK);
        roomStatus.setForeground(Color.WHITE);
        roomStatus.addActionListener(this);
        add(  roomStatus );
        
        
        
        
        
        
        
        
       JButton  pickup = new JButton("Pick Up Service");
       pickup.setBounds(10,390,200,30);
       pickup.setBackground(Color.BLACK);
       pickup.setForeground(Color.WHITE);
       add(  pickup );


        
       searchroom = new JButton("Search  Room");
       searchroom.setBounds(10,350,200,30);
       searchroom.setBackground(Color.BLACK);
       searchroom.setForeground(Color.WHITE);
       searchroom.addActionListener(this);
        add(  searchroom );
        
        
        
        
        JButton  logout = new JButton("logout");
        logout.setBounds(10,390,200,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        add(  logout );
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250,30,500,470);
        add(image);
        
        
        
//        
//        setBounds(350,200,800,570);
        setBounds(350,200,850,500);
        setVisible(true);
    
  
 


    }
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == newCustomer){
        setVisible(false);
         new AddCustomers();
    }else if(ae.getSource()==rooms){
    setVisible(false);
    new Room();}
    
    else if(ae.getSource()==department){
    setVisible(false);
    new Department();}
    
     else if(ae.getSource()==allempolyee){
    setVisible(false);
    new EmployeeInfo();}
    
    
     else if(ae.getSource()==  manager){
    setVisible(false);
    new ManagerInfo();}
    
     else if(ae.getSource()==  customer){
    setVisible(false);
    new CustomerInfo();}
    
     else if(ae.getSource()==  searchroom){
    setVisible(false);
    new SearchRoom();}
    
    else if(ae.getSource()==  update){
    setVisible(false);
    new UpdateCheck();}
    
    
      else if(ae.getSource()== roomStatus){
    setVisible(false);
    new UpdateRoom();}
    }
    
    
    
    public static void main(String[] args){
    
    new Reception();}
    
}
