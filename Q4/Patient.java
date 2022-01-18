package Q4;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

public class Patient implements Serializable
{
    private String pname;
    private String page;
    private String pcondition;
    private Date pADate;
    private int dayshere;


    public Patient(String pname, String page, String pcondition, Date pADate) {
        this.pname = pname;
        this.page = page;
        this.pcondition = pcondition;
        this.pADate = pADate;
    }

    
    public int getDayshere() {
        return dayshere;
    }


    public void setDayshere(int dayshere) {
        
      this.dayshere = dayshere;
    }


    public String getPname() {
        return pname;
    }
    public Date getpADate() {
        return pADate;
    }
    public void setpADate(Date pADate) {
        this.pADate = pADate;
        int days =0 ;
        days = Date.from(pADate,System.currentTimeMillis());
        setDayshere(days);
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
