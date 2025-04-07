package co.edu.unicauca.DesignPatterns.entities;

import co.edu.unicauca.DesignPatterns.state.PendingState;
import co.edu.unicauca.DesignPatterns.state.ProjectState;

public class Project {
    private ProjectState state;
    private String nameProject;

    public Project(String nameProject) {
    this.nameProject = nameProject;
    this.setState(new PendingState());
    }

    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }

    public void assign() {
        state.assign(this);
    }

    public void complete() {
        state.complete(this);
    }

    public void pending() {
        state.pending(this);
    }

    public ProjectState getState() {
        return state;
    }

    public void setState(ProjectState state) {
        this.state = state;
    }

    public String getNameProject() {
        return nameProject;
    }
}
