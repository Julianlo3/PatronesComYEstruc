package co.edu.unicauca.DesignPatterns.facade;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class PlatformFacade {
    private AssignmentSystem assignment;
    private EvaluationSystem evaluation;

    public PlatformFacade() {
        this.assignment = new AssignmentSystem();
        this.evaluation = new EvaluationSystem();
    }

    public void manageProject(Project project) {
        System.out.println("Manageing project: " + project.getNameProject());
        if (evaluation.evaluate(project)) {
            if (assignment.assign(project)) {
                System.out.println("Project successfully managed and assigned.");
            } else {
                System.out.println("Project approved but no student available.");
            }
        } else {
            System.out.println("Project evaluation failed.");
        }
    }

    public boolean evaluate(Project project) {
        System.out.println("Evaluating project: " + project.getNameProject());
        return Math.random() > 0.3; // 70% probability of approval
    }
}

