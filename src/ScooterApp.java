import java.util.ArrayList;

public class ScooterApp {

    public static class Station {
    String name;
    ArrayList<Scooter> scooters;

    public Station (String name){
        this.name = name;
        this.scooters = new ArrayList<>();
    } }

    public ArrayList<Station> stations;
    public ArrayList<User> registeredUsers;

// constructor to initialize the stations and their registered users
    public ScooterApp(){
        stations = new ArrayList<>();
        registeredUsers = new ArrayList<>();

        // adding stations to the arraylist
        stations.add(new Station("Wemyss Bay"));
        stations.add(new Station("Glasgow"));
        stations.add(new Station("Portree"));
        stations.add(new Station("London"));
}


// registers a new user if they are not already registered and is 18 or older
    public User registerUser (String username, String password, Integer age) throws Exception{
        if (age < 18){
            throw new Exception("too young to register");
    }

// checking to see if the user is already registered
        for( User user : registeredUsers){
        if(user.getUsername().equals(username)) {
            throw new Exception("already registered");
        }}

        User user = new User (username, password, age);
            registeredUsers.add(user);
            System.out.println("User " + username + " is registered");
            return user;
    }

    // logging in a new user if the password is correct
    public void loginUser(String username, String password) throws Exception{
        User user = findUser(username);
        if (user == null){
            throw new Exception("Username or password is incorrect");
        }

        try{
            user.logIn(password);
            System.out.println("User " + username + " is logged in");
        } catch (Exception e){
            throw new Exception("Username or password is incorrect");
        }
    }

    // logging out an existing user




}
