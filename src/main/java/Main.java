import dao.UserImplDAO;
import model.User;

public class Main {
    public static void main(String[] args) {
        UserImplDAO uid=  new UserImplDAO();
        User u = new User();
        u.setNombre("maisi");
        u.setMail("maisisisi");
        u.setTelephone(19292);
        uid.createUser(u);
    }
}
