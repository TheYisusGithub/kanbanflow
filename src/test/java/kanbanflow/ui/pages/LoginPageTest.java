//package kanbanflow.ui.pages;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import core.selenium.WebDriverManager;
//
//public class LoginPageTest {
//    LoginPage loginPage;
//    PageTransporter pageTransporter;
//    @Before
//    public void setUp() {
//        pageTransporter = new PageTransporter();
//    }
//
//    @After
//    public void tearDown() {
//        WebDriverManager.getInstance().getDriver().quit();
//    }
//
//    @Test
//    public void signIn() {
//        loginPage = pageTransporter.goToLoginPage();
//        loginPage.signIn("jesus.menacho@fundacion-jala.org", "lapizx123");
//    }
//}
