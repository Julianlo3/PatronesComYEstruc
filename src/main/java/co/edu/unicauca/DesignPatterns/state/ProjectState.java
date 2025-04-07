package co.edu.unicauca.DesignPatterns.state;

import co.edu.unicauca.DesignPatterns.entities.Project;

public abstract class ProjectState {

    protected String stateName;

    public void pending(Project project){
    System.out.println("El proyecto se encuentra en " + this.toString());
    }

    public void approve(Project project){
        System.out.println("El proyecto no se puede aprobar en el estado actual: " + this.toString());
    }

    public void reject(Project project){
        System.out.println("El proyecto no se puede rechazar en el estado actual: " + this.toString());
    }

    public void assign(Project project){
        System.out.println("El proyecto no se puede asignar en el estado actual: " + this.toString());
    }

    public void complete(Project project){
        System.out.println("El proyecto no se puede completar en el estado actual: " + this.toString());
    }

    @Override
    public String toString() {
        return stateName;
    }

}
