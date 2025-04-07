package co.edu.unicauca.DesignPatterns.decorator;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class PriorityProject extends ProjectDecorator {
    public PriorityProject(Project project) {
        super(project);
    }

    @Override
    public String getNameProject() {
        return project.getNameProject() + " [High Priority]";
    }
}
