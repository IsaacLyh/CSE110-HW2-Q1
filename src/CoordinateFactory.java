

public class CoordinateFactory {
	public Coordinate createCoordinate(String input,double[] pos){
		if(input.equals("1D") && pos.length == 1){
			return new Coordinate1D(pos);
		}
		else if(input.equals("2D") && pos.length == 2){
			return new Coordinate2D(pos);
		}
		else if(input.equals("3D") && pos.length == 3){
			return new Coordinate3D(pos);
		}
		return null;
	}
	
	public Coordinate createCoordinate(String input){
		if(input.equals("1D")){
			return new Coordinate1D();
		}
		else if(input.equals("2D")){
			return new Coordinate2D();
		}
		else if(input.equals("3D")){
			return new Coordinate3D();
		}
		return null;
	}
	

}
