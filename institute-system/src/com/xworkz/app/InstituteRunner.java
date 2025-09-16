package com.xworkz.app;

import com.xworkz.app.trainee.Trainnee;
import com.xworkz.app.trainee.impl.XworkzImpl;

public class InstituteRunner {
    public static void main(String[] args) {
        Trainnee xworkz = new XworkzImpl();
        xworkz.registerCourse();
        xworkz.rehisterStudent();
        xworkz.assignTrainer();
    }
}
