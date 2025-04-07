package co.edu.unicauca.DesignPatterns.state;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class CompletedState extends ProjectState{

    public CompletedState(){
        stateName = "Completed";
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
        System.out.println("El proyecto NO se puede asignar en el estado" + this.stateName);
    }

    @Override
    public void complete(Project project) {
        System.out.println("El proyecto ya ha sido completado");
    }
}
