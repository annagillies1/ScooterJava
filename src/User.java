public class User {

    public String username;
    public String password;
    public int age;
    public Boolean loggedIn;


        public User (String username, String password, int age){
            this.username = username;
            this.password = password;
            this.age = age;
            this.loggedIn = false;
        }

        // getter method to retrieve the username
    public String getUsername(){
            return username;
    }

        // method to log in the user by verifying the password

        public void logIn (String password) throws Exception {
            if (!this.password.equals(password)){
                throw new Exception("incorrect password");
            }
            this.loggedIn= true;
        }

        // logging the user out

        public void logOut(){
            this.loggedIn = false;
        }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }

}
