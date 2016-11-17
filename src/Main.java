

public class Main {
	
	public static void main(String args[]){
	CoordinateFactory a = new CoordinateFactory();
	double pos2[]={3};
	double pos3[]={1,2};
	double pos[] = {1,2,3};
	//Factory Test
	Coordinate output1 = a.createCoordinate("1D");
	Coordinate output2 = a.createCoordinate("1D",pos2);
	Coordinate output3 = a.createCoordinate("2D");
	Coordinate output4 = a.createCoordinate("2D",pos3);
	Coordinate output5 = a.createCoordinate("3D");
	Coordinate output6 = a.createCoordinate("3D",pos);
	//Test for labeling
	output1.label("1D Random");
	output2.label("1D Given Pos");
	output3.label("2D Random");
	output4.label("2D Given Pos");
	output5.label("3D Random");
	output6.label("3D Given Pos");
	//Test toString
	System.out.println(output1.toString());
	System.out.println(output2.toString());
	System.out.println(output3.toString());
	System.out.println(output4.toString());
	System.out.println(output5.toString());
	System.out.println(output6.toString());
	//
	
	}
	
}
