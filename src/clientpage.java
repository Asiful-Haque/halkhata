
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sourav
 */
//class variableforall{
 //   int flag=0;
//}
class common{                                     ///Parent class
    String name="";                              ///State
    int age=0;
    long contact=0;
    String gender="";
    String address="";
    String religion="";
    String blood="";
    long money=0;
    
    void behaviour1(){                          ///Behaviour
        System.out.println("Its behaviour1");
    }
    void behaviour2(){
        System.out.println("Its behaviour2");
    }
    
    common(String name,int age,long contact,String gender,String address,String religion,String blood,long money){
        this.name=name;
        this.age=age;
        this.contact=contact;
        this.gender=gender;
        this.address=address;
        this.religion=religion;
        this.blood=blood;
        this.money=money;
    }
    
}
class info extends common{            ///Child class
    
    info(String name,int age,long contact,String gender,String address,String religion,String blood,long money){  ///Object will be declared for this....
       
        super(name,age,contact,gender,address,religion,blood,money);
        //calculate ob=new calculate(2500);
     try{
            File f=new File("client1.txt");
            FileWriter fw=new FileWriter(f);
            fw.write(name);
            fw.write("\r\n");
            fw.write(String.valueOf(age));
            fw.write("\r\n");
            fw.write(String.valueOf(contact));
            fw.write("\r\n");
            fw.write(gender);
            fw.write("\r\n");
            fw.write(address);
            fw.write("\r\n");
            fw.write(religion);
            fw.write("\r\n");
            fw.write(blood);
            fw.write("\r\n");
            fw.write(String.valueOf(money));
            fw.write("\r\n");
            
            fw.close();
            
            fileopen ab=new fileopen();//willllllllllllllllllllllllllllllllllllllllllllllllllll
            ab.fileopenmethod(1);
        }
        catch(Exception e){
            System.out.println("Not found");
        }
    }
}

class info2 extends common{          ///Child class 
    
    info2(String name,int age,long contact,String gender,String address,String religion,String blood,long money){  ///Object will be declared for this....
       super(name,age,contact,gender,address,religion,blood,money);
       //calculate ob=new calculate(3000);   
     try{
            File f2=new File("client2.txt");
            FileWriter fw2=new FileWriter(f2);
            fw2.write(name);
            fw2.write("\r\n");
            fw2.write(String.valueOf(age));
            fw2.write("\r\n");
            fw2.write(String.valueOf(contact));
            fw2.write("\r\n");
            fw2.write(gender);
            fw2.write("\r\n");
            fw2.write(address);
            fw2.write("\r\n");
            fw2.write(religion);
            fw2.write("\r\n");
            fw2.write(blood);
            fw2.write("\r\n");
            fw2.write(String.valueOf(money));
            fw2.write("\r\n");
            
            fw2.close();
           
            fileopen ab=new fileopen();//willllllllllllllllllllllllllllllllllllllllllllllllllll
            ab.fileopenmethod(2);
       
        }
        catch(Exception e){
            System.out.println("Not found");
        }
    }
}

class info3 extends common{                     ///Child class
    
    info3(String name,int age,long contact,String gender,String address,String religion,String blood,long money){  ///Object will be declared for this....
       
        super(name,age,contact,gender,address,religion,blood,money);
        //calculate ob=new calculate(1000);   
     try{
            File f3=new File("client3.txt");
            FileWriter fw3=new FileWriter(f3);
            fw3.write(name);
            fw3.write("\r\n");
            fw3.write(String.valueOf(age));
            fw3.write("\r\n");
            fw3.write(String.valueOf(contact));
            fw3.write("\r\n");
            fw3.write(gender);
            fw3.write("\r\n");
            fw3.write(address);
            fw3.write("\r\n");
            fw3.write(religion);
            fw3.write("\r\n");
            fw3.write(blood);
            fw3.write("\r\n");
            fw3.write(String.valueOf(money));
            fw3.write("\r\n");
           
            fw3.close();
           
            fileopen ab=new fileopen();//willllllllllllllllllllllllllllllllllllllllllllllllllll
            ab.fileopenmethod(3);
            
        }
        catch(Exception e){
            System.out.println("Not found");
        }
    }
}

class fileopen{
    static String readfile1="";
    static int readfile2=0;
    static long readfile3=0;
    static String readfile4="";
    static String readfile5="";
    static String readfile6="";
    static String readfile7="";
    static long readfile8=0;
    void fileopenmethod(int value){
    
    if(value==1){
         try{
        File f=new File("client1.txt");
        Scanner input=new Scanner(f);
        
        while(input.hasNext()){
             readfile1=input.nextLine();
             readfile2=Integer.parseInt(input.nextLine());
             readfile3=Long.parseLong(input.nextLine());
             readfile4=input.nextLine();
             readfile5=input.nextLine();
             readfile6=input.nextLine();
             readfile7=input.nextLine();
             readfile8=Long.parseLong(input.nextLine());
        }  
    }
    catch(Exception ex){
        System.out.println("Not found");
    }
        
    }
    
    
    else if(value==2){
        try{
        File f2=new File("client2.txt");
        Scanner input=new Scanner(f2);
        
        while(input.hasNext()){
             readfile1=input.nextLine();
             readfile2=Integer.parseInt(input.nextLine());
             readfile3=Long.parseLong(input.nextLine());
             readfile4=input.nextLine();
             readfile5=input.nextLine();
             readfile6=input.nextLine();
             readfile7=input.nextLine();
             readfile8=Long.parseLong(input.nextLine());
        }  
    }
    catch(Exception ex){
        System.out.println("Not found");
    }
         
    }
    
    
    else if(value==3){
        try{
        File f3=new File("client3.txt");
        Scanner input=new Scanner(f3);
        
        while(input.hasNext()){
             readfile1=input.nextLine();
             readfile2=Integer.parseInt(input.nextLine());
             readfile3=Long.parseLong(input.nextLine());
             readfile4=input.nextLine();
             readfile5=input.nextLine();
             readfile6=input.nextLine();
             readfile7=input.nextLine();
             readfile8=Long.parseLong(input.nextLine());
        }  
    }
    catch(Exception ex){
        System.out.println("Not found");
    }
        
    }
    }
            
}

public class clientpage extends javax.swing.JFrame {

    /**
     * Creates new form clientpage
     */
    public clientpage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textpro = new javax.swing.JTextField();
        textpro1 = new javax.swing.JTextField();
        textpro2 = new javax.swing.JTextField();
        textpro3 = new javax.swing.JTextField();
        textpro4 = new javax.swing.JTextField();
        textpro5 = new javax.swing.JTextField();
        textpro6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("/home/sourav/Downloads/resize-16285770134959435495f7188ba24e28d3bcd854b29ccdeab4d.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 360, 150));

        jLabel1.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Blood group");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 90, 20));

        jLabel2.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 20));

        jLabel3.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Age");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, 20));

        jLabel4.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contact");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, 20));

        jLabel5.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gender");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 80, 20));

        jLabel6.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 80, 20));

        jLabel7.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Religion");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 80, 20));

        textpro.setEditable(false);
        textpro.setBackground(new java.awt.Color(0, 0, 0));
        textpro.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        textpro.setForeground(new java.awt.Color(255, 255, 255));
        textpro.setBorder(null);
        textpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textproActionPerformed(evt);
            }
        });
        jPanel2.add(textpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 220, 30));

        textpro1.setEditable(false);
        textpro1.setBackground(new java.awt.Color(0, 0, 0));
        textpro1.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        textpro1.setForeground(new java.awt.Color(255, 255, 255));
        textpro1.setBorder(null);
        textpro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpro1ActionPerformed(evt);
            }
        });
        jPanel2.add(textpro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 220, 30));

        textpro2.setEditable(false);
        textpro2.setBackground(new java.awt.Color(0, 0, 0));
        textpro2.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        textpro2.setForeground(new java.awt.Color(255, 255, 255));
        textpro2.setBorder(null);
        textpro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpro2ActionPerformed(evt);
            }
        });
        jPanel2.add(textpro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 220, 30));

        textpro3.setEditable(false);
        textpro3.setBackground(new java.awt.Color(0, 0, 0));
        textpro3.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        textpro3.setForeground(new java.awt.Color(255, 255, 255));
        textpro3.setBorder(null);
        textpro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpro3ActionPerformed(evt);
            }
        });
        jPanel2.add(textpro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 220, 30));

        textpro4.setEditable(false);
        textpro4.setBackground(new java.awt.Color(0, 0, 0));
        textpro4.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        textpro4.setForeground(new java.awt.Color(255, 255, 255));
        textpro4.setBorder(null);
        textpro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpro4ActionPerformed(evt);
            }
        });
        jPanel2.add(textpro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 220, 30));

        textpro5.setEditable(false);
        textpro5.setBackground(new java.awt.Color(0, 0, 0));
        textpro5.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        textpro5.setForeground(new java.awt.Color(255, 255, 255));
        textpro5.setBorder(null);
        textpro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpro5ActionPerformed(evt);
            }
        });
        jPanel2.add(textpro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 220, 30));

        textpro6.setEditable(false);
        textpro6.setBackground(new java.awt.Color(0, 0, 0));
        textpro6.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        textpro6.setForeground(new java.awt.Color(255, 255, 255));
        textpro6.setBorder(null);
        textpro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpro6ActionPerformed(evt);
            }
        });
        jPanel2.add(textpro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 220, 30));

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon("/home/sourav/Downloads/back.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jButton6.setBackground(new java.awt.Color(0, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon("/home/sourav/Downloads/Close.png")); // NOI18N
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 40));

        jButton5.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jButton5.setText("See Information");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 550));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pay");
        jLabel9.setBorder(null);
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, 40));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Due Money");
        jLabel10.setBorder(null);
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 34, 140, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Done");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 260, 190));

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/sourav/Downloads/3d08e03cb40252526fee2036a67f07f1.gif")); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 330));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(null);
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setToolTipText("");
        jPanel4.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 470, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(null);
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setToolTipText("");
        jPanel5.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Transaction  List");
        jLabel12.setPreferredSize(new java.awt.Dimension(239, 35));
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 5, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 470, 50));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(null);
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.setToolTipText("");
        jPanel6.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 470, 30));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(null);
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.setToolTipText("");
        jPanel7.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 470, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Add New");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 396, 90, 30));
        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 90, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 510, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textproActionPerformed

    private void textpro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpro2ActionPerformed

    private void textpro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpro3ActionPerformed

    private void textpro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpro4ActionPerformed

    private void textpro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpro5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpro5ActionPerformed

    private void textpro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpro6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpro6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textpro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpro1ActionPerformed
       
    }//GEN-LAST:event_textpro1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         fileopen ob=new fileopen(); 
        textpro1.setText(fileopen.readfile1);
        textpro2.setText(String.valueOf(fileopen.readfile2));
        textpro3.setText(String.valueOf("0"+(fileopen.readfile3)));
        textpro4.setText(fileopen.readfile4);
        textpro5.setText(fileopen.readfile5);
        textpro6.setText(fileopen.readfile6);
        textpro.setText(fileopen.readfile7);
        jTextField2.setText(String.valueOf(fileopen.readfile8));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Dash ob=new Dash();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clientpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField textpro;
    private javax.swing.JTextField textpro1;
    private javax.swing.JTextField textpro2;
    private javax.swing.JTextField textpro3;
    private javax.swing.JTextField textpro4;
    private javax.swing.JTextField textpro5;
    private javax.swing.JTextField textpro6;
    // End of variables declaration//GEN-END:variables
}
