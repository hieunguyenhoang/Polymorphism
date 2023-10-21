public class UniversityUser extends User{
    private String university;

    public UniversityUser(String email, String password, String nickname, String university) {
        super(email, password, nickname);
        this.university = university;
    }

    public void login() {
        System.out.println("Checking email and password and university");
        System.out.println("Hello " + this.nickname + "!");
    }

    public void enterPage() {
        System.out.println("Enter the " + this.university + " university Page!");
    }
}
