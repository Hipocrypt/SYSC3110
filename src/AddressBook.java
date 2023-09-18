import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> myList = new ArrayList<>();

    public void addBuddy(BuddyInfo buddyinfo) {
        myList.add(buddyinfo);
    }

    public void removeBuddy(BuddyInfo buddyinfo) {
        myList.remove(buddyinfo);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Daniel Esenwa", "Carleton", "99");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
