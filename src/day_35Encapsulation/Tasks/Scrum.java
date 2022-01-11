package day_35Encapsulation.Tasks;

import day_31Constructor.scrumTask.Developer;
import day_31Constructor.scrumTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Scrum {


    private String PO, BA, SM;

    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developer> devopsList = new ArrayList<>();

    private int daysOfSprint;


    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTestersList() {
        return testersList;
    }

    public void setTestersList(ArrayList<Tester> testersList) {
        this.testersList = testersList;
    }

    public ArrayList<Developer> getDevopsList() {
        return devopsList;
    }

    public void setDevopsList(ArrayList<Developer> devopsList) {
        this.devopsList = devopsList;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        this.daysOfSprint = daysOfSprint;
    }
    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll( Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testersList.removeIf( p-> p.employeeID==employeeID);
    }
    public void removeDeveloper(int employeeID){
        devopsList.removeIf(p-> p.employeeID==employeeID); //if it is matching
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList +
                ", total number of developers=" + devopsList +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
/*


Attributes:
        String PO, BA, SM;
        ArrayList<Tester> testersList = new ArrayList<>();
        ArrayList<Developer> devopsList = new ArrayList<>();
        int daysOfSprint;

        Add A constructor that can set the fileds PO, BA, and SM

        Actions:
        addTester(Tester tester): adds the given tester to the testers ArrayList

        addTesters(Tester[] testers): adds the given testers to the testers ArrayList

        addDeveloper(Developer developer): adds the given developer to the developers ArrayList

        addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

        removeTester(long employeeID): removes the given tester from the testers ArrayList

        removeDeveloper(long employeeID): removes the developer from the developers ArrayList

        toString(): prints number of tester,& developers,  PO name, SM name, BA name





4. ScrumTeam Task:
    re-do the Scrum task by making all the fields private in each custom classes


    Encapsulate all the field
        (salary cannot be set to negative)
        (employeeId cannot be set to negative or zero)

    Avoid any duplicated code fragments in each class

 */