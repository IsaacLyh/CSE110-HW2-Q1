

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
	//test For Dist
	System.out.println(output1.distance(output2) + " 1D and 1D");
	try{
		System.out.println(output1.distance(output3)+" 1d and 2D");
	}
	catch(IllegalArgumentException e){
		System.out.println("IllegalArgument -- Type");
	}
	
	System.out.println(output3.distance(output4)+" 2D and 2D");
	
	try{
		System.out.println(output3.distance(output5) + "2D and 3D");
	}
	catch(IllegalArgumentException e){
		System.out.println("IllegalArgument -- Type");
	}
	System.out.println(output5.distance(output6) + " 3D and 3D");
	}
	
}
