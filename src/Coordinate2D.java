import java.util.Random;


public class Coordinate2D implements Coordinate{
	public String Label = "";
	public double pos[] = {0,0};
	
	public Coordinate2D(double pos[]){
		this.pos = pos;
	}
	public Coordinate2D(){
		Random a = new Random();
		pos[0] = a.nextInt();
		pos[1] = a.nextInt();
	}
	
	public double distance(Object input) {
		if(input.getClass().equals(Coordinate2D.class)){
			return Math.sqrt(
					(((Coordinate2D)input).pos[0]-this.pos[0])*(((Coordinate2D)input).pos[0]-this.pos[0])+
					(((Coordinate2D)input).pos[1]-this.pos[1])*(((Coordinate2D)input).pos[1]-this.pos[1])
					);
		}
		else{
			throw new IllegalArgumentException();
		}
	}

	public void label(String input) {
		this.Label = input;
	}

	public String getLabel() {
		return this.Label;
	}
	
	public String toString(){
		return "2D Coordinate at : "+"{"+pos[0]+","+pos[1]+"}"+" Label = "+Label;
	}
	
}
