package day_39Recap.states;

public class StatesObject {

    public static void main(String[] args) {

        Virginia va=new Virginia("VA","Republican Party","Glenn Younkin","Mark Warner and Tim Kaine",8_660000,5.3);
        va.timeZone();
        System.out.println(va);

        Texas tx=new Texas("TX","Republican Party","Greg Abbott","Ted Cruz and John Cornyn",29_947238,6.25);
        tx.timeZone();
        System.out.println(tx);

        California ca=new California("CA","Democratic Party","Gavin Newsom","Alex Padilla and Dianne Feinstein",38_900000,12.3);
        ca.timeZone();
        System.out.println(ca);

        Florida fl=new Florida("FL","Republican Party","Ron DeSantis","Rick Scott and Marco Rubio",21_781128,6.0);
        fl.timeZone();
        System.out.println(fl);

    }
}
