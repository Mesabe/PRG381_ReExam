package Q4;

import java.io.Serializable;
import java.util.Date;

public class Patient implements Serializable
{
    private String pname;
    private int page;
    private String pcondition;
    private Date pADate;


    public Patient(String pname, int page, String pcondition, Date pADate) {
        this.pname = pname;
        this.page = page;
        this.pcondition = pcondition;
        this.pADate = pADate;
    }

    
    public String getPname() {
        return pname;
    }
    public Date getpADate() {
        return pADate;
    }
    public void setpADate(Date pADate) {
        this.pADate = pADate;
    }
    public String getPcondition() {
        return pcondition;
    }
    public void setPcondition(String pcondition) {
        this.pcondition = pcondition;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        
        return String.format(getPname() +"\t"+ getPage() + "\t\t" + getPcondition() + "\t\t" + getpADate()  );
    }
}
