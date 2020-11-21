package entities;

//public class user {
//    private String username = null;
//    private String password = null;
//
//    public User(final String firstName, final String lastName,
//                final String nationality, final Integer age) {
//        super();
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.nationality = nationality;
//        this.age = age;
//    }
//}
public class User {

    private String name = null;
    private String pwd = null;


    public User(final String name ,final String pwd) {
        super();
        this.name = name;
        this.pwd = pwd;
    }


    public String getName() {
        return this.name;
    }

    public String getPwd() {
        return this.pwd;
    }


}
