




public class AirlineRes {
    public static void main( String[] args){

        Airplane plane = new Airplane(23);
        System.out.println(plane.toString());

        plane.reserveCoachSeat();
        System.out.println(plane.toString());
        System.out.println(plane.remainingCapacityCoach());

    }
    
}
