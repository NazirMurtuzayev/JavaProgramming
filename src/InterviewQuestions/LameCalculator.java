package InterviewQuestions;

public class LameCalculator {

    public int a,b;



    public int plus(){
        return a+b;
    }

    public int minus(){
        return a-b;

    }

    public int multiply(){
        return a*b;
    }

    public int divide(){
        return a/b;
    }



    public String toString() {
        return "LameCalculator{" +
                "a=" + a +
                ", b=" + b +
                ", plus="+plus()+
                ", minus="+minus()+
                ", multiply="+multiply()+
                ", divide="+divide()+
                '}';
    }
}


