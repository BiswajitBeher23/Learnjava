
class Student extends Coaching {
    private double coursepayment;
    String course;

    public Student(String name, String gender, String contactnumber, String address, String college,
            double coursepayment, String course) {
        super(name, gender, contactnumber, address, college);
        setCoursepayment(coursepayment);
        setCourse(course);
    }

    @Override
    public void smsCheck() {
        System.out.print("sms sending to " + getName() + " for " + getCourse() + ". " + coursepayment
                + " has been paid for this course ");
    }

    public void getStudent() {
        System.out.println(
                this.name + "  " + this.gender + "  " + this.college + "  " + this.address + "  " + this.contactnumber);
    }

    public double getCoursepayment() {
        return coursepayment;
    }

    public void setCoursepayment(double newPayment) {
        if (newPayment >= 0.0) {
            coursepayment = newPayment;
        }
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public double joineePayment() {
        System.out.println("New joinee payment " + getName());
        return coursepayment;
    }
}
