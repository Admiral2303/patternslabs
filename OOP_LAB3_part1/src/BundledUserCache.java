import java.util.HashMap;
import java.util.Map;

public class BundledUserCache implements Cloneable {
    private Map<String, Prototype> cache = new HashMap<>();

    public BundledUserCache(){
        User user = new User();
        user.name = "dsfd";
        user.surname = "dsfd";
        user.age = 18;
        user.city = "Kiev";
        user.login = "Admiral4ik";
        user.password = "3220";


        Admin admin = new Admin();
        admin.name = "qwerty";
        admin.surname = "qwerty";
        admin.age = 18;
        admin.city = "Kiev";
        admin.login = "Admiral4ik";
        admin.password = "3220";

        cache.put("User", user);
        cache.put("Admin", admin);

    }
    public Prototype put(String key, Prototype prototype) {
        cache.put(key, prototype);
        return prototype;
    }

    public Prototype get(String key) throws CloneNotSupportedException {
        return cache.get(key).cloneUser();
    }
}
