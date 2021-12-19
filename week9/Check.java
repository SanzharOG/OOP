abstract class Check {
    String objectName = " ";

    Check(String name) {

        this.objectName = name;
        
    }

    abstract public boolean checkIIN();
    abstract public boolean checkPhoneNumber();
}