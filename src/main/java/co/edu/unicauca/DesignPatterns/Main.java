package co.edu.unicauca.DesignPatterns;

import co.edu.unicauca.DesignPatterns.TemplateMethod.BusinessEvaluator;
import co.edu.unicauca.DesignPatterns.TemplateMethod.TechnicalEvaluator;
import co.edu.unicauca.DesignPatterns.adapter.ExternalProjectService;
import co.edu.unicauca.DesignPatterns.adapter.IProjectDataProvider;
import co.edu.unicauca.DesignPatterns.adapter.ProjectAdapter;
import co.edu.unicauca.DesignPatterns.decorator.PriorityProject;
import co.edu.unicauca.DesignPatterns.entities.Project;

public class Main {
    public static void main(String[] args) {
        Project project = new Project("Academic Management System");
        //------------------------------------------
        //Patron State
        System.out.println("STATE PATTERN");
        System.out.println("Initial state: " + project.getState().toString());
        project.approve();
        System.out.println("Current Status: " + project.getState().toString());
        project.assign();
        System.out.println("Current Status: " + project.getState().toString());
        project.complete();
        System.out.println("Current Status: " + project.getState().toString());
        project.complete();
        //--------------------------------------------
        //Patrón Template Method
        System.out.println("TEMPLAE METHOD PATTERN");
        TechnicalEvaluator technicalEvaluator = new TechnicalEvaluator();
        technicalEvaluator.evaluate(project);
        BusinessEvaluator businessEvaluator = new BusinessEvaluator();
        businessEvaluator.evaluate(project);
        //-------------------------------------------
        //Patron decorator
        System.out.println("DECORATOR PATTERN");
        PriorityProject priorityProject = new PriorityProject(project);
        System.out.println("Project description: " + priorityProject.getNameProject());
        //-------------------------------------------
        //Patron Adapter
        System.out.println("ADAPTER PATTERN");
        ExternalProjectService externalService = new ExternalProjectService();
        IProjectDataProvider adapter = new ProjectAdapter(externalService);
        Project adaptedProject = adapter.getProject();
        System.out.println("Project created from external service: " + adaptedProject.getNameProject());
    }
}