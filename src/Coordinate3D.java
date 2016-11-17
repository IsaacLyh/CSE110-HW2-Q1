import java.util.Random;


public class Coordinate3D implements Coordinate {
	public String Label = "";
	public double pos[] = {0,0,0};
	
	public Coordinate3D(double pos[]){
		this.pos = pos;
	}
	public Coordinate3D(){
		Random a = new Random();
		pos[0] = a.nextInt();
		pos[1] = a.nextInt();
		pos[2] = a.nextInt();
	}
	
	public double distance(Object input) {
		if(input.getClass().equals(Coordinate3D.class)){
			return Math.sqrt(
					(((Coordinate3D)input).pos[0]-this.pos[0])*(((Coordinate3D)input).pos[0]-this.pos[0])+
					(((Coordinate3D)input).pos[1]-this.pos[1])*(((Coordinate3D)input).pos[1]-this.pos[1])+
					(((Coordinate3D)input).pos[2]-this.pos[2])*(((Coordinate3D)input).pos[2]-this.pos[2])
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
		return "3D Coordinate at : "+"{"+pos[0]+","+pos[1]+","+pos[2]+"}"+" Label = "+Label;
	}
	
	
}
