package day_38Inheritance.Browser;

import day_38Inheritance.Browser.Browser;

public class Firefox extends Browser {


    @Override
    public void openBrowser(){

        System.out.println("opening firefox browser");

    }

   @Override
    public void  closeBrowser(){
        System.out.println("closing firefox browser");
    }
}
/*
2. FireFox extends Browser
					methods:
						openBrowser(): prints "opening firefox browser"
						closeBrowser(): prints "closing fire fox browser"
 */
