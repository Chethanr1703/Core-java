package com.xworkz.institute.xworkz;

import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.trainevalidator.TraineeValidator;

public class Xworkz {
    Trainee trainees[];
    int index;
    static String name;

    public Xworkz(int size) {
        trainees = new Trainee[size];
    }

    TraineeValidator traineeValidator = new TraineeValidator();

    public boolean isTraineeAppointed(Trainee trainee) {
        boolean isTraineeAppointed = false;



        boolean isValidInfo = traineeValidator.isTrainneInfoValidated(trainee);
        if (isValidInfo) {
//            this.trainee=trainee;
            trainees[index] = trainee;
            index++;
            isTraineeAppointed = true;

        } else {
            System.out.println("the Validation of the trainee is not valid");
        }
        return isTraineeAppointed;
    }

    public void getDetailsOfTrainee() {
        for (Trainee trainee : trainees) {
            System.out.println("the id of the trainee is  " + trainee.getId());
            System.out.println("the name of the trainee is  " + trainee.getName());
            System.out.println("the class taken of the trainee is  " + trainee.getNoOfClassesTaken());
            System.out.println("the phone no of the trainee is  " + trainee.getPhoneNumber());
            System.out.println("the subject of the trainee is  " + trainee.getSubject());
            System.out.println(" ");
        }
    }
    public void getDetailsOfTrainee(Trainee trainee) {
            System.out.println("the id of the trainee is  " + trainee.getId());
            System.out.println("the name of the trainee is  " + trainee.getName());
            System.out.println("the class taken of the trainee is  " + trainee.getNoOfClassesTaken());
            System.out.println("the phone no of the trainee is  " + trainee.getPhoneNumber());
            System.out.println("the subject of the trainee is  " + trainee.getSubject());
            System.out.println(" ");
        }

        public Trainee getTraineeById(int id){
            Trainee trainee =null;
            if(id>0){
                for (Trainee trainee1: trainees){
                    if(trainee1.getId()==id){
                        trainee=trainee1;
                    }
                }
            }return  trainee;
        }

    public Subject getSubjectByTraineeName(String traineeName) {
        Subject subject = null;
        if (traineeName != null) {
            for (Trainee trainee : trainees) {
                if (trainee.getName().equals(traineeName)) {
                    subject = trainee.getSubject();
                }
            }
        } else System.out.println("enter valid name");

        return subject;
    }


    public long getPhoneNumberByTraineeId(int traineeId) {
        long phone = 0;
        if (traineeId != 0) {
            for (Trainee trainee : trainees) {
                if (trainee.getId() == traineeId) {
                    phone = trainee.getPhoneNumber();
                }
            }
        } else System.out.println("enter valid ID");

        return phone;
    }

    public int getNoOfClassesTakenByTraineeId(int traineeId){
        int classes = 0;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    classes = trainee.getNoOfClassesTaken();
                }
            }
        }else System.out.println("enter valid ID");
        return classes;
    }

    public Subject getSubjectNameByTraineeId(int traineeId){
        Subject sub = null;
        if(traineeId != 0){
            for(Trainee trainee : trainees ){
                if(trainee.getId() == traineeId){
                    sub = trainee.getSubject();
                }
            }
        }else System.out.println("enter valid ID");
        return sub;
    }

    public long getPhoneNumberByName(String traineeName){
        long phone = 0;
        if(traineeName != null){
            for(Trainee trainee : trainees){
                if(trainee.getName().equals(traineeName)){
                    phone = trainee.getPhoneNumber();
                }
            }
        }else System.out.println("enter valid name");
        return phone;
    }

    public int getNoOfClassesTakenByName(String traineeName){
        int classes = 0;
        if(traineeName != null){
            for(Trainee trainee : trainees){
                if(trainee.getName().equals(traineeName)){
                    classes = trainee.getNoOfClassesTaken();
                }
            }
        }else System.out.println("enter valid name");
        return classes;
    }

    public int getTraineeIdByName(String traineeName){
        int id = 0;
        if(traineeName != null){
            for(Trainee trainee : trainees){
                if(trainee.getName().equals(traineeName)){
                    id = trainee.getId();
                }
            }
        }else System.out.println("enter valid name");
        return id;
    }
    public String getTraineeNameById(int traineeId){
        String name = null;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    name = trainee.getName();
                }
            }
        }else System.out.println("enter valid ID");
        return name;
    }

    //update

    public boolean updateNoOfClassesTakenByTraineeId(int traineeId, int newNoOfClasses){
        boolean isUpdated = false;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    trainee.setNoOfClassesTaken(newNoOfClasses);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }

    public boolean updatePhoneNumberByTraineeId(int traineeId, long newPhoneNumber){
        boolean isUpdated = false;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    trainee.setPhoneNumber(newPhoneNumber);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }

    public boolean updateSubjectByTraineeId(int traineeId, Subject newSubject){
        boolean isUpdated = false;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    trainee.setSubject(newSubject);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }

    public boolean updateTraineeNameById(int traineeId, String newName){
        boolean isUpdated = false;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    trainee.setName(newName);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }
}
