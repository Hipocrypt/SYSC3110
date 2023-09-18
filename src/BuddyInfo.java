public class BuddyInfo {
    private final String name;
    private String address;
    private String number;

    public BuddyInfo() {
        this.name = "Daniel Esenwa";
    }

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }

    public String getNumber() {
        return this.number;
    }


    public static void main(String[] args) {
        BuddyInfo hall = new BuddyInfo();
        System.out.println("Hello, " + hall.getName() + hall.getAddress() + hall.getNumber() );
    }
}

