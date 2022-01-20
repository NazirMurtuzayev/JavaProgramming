package utilities;

import day_40FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

        //System.out.println(AccessModifier_Test4.name1); default is not visible outside the package
        System.out.println(AccessModifier_Test4.name2);// protected is visible outside the package in subclass only

    }
}
