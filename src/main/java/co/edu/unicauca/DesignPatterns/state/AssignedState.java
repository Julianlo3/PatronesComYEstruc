package co.edu.unicauca.DesignPatterns.state;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class AssignedState extends ProjectState {

    public AssignedState() {
        stateName = "Assigned";
    }


    @Override
    public void pending(Project project) {
        System.out.println("El proyecto NO puede ser pendiente porque ya se encuentra en el estado" + this.stateName);
    }

    @Override
    public void approve(Project project) {
        System.out.println("El proyecto NO puede ser aprobado porque ya se encuentra en el estado" + this.stateName);
    }

    @Override
    public void reject(Project project) {
        System.out.println("El proyecto NO se puede rechazar en el estado" + this.stateName);
    }

    @Override
    public void assign(Project project) {
        System.out.println("El proyecto ya se encuentra en el estado" + this.stateName);
    }

    @Override
    public void complete(Project project) {
        System.out.println("El proyecto ha sido completado correctamente");
        project.setState(new CompletedState());
    }
}
