public class BuddyInfo {
   private String name;
    public BuddyInfo() {
        this.name = "Daniel Esenwa";
    }

    public BuddyInfo(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;




    }




    public static void main(String[] args) {
        BuddyInfo hall = new BuddyInfo();
        System.out.println("Hello, " + hall.getName());
        BuddyInfo mark = new BuddyInfo("joshua");
        System.out.println("Hello, " + mark.getName());
    }
}

