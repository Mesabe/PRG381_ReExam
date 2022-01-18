package Q4;

import java.io.Serializable;
import java.util.Date;

public class Patient implements Serializable
{
    private String pname;
    private String page;
    private String pcondition;
    private String pADate;


    public Patient(String pname, String page, String pcondition, String pADate) {
        this.pname = pname;
        this.page = page;
        this.pcondition = pcondition;
        this.pADate = pADate;
    }

    
    public String getPname() {
        return pname;
    }
    public String getpADate() {
        return pADate;
    }
    public void setpADate(String pADate) {
        this.pADate = pADate;
    }
    public String getPcondition() {
        return pcondition;
    }
    public void setPcondition(String pcondition) {
        this.pcondition = pcondition;
    }
    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        
        return String.format(getPname() +"\t"+ getPage() + "\t\t" + getPcondition() + "\t\t" + getpADate());
    }
}
