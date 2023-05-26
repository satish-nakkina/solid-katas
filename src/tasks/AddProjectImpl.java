package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddProjectImpl implements AddProject {

    public void addProject(String name, Map<String, List<Task>> tasks) {
        tasks.put(name, new ArrayList<Task>());
    }
}
