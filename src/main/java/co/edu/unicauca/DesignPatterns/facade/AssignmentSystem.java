package co.edu.unicauca.DesignPatterns.facade;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class AssignmentSystem {

    public boolean assign(Project project) {
        System.out.println("Assigning project: " + project.getNameProject());
        return Math.random() > 0.3;
    }
}
