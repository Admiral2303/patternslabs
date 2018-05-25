import com.sun.deploy.net.protocol.ProtocolType;

abstract class Prototype {
    public String name;
    public String surname;
    public int age;
    public String city;
    public String login;
    public String password;

    public Prototype(){}

    public Prototype(Prototype target) {
        if (target != null) {
            this.name = target.name;
            this.surname = target.surname;
            this.age = target.age;
            this.city = target.city;
            this.login = target.login;
            this.password = target.password;
        }
    }
    public abstract Prototype cloneUser() throws CloneNotSupportedException;
    public void showInfo(){
        StringBuilder user_inf = new StringBuilder("-----------------------------------" + "\n");
        user_inf.append("User info" + "\n");
        user_inf.append("Name: " + this.name + "\nSurname: " + this.surname + "\nAge: " + this.age  +
            "\nCity: " + this.city + "\nLogin: " + this.login + "\nPassword: " + this.password);
        user_inf.append("\n-----------------------------------");
        System.out.println(user_inf.toString());
    }


}
