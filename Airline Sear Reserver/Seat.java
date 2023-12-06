public class Seat {

	private int seatNum;
	private String cabin;
	private boolean status;
	
	
	public Seat (int num, String type) {
		seatNum = num;
		cabin = type;
		status = false;
		
	}
	
	public int getSeatNum() {
		return seatNum + 1;
	}
	
	
	public String getCabin() {
		return cabin;
	}
	
	
	public String getStatus() {
		if (this.status == true)
			return "Taken";
			else 
				return "Empty";
	}
	
	
	public void reserveSeat() {
		this.status = true;
	}
	
	
	public void cancelReservation() {
		if (this.status = true)
			this.status = false;
		
	}
	
	
	public String toString() {
		String str = new String("");
		
		str += "Seat Number: " + seatNum  + "\n"
				+ "Cabin: " + cabin + "\n" + 
				"Status: " + this.getStatus();
		
		return str;
	}
}
