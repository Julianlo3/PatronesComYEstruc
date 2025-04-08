package co.edu.unicauca.DesignPatterns.facade;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class EvaluationSystem {

    public boolean evaluate(Project project) {
        System.out.println("Evaluating project: " + project.getNameProject());
        return Math.random() > 0.3;
    }
}
