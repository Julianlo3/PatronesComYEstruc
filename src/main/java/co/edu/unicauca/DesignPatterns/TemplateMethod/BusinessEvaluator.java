package co.edu.unicauca.DesignPatterns.TemplateMethod;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class BusinessEvaluator extends ProjectEvaluator {

    @Override
    protected void reviewDocumentation(Project project) {
        System.out.println("Revisión del proyecto " + project.getNameProject() + " por parte del gerente del negocio");
        System.out.println("El proyecto esta siendo revisado por el gerente del negocio");
    }

    @Override
    protected void validateRequirements(Project project) {
    System.out.println("El proyecto ha sido validado por el gerente del negocio");
    }

    @Override
    protected void makeDecision(Project project) {
    System.out.println("El gerente del proyecto tomó la desición de APROBAR");
    }
}
