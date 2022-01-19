package day_39Recap.states;

public class Florida extends States {
    public Florida( String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super("Florida", abbreviation, politicalParty, governor, senator, population, stateTax);
    }
    @Override
    public void timeZone(){
        System.out.println(getName()+" use Eastern time zone ");
    }
}
