public class Start {
    public static void main(String[] args) {
        User user = new User();
        user.firstName = "Roberta";
        user.lastName = "Ragusa";
        user.age = 23;

        Hobby userHobby = new Hobby();
        userHobby.name = "Listen music";
        user.hobby = userHobby;

        System.out.println("First Name is: " + user.firstName);
        System.out.println("Last Name is: " + user.lastName);
        System.out.println("Age is: " + user.age);
        System.out.println("Hobby is: " + user.hobby.name);
    }
}


public class Hobby {
    public String name;
}


public class User {
    public String firstName;
    public String lastName;
    public int age;
    public Hobby hobby;
}
