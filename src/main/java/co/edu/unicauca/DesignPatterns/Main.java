package co.edu.unicauca.DesignPatterns;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class Main {
    public static void main(String[] args) {
        Project project = new Project("Academic Management System");
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
    }
}