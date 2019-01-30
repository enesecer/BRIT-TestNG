package utilities;

import pages.HomePage;
import pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;


    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }



    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }



}
