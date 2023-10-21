public class LoginManagerImproved {
    public void processLogin(User user) {
        System.out.println("process something before login");
        user.login();
        user.enterPage();
        System.out.println("process something after login\n");
    }
}
