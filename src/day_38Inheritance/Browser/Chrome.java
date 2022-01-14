package day_38Inheritance.Browser;

import day_38Inheritance.Browser.Browser;

public class Chrome extends Browser {


    @Override
    public void openBrowser(){

        System.out.println("opening chrome browser");

    }

    @Override
    public void  closeBrowser(){
        System.out.println("closing chrome browser");
    }


}
/*
ChromeBrowser
					methods:
						openBrowser(): prints "opening chrome browser"
						closeBrowser():  prints "closing chrome browser"


 */
