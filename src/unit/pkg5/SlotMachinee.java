package unit.pkg5;

public class SlotMachinee {
	private int numturns;
	private int payout,totalnumturns;
	private int times=0;
	public SlotMachinee(int totalnumturns, int numturns, int payout){
		this.totalnumturns = totalnumturns;
		this.numturns = numturns;
		this.payout = payout;
	}
	public int play(int q){
		numturns--;
		times+=1;
		return q--;
	}
	public void resetturns(int x){
		numturns = x;
	}
	public int getTurns(){
		return numturns;
	}
	public int getPayout(){
		return payout;
	}
	public int getbroke(){
		return times;
	}
}
