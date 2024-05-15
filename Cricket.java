package ipl;

public class Cricket {
	String batsman="viratkohli";
	static String bowler="bumrah";
	void display() {
		System.out.println("vijay");
	}
	static String display1() {
		return("karthik");
	}

	public static void main(String[] args) {
		
		Cricket bt=new Cricket();
		System.out.println(bt.batsman);
		//System.out.println(bt.display());
		System.out.println(Cricket.bowler);
		System.out.println(Cricket.display1());
			

	}

}
