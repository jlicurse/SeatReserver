public class Airplane {
    private Seat [] seats;
	private int MaxCoach;
	private int MaxFirstClass;

	public Airplane(int numSeats) {
		//Split total number of seats to 60% coach, 40% first class
		double numSeatsFC = numSeats * .4;
		double numSeatsC = numSeats * .6;
        seats = new Seat[numSeats];

        //assign max seats
        MaxCoach = (int) numSeatsC;
        MaxFirstClass = (int) numSeatsFC;



		//increasing coach slightly if there are still empty seats with the 60/40 split resulting in a non-full number
		while (!(numSeats >= numSeatsFC + numSeatsC)) {
			numSeatsC++;
		}

}

public int remainingCapacityCoach(){
    int res = MaxCoach;
    for(int i = 0; i < seats.length; i++){
        Seat s = this.seats[i];
        if(s.getStatus().equals("Taken")){
            res--;
        }
    }
    return res;
}


public int remainingCapacityFirstClass(){
    int res = MaxFirstClass;
    for(int i = res; i < seats.length; i++){
        Seat s = this.seats[i];
        if( s.getStatus().equals("Taken")){
            res--;

        }
    }
    return res;
}


public void reserveFirstClassSeat(){
    for(int i = 0; i < seats.length; i++){
        Seat s = this.seats[i];
        if(s.getStatus().equals("Empty")){
            s.reserveSeat();
            break;
        }
    }
}


public void reserveCoachSeat(){
    for(int i = 0; i < seats.length; i++){
        if(seats[i].getStatus().equals("Empty")){
            seats[i].reserveSeat();
            break;
        }
    }
}


String cancelSeat(int seatNum){
    Seat s = seats[seatNum];
    String cabin = new String(s.getCabin());
    if(s.getStatus().equals("Taken")){
        s.cancelReservation();
        return "Seat " + seatNum + " in " + cabin +  " has been cancelled.";
    }
    else{
        return "Seat " + seatNum + " in " + cabin + " is already empty.";
    }
}


public String toString() {
    String str = new String(" ");
    str += "First Class Seats: " + MaxFirstClass + "\n" + "Coach Seats: " + MaxCoach;

    return str;
}
}

