import java.util.*;
public class Bottle {
	public static final int MAX = 250;
	public static final int MIN = 0;
	private int marbles;
	
	public Bottle(int x){
		x = this.marbles;
	}
	
	public Bottle(){
		
	}
	
	public void read(){
		Scanner kybd = new Scanner(System.in);
		marbles = kybd.nextInt();
		if(marbles > MAX || marbles < MIN){
			System.out.println("Cannont exceed more than 250 or be less than 1 marbles: "); 
			System.exit(0);
		}
	}
	
	public void setMarbles(int newMarbles){
		this.marbles = newMarbles;
		if(newMarbles < MIN || newMarbles > MAX){
			System.out.println("\nThe changed value of the New Bottle cannot exceed 10 or be below 1:");
		}
	}
	
	public int getMarbles(){
		return marbles;
	}
	
	public Bottle get(){
		Bottle answer = new Bottle();
		answer.marbles = this.marbles;
		return answer;
	}
	
	
	public Bottle add(Bottle other){
		Bottle answer = new Bottle();
		answer.marbles = this.marbles + other.marbles;
		if(answer.marbles > MAX){
			System.out.println("Invalid addition of two separate bottles: ");
			System.exit(0);
		}	
			return answer;
	}
	
 	public Bottle add(int value){
		Bottle answer = new Bottle();
		answer.marbles = this.marbles + value;
		if(answer.marbles > MAX){
			System.out.println("Invalid addition of marbles within a single bottle: ");
			System.exit(0);
		}	
			return answer;
	}
	
	public Bottle subtract(int value){
		Bottle answer = new Bottle();
		answer.marbles = this.marbles - value;
		if(answer.marbles < MIN){
			System.out.println("Invalid subtraction of marbles within a single bottle: ");
			System.exit(0);
		}	
			return answer;
	}
	
	public Bottle multiply(int value){
		Bottle answer = new Bottle();
		answer.marbles = this.marbles * value;
		if(answer.marbles > MAX){
			System.out.println("Invalid multiplication of marbles within a single bottle: ");
			System.exit(0);
		}	
			return answer;
	}
	
	public Bottle divide(int value){
		Bottle answer = new Bottle();
		answer.marbles = this.marbles / value;
		if(answer.marbles < MIN){
			System.out.println("Invalid division of marbles within a single bottle: ");
			System.exit(0);
		}
			return answer;
	}
	
	public Bottle mutliply(Bottle other){
		Bottle answer = new Bottle();
		answer.marbles = this.marbles * other.marbles;
		if(this.marbles > MAX ){
			System.out.println("Invalid multiplication of two separate bottles: ");
			System.exit(0);
		}	
			return answer;
	}
	public Bottle subtract(Bottle other){
		Bottle answer = new Bottle();
		answer.marbles = this.marbles - other.marbles;
		if(this.marbles < MIN){
			System.out.println("Invalid subtraction of two separate bottles: ");
			System.exit(0);
		}	
			return answer;
	}
	
	public Bottle divide(Bottle other){
		Bottle answer = new Bottle();
		answer.marbles = this.marbles / other.marbles;
		if(this.marbles < MIN){
			System.out.println("Invalid division of two separate bottles: ");
			System.exit(0);
		}	
			return answer;
	}
	
	public Bottle set(Bottle other){
		Bottle answer = new Bottle();
		answer.marbles = other.marbles;
		this.marbles = other.marbles;
		return this;
	}
	
	public String toString(){
		return "" + this.marbles;
	}
	
	public boolean equals(Bottle other){
		if (this == other) {
			return true;
		}
		else {
			return false;
		}	
	}
}
