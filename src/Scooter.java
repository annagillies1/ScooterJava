public class Scooter {

        // a static variable that keeps track fot eh next serial number

        // declaring the variable
        public String station;
    public String user;
    public Integer serial;
    public Integer charge;
    public Boolean isBroken;
    public static int nextSerial = 1;


    // constructor

        public Scooter(string station) {
        this.station = station;
        this.user = user;
        this.serial = nextSerial++;
        this.charge = 100;
        this.isBroken = false;
        }

        // creating a method to rent the scooter to a user
    public void rent (String user) throws Exception{
            if (this.charge <= 20) {
            System.out.println("scooter needs to charge");
            } else if (this.broken) {
            System.out.println("scooter needs repair");
            }
            this.user = user;
            this.station = null;
        }

        // method to dock the scooter at a station
    public void dock (String station) {
                this.station = station;
                this.user = null;
    }

    }
