
public class Main {
    public static void main(String[] args) {
        LoginManagerImproved loginManager = new LoginManagerImproved();

        User user = new PaidUser("luke@gmail.com", "1111", "luke", "Pro");
        loginManager.processLogin(user);

        user = new EnterpriseUser("in@gmail.com", "2222", "Jin", "Codepresso");
        loginManager.processLogin(user);

        user = new Administrator("any@gmail.com", "3333", "Any", "Lv2");
        loginManager.processLogin(user);

        user = new UniversityUser("hieu@mgmail.com",  "4444", "nguyenhoanghieu", "SGU");
        loginManager.processLogin(user);


        /*LoginManager loginManager = new LoginManager();

        PaidUser grace = new PaidUser("luke@gmail.com", "1111", "luke", "Pro");
        loginManager.processLogin(grace);

        EnterpriseUser luke = new EnterpriseUser("in@gmail.com", "2222", "Jin", "Codepresso");
        loginManager.processLogin(luke);

        Administrator amy = new Administrator("any@gmail.com", "3333", "Any", "Lv2");
        loginManager.processLogin(amy);*/
    }
}