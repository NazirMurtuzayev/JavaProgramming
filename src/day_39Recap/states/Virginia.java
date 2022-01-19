package day_39Recap.states;

public class Virginia extends States {

    public Virginia( String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super("Virginia", abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void timeZone(){
        System.out.println(getName()+" use Eastern time zone ");
    }
}
