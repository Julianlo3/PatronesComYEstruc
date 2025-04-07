package co.edu.unicauca.DesignPatterns.state;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class ApprovedState extends ProjectState {
    public ApprovedState(){
        stateName = "Approved";
    }


    @Override
    public void pending(Project project) {
        System.out.println("El proyecto NO puede ser pendiente porque ya se encuentra en el estado" + this.stateName);
    }

    @Override
    public void approve(Project project) {
        System.out.println("El proyecto ya se encuentra en el estado" + this.stateName);
    }

    @Override
    public void reject(Project project) {
        System.out.println("El proyecto NO se puede rechazar en el estado" + this.stateName);
    }

    @Override
    public void assign(Project project) {
        System.out.println("El proyecto ha sido asignado correctamente");
        project.setState(new AssignedState());
    }

    @Override
    public void complete(Project project) {
        System.out.println("El proyecto NO se puede completar en el estado" + this.stateName);
    }
}
