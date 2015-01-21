package unit.pkg5;


public class SlotMachine {
    int payoutcycle, payoutamount, timetillnextpay;
    public int money=25;
    int payout;
    public SlotMachine ( int pc, int pa, int ttnp){
        payoutcycle = pc;
        payoutamount = pa;
        timetillnextpay = ttnp;
        
    }
    public boolean run(){
        timetillnextpay++;
        if (timetillnextpay==payoutcycle){
            timetillnextpay=0;
            payout = payoutamount;
            return true;
        }
        else{
            return false;
        }
    }
    public int Payout(){
       
        return payout;
    }
    public String toString(){
        return "Slot machine toString";
    }

}
