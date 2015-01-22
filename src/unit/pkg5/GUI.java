package unit.pkg5;

import BreezySwing.*;
import javax.swing.*;

public class GUI extends GBFrame {  
    
	JLabel lblquarters,lblone,lbltwo,lblthree;
	JTextField txtquarters,txtone,txttwo,txtthree,txtnums;
	JButton btnrun;
	int quarters;
	sm one,two,three;
	int num1,num2,num3;
	int totaltimes;

    public GUI() {
    	lblquarters = addLabel("Quarters to start: ",1,1,1,1);
    	txtquarters = addTextField("",1,2,1,1);
    	lblone = addLabel("Times since #1 has paid: ",2,1,1,1);
    	txtone = addTextField("",2,2,1,1);
    	lbltwo = addLabel("Times since #2 has paid: ",3,1,1,1);
    	txttwo = addTextField("",3,2,1,1);
    	lblthree = addLabel("Times since #3 has paid: ",4,1,1,1);
    	txtthree = addTextField("",4,2,1,1);
    	btnrun = addButton("Times until broke",5,1,1,1);
    	txtnums = addTextField("",5,2,1,1);
    	txtnums.setEditable(false);
    }
    
    public void buttonClicked(JButton jb){
    	if(jb==btnrun){
    		run();
    	}
    }
    public void run(){
    	if(txtquarters.getText()==null||txtone.getText()==null||txttwo.getText()==null||txtthree.getText()==null){
    		messageBox("Must enter an amount for each text box.");
    		return;
    	}
    	else if (txtquarters.getText().equals(0)){
    		messageBox("Must enter an amount of quarters greater than zero.");
    		return;
    	}
    	else{
    		quarters = Integer.parseInt(txtquarters.getText());
    		num1 = Integer.parseInt(txtone.getText());
    		num2 = Integer.parseInt(txttwo.getText());
    		num3 = Integer.parseInt(txtthree.getText());
    		one = new sm(num1,30,20);
    		two = new sm(num2,10,9);
    		three = new sm(num3,90,60);
    		while(quarters>=1){
    			one.play(quarters);
    			two.play(quarters);
    			three.play(quarters);
    			if(one.getTurns()<=0){
    				quarters = one.getPayout();
    				one.resetturns(30);
    			}
    			if(two.getTurns()<=0){
    				quarters = two.getPayout();
    				two.resetturns(10);
    			}
    			if(three.getTurns()<=0){
    				quarters = three.getPayout();
    				three.resetturns(90);
    			}
    			//added a second out to see if that was why i cant get out of the loop...
    			if(quarters==0)break;
    		}
    		totaltimes=one.getbroke()+two.getbroke()+three.getbroke();
    		txtnums.setText(""+totaltimes);
    		System.out.println(one.getbroke());
    		System.out.println(two.getbroke());
    		System.out.println(three.getbroke());
    	}
    }
    public static void main(String[] args) {
    	GUI app = new GUI();
    	app.setSize(300,200);
    	app.setVisible(true);
    }
}
