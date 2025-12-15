package Abstraction;

//9) Abstract class implementing interface partially
interface Repo {
    void save();
    void delete();
}
abstract class AbstractRepo implements Repo {
    public void save() {
        System.out.println("save in base");
    }
}
class UserRepo extends AbstractRepo {
    public void delete() {
        System.out.println("delete in user");
    }
}
public class Test9 {
    public static void main(String[] args) {
        Repo r = new UserRepo();
        r.save();
        r.delete();
    }
}
