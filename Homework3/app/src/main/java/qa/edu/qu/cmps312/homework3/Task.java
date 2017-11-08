package qa.edu.qu.cmps312.homework3;


import java.sql.Time;
import java.util.Date;

public class Task {

    private String title;
    private String priority;
    private boolean status;
    private Date date;
    private Time time;

    public Task (String title, String priority, boolean status, Date date, Time time){
        this.time = time;
        this.title = title;
        this.priority = priority;
        this.status =status;
        this.date = date;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setPriority(String priority){
        this.priority = priority;
    }

    public String getPriority(){
        return priority;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public Time getTime(){
        return time;
    }
}
