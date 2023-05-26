package tasks;

import java.util.List;
import java.util.Map;

public interface DeleteTask {
    public void deleteTask(String id, Map<String, List<Task>> tasks);
}
