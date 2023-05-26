package tasks;

import java.util.List;
import java.util.Map;

public interface AddTask {
    public void addTask(String project, String description, Map<String, List<Task>> tasks );
}
