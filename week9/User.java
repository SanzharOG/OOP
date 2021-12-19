public class User extends Check{
    private String iin;
    private String phoneNumber;

    User(String name, String iin, String phoneNumber) {
        super(name);
        this.iin = iin;
        this.phoneNumber = phoneNumber;
    }

    public boolean checkIIN() {

        if (this.iin.length() != 12) {
            return true;

        }
        return false;
    }

    public boolean checkPhoneNumber() {

        if (this.phoneNumber.length() != 11) {
            return true;
        }

        return false;
    }
}
