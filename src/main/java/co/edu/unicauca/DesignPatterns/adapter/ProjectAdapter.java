package co.edu.unicauca.DesignPatterns.adapter;
import co.edu.unicauca.DesignPatterns.entities.Project;
import org.json.JSONObject;


public class ProjectAdapter implements IProjectDataProvider {

    private ExternalProjectService externalProjectService;
    private Project project;

    public ProjectAdapter(ExternalProjectService externalProjectService) {
    this.externalProjectService = new ExternalProjectService();
    }

    @Override
    public Project getProject() {
        String json = externalProjectService.getProjectData();

        JSONObject obj = new JSONObject(json);
        String title = obj.getString("title");

        return new Project(title);
    }
}
