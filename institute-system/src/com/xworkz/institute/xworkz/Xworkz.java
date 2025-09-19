package com.xworkz.institute.xworkz;

import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.trainee.Trainee;

public interface Xworkz {
    boolean isTraineeAppointed(Trainee trainee);
    void getDetailsOfTrainee();
    void getDetailsOfTrainee(Trainee trainee);
    Trainee getTraineeById(int id);
    Subject getSubjectByTraineeName(String traineeName);
    long getPhoneNumberByTraineeId(int traineeId);
    int getNoOfClassesTakenByTraineeId(int traineeId);
    Subject getSubjectNameByTraineeId(int traineeId);
    long getPhoneNumberByName(String traineeName);
    int getNoOfClassesTakenByName(String traineeName);
    int getTraineeIdByName(String traineeName);
    String getTraineeNameById(int traineeId);
    boolean updateNoOfClassesTakenByTraineeId(int traineeId, int newNoOfClasses);
    boolean updatePhoneNumberByTraineeId(int traineeId, long newPhoneNumber);
    boolean updateSubjectByTraineeId(int traineeId, Subject newSubject);
    boolean updateTraineeNameById(int traineeId, String newName);


}
