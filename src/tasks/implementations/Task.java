package tasks.implementations;



import java.util.Date;

public final class Task {
    private final long id;
    private final String description;
    private boolean done;
    private Date deadline;
    public Task(long id, String description, boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    public Date getDeadline() {
        return deadline;
    }

}
