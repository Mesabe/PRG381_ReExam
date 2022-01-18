package Q5;

public class student {

    private String surname;
    private String projname;
    private String campname;
    

    public student(String surname, String projname, String campname) {
        this.surname = surname;
        this.projname = projname;
        this.campname = campname;   
    }


    public String getCampname() {
        return campname;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getProjname() {
        return projname;
    }
    public void setProjname(String projname) {
        this.projname = projname;
    }
    public void setCampname(String campname) {
        this.campname = campname;
    }
    
}
