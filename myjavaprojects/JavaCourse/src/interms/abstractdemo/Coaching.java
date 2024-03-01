
abstract class Coaching {
    String name;
    String gender;
    String college;
    protected String contactnumber;
    protected String address;

    public Coaching(String name, String gender, String contactnumber, String address, String college) {
        System.out.println("Student Details");
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.college = college;
        this.contactnumber = contactnumber;
    }

    public double joineePayment() {
        System.out.println("Coaching class joined");
        return 0.0;
    }

    public void smsCheck() {
        System.out.println("Sms delivered to check " + this.name + " from " + this.college + " \n ");
    }

    public String toString() {
        return name + "  " + gender + "  " + college + "  " + contactnumber + "  " + address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCollege() {
        return college;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void getStudent() {
        System.out.println(
                this.name + "  " + this.gender + "  " + this.college + "  " + this.address + "  " + this.contactnumber);
    }
}
