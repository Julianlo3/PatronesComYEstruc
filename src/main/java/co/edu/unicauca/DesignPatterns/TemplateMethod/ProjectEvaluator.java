package co.edu.unicauca.DesignPatterns.TemplateMethod;

import co.edu.unicauca.DesignPatterns.entities.Project;

public abstract class ProjectEvaluator {

    public final void evaluate(Project project) {
        reviewDocumentation(project);
        validateRequirements(project);
        makeDecision(project);
    }
    protected abstract void reviewDocumentation(Project project);
    protected abstract void validateRequirements(Project project);
    protected abstract void makeDecision(Project project);
}
