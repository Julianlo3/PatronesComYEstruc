package co.edu.unicauca.DesignPatterns.TemplateMethod;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class TechnicalEvaluator  extends ProjectEvaluator {
    @Override
    protected void reviewDocumentation(Project project) {
        System.out.println("Revisión del proyecto " + project.getNameProject() + " por parte del tecnico");
        System.out.println("El tecnico del proyecto esta revisando el proyecto.");
    }

    @Override
    protected void validateRequirements(Project project) {
    System.out.println("El tecnico del proyecto esta validando los requerimientos, detalles finales.");
    }

    @Override
    protected void makeDecision(Project project) {
    System.out.println("El tenico del proyecto tomó la desición de RECHAZAR el proyecto.");
    System.out.println("Razones: \n 1. No implementa SOLID \n 2. Codigo espagueti");
    }
}
