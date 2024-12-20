# Abstract-Tutorial-2-/*Tat Putjorn 672115024 */

public class StudentName {
    
    private String SID;
    private String firstname;
    private String lastname;

    public StudentName(String SID, String Firstname, String Lastname) {
        this.SID = SID;
        this.firstname = Firstname;
        this.lastname = Lastname;
    }
    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String toString() {
        return this.SID + " " + this.firstname + " " + this.lastname;
    }
}


