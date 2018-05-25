//prototype

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        BundledUserCache cache = new BundledUserCache();
        User cloneduser = (User)cache.get("User");
        User cloneduser1 = (User)cache.get("User");
        cloneduser.showInfo();
        cloneduser1.showInfo();


    }
}
