package mathTasks;

public class task {
    public static void main(String[] args) {
        int a=7;
        Boolean result = (a++ > ++a &&++a> a++);
        System.out.println( a);
    }
}
