package day_39Recap.states;

public class California extends States {

    public California( String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super("California", abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    @Override
    public void timeZone(){
        System.out.println(getName()+" use Pacific time zone ");
    }
}
