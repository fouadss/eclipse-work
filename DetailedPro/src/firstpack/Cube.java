package firstpack;

public class Cube {

	
	
	int length;
	int width;
	int bredth;

	
public int getcubeVolume() {
	
	return(length*width*bredth);
}
	
	Cube(){
		
		length=10;
		width=20;
		bredth=30;
		System.out.println("we are creating constructor");
	}
	
	

}
