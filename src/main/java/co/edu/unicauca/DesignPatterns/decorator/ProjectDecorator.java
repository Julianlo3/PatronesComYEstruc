package co.edu.unicauca.DesignPatterns.decorator;

import co.edu.unicauca.DesignPatterns.entities.Project;

public abstract class ProjectDecorator extends Project {

    protected Project project;

    public ProjectDecorator(Project project) {
        super(project.getNameProject());
        this.project = project;
    }
}
