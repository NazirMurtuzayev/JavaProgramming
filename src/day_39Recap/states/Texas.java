package day_39Recap.states;

public class Texas extends States{


    public Texas( String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super( "Texas",abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    @Override
    public void timeZone(){
        System.out.println(getName()+" use Central time zone ");
    }
}
