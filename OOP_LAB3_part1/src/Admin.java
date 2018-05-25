public class Admin extends Prototype implements Cloneable {
    public Admin(){}



    public Admin(Admin target) {
        super(target);
    }

    @Override
    public Prototype cloneUser() throws CloneNotSupportedException {
        return (Admin)super.clone();
    }


}
