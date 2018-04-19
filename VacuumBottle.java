import java.util.*;
public class VacuumBottle extends Bottle{
    private Temperature temp;
    static Scanner kybd = new Scanner(System.in);
    
    
    public VacuumBottle(Bottle x, Temperature temp){
       this.setMarbles(x.getMarbles());
       temp = new Temperature();
       
    }
    
    public VacuumBottle(int x, double degree, char scale){
        this.setMarbles(x);
        temp = new Temperature(degree, scale);
        
     }
    
    public VacuumBottle(){
    	
    }
    
    public VacuumBottle set(Bottle joy, Temperature forecast){
    	VacuumBottle big = new VacuumBottle(joy, forecast);
    	return big;
    }
    
    public VacuumBottle multiply(VacuumBottle other){
        VacuumBottle answer = new VacuumBottle();
        answer.set(super.multiply(other.getMarbles()));
        answer.temp = this.temp.multiply(other.temp);
    	/*Vacuum answer = new Vacuum();
        answer.units = this.units * other.units;
        answer.weather = this.weather * other.weather;
        answer.measurement = other.measurement;*/
        
        if(answer.getMarbles() > MAX){
                System.out.println("Invalid multiplication of marbles within a single bottle: ");
                System.exit(0);
            }	
		return answer;
    }
    
    public VacuumBottle subtract(VacuumBottle other){
        VacuumBottle answer = new VacuumBottle();
        answer.set(super.subtract(other.getMarbles()));
        answer.temp = this.temp.subtract(other.temp);
    	/*Vacuum answer = new Vacuum();
        answer.units = this.units - other.units;
        answer.weather = this.weather - other.weather;
        answer.measurement = other.measurement;*/
        
        
        if(answer.getMarbles() < MIN){
            System.out.println("Invalid subtraction of units within a single bottle");
            System.exit(0);
        }
            return answer;
    }
    
    public VacuumBottle add(VacuumBottle other){
    	VacuumBottle answer = new VacuumBottle();
    	answer.set(super.add(other.getMarbles()));
    	answer.temp = this.temp.add(other.temp);
    	
    	if(answer.getMarbles() > MAX){
    		System.out.println("Invalid addition of units within a single bottle");
    		System.exit(0);
    	}
    		return answer;
    }
    
    
    public VacuumBottle toFahrenheit(){
    	VacuumBottle answer = new VacuumBottle();
    	answer.setMarbles(this.getMarbles());
    	answer.temp = this.temp.toFahrenheit();
    	return answer;
    }
    
    public VacuumBottle toCelcius(){
    	VacuumBottle answer = new VacuumBottle();
    	answer.setMarbles(this.getMarbles());
    	answer.temp = this.temp.toCelsius();
    	return answer;
    }
    
    public VacuumBottle toKelvin(){
    	VacuumBottle answer = new VacuumBottle();
    	answer.setMarbles(this.getMarbles());
    	answer.temp = this.temp.toKelvin();
    	return answer;
    	
    }
    
    
    
    public VacuumBottle greatherThan(VacuumBottle other){
    	VacuumBottle answer = new VacuumBottle();
    	if(answer.getMarbles() > other.getMarbles()){
    		return answer;
    	}
    	else
    		return other;
    }
    
    public boolean equals(VacuumBottle other){
    	VacuumBottle answer = new VacuumBottle();
    	answer.temp = other.temp;
    	answer.equals(other);
    	return true;
    }
    
    public VacuumBottle divideBy(int v){
    	VacuumBottle answer = new VacuumBottle();
    	super.divide(v);
    	
    	if(answer.getMarbles() < MIN){
    		System.out.println("Invalid division of units within a single bottle: ");
    		System.exit(0);
    	}
    		return answer;
    	
    }	
    public String toString(){
    	return "" + this.getMarbles();
    }
    
    
    
    
}
