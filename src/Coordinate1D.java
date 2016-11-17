import java.util.Random;


public class Coordinate1D implements Coordinate{
	public String Label = "";
	public double pos[]={0};
	
	public Coordinate1D(double pos[]){
		this.pos = pos;
	}
	public Coordinate1D(){
		Random a = new Random();
		pos[0] = a.nextInt();
	}
	
	public double distance(Object input) {
		if(input.getClass().equals(Coordinate1D.class)){
			return (double)Math.abs(((Coordinate1D)input).pos[0] - this.pos[0]);
		}
		return (double)-1;
	}

	public void label(String input) {
		this.Label = input;
	}

	public String getLabel() {
		return this.Label;
	}
	
	public String toString(){
		return "1D Coordinate at : "+"{"+pos[0]+"}"+" Label = "+Label;
	}
	
}
