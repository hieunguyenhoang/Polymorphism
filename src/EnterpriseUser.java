import org.w3c.dom.ls.LSOutput;

public class EnterpriseUser extends User {
    private String company;

    public EnterpriseUser(String email, String password, String nickname, String company) {
        super(email, password, nickname);
        this.company = company;
    }

    public void login() {
        System.out.println("Checking email and password and company");
        System.out.println("Hello " + this.nickname + "!");
    }

    public void enterPage() {
        System.out.println("Enter the " + this.company + " Enterprise Page!");
    }
}