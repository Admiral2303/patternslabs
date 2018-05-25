public class User extends Prototype implements Cloneable {
    public String role;

    public User(){
        System.out.println("+++");
    }


    public User(User target) {
        super(target);
        if (target != null) {
            this.role = target.role;
        }
    }

    @Override
    public User cloneUser() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}
