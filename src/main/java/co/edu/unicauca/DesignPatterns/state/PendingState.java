package co.edu.unicauca.DesignPatterns.state;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class PendingState extends ProjectState {

    public PendingState() {
        stateName = "Pending";
    }

    @Override
    public void pending(Project project) {
        System.out.println("El proyecto ya se encuentra en el estado" + this.stateName);
    }

    @Override
    public void approve(Project project) {
        System.out.println("El proyecto ha sido APROBADO ");
        project.setState(new ApprovedState());
    }

    @Override
    public void reject(Project project) {
        System.out.println("El proyecto ha sido RECHAZADO ");
        project.setState(new RejectState());
    }

    @Override
    public void assign(Project project) {
        System.out.println("El proyecto no puede ser asignado en el estado actual: " + this.stateName);
    }

    @Override
    public void complete(Project project) {
        System.out.println("El proyecto no puede ser completado en el estado actual: " + this.stateName);
    }
}
