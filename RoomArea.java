class Room{
	float length;
	float width;
	
	float getData(float a, float b){
		length = a;
		width = b;
		float area=length*width;
		return area;
	}
}

class RoomArea{
	public static void main (String args[]){
		Room r1 = new Room();
		float x=r1.getData(12, 14);
		System.out.println(x);
		
		
	}
}