package com.xworkz.institute.xworkz.impl;

import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.exception.*;
import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.trainevalidator.TraineeValidator;
import com.xworkz.institute.xworkz.Xworkz;

public class XworkzImpl implements Xworkz {
    Trainee trainees[];
    int index;
    static String name;

    public XworkzImpl(int size) {
        trainees = new Trainee[size];
    }

    TraineeValidator traineeValidator = new TraineeValidator();

    @Override
    public boolean isTraineeAppointed(Trainee trainee) {
        boolean isTraineeAppointed = false;

        boolean isValidInfo = traineeValidator.isTrainneInfoValidated(trainee);
        try {
            if (isValidInfo) {
//            this.trainee=trainee;
                trainees[index] = trainee;
                index++;
                isTraineeAppointed = true;

            } else {
                throw new TraineeNotAppoinedException("the Validation of the trainee is not valid");
            }
        } catch (TraineeNotAppoinedException e) {
            e.printStackTrace();
        }
        return isTraineeAppointed;
    }

    @Override
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

    @Override
    public void getDetailsOfTrainee(Trainee trainee) {
        try {
            if (trainee != null) {
                System.out.println("the id of the trainee is  " + trainee.getId());
                System.out.println("the name of the trainee is  " + trainee.getName());
                System.out.println("the class taken of the trainee is  " + trainee.getNoOfClassesTaken());
                System.out.println("the phone no of the trainee is  " + trainee.getPhoneNumber());
                System.out.println("the subject of the trainee is  " + trainee.getSubject());
                System.out.println(" ");
            } else throw new TraineeNotAppoinedException("traine not added");
        } catch (TraineeNotAppoinedException e) {
            e.printStackTrace();
        }
    }

    @Override

    public Trainee getTraineeById(int id) {
        Trainee trainee = null;
        try {
            if (id > 0) {
                for (Trainee trainee1 : trainees) {
                    if (trainee1.getId() == id) {
                        trainee = trainee1;
                    }
                }
            }
            if (trainee == null) {
                throw new TraineeNotFoundException("trainne not found");
            }
        } catch (TraineeNotFoundException e) {
            e.printStackTrace();
        }
        return trainee;
    }

    @Override
    public Subject getSubjectByTraineeName(String traineeName) {
        Subject subject = null;
        try {
            if (traineeName != null) {
                for (Trainee trainee : trainees) {
                    if (trainee.getName().equals(traineeName)) {
                        subject = trainee.getSubject();
                    }
                }
            }
            if (subject == null) {
                throw new SubjectNotFoundException("enter valid name");
            }
        } catch (SubjectNotFoundException e) {
            e.printStackTrace();
        }

        return subject;
    }

    @Override

    public long getPhoneNumberByTraineeId(int traineeId) {
        long phone = 0;
        try {
            if (traineeId > 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        phone = trainee.getPhoneNumber();
                    }
                }
            }
            if (phone == 0) {
                throw new PhoneNotFOundException("enter valid ID");
            }
        } catch (PhoneNotFOundException e) {
            e.printStackTrace();
        }

        return phone;
    }

    @Override
    public int getNoOfClassesTakenByTraineeId(int traineeId) {
        int classes = 0;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        classes = trainee.getNoOfClassesTaken();
                    }
                }
            }
            if (classes == 0) {
                throw new ClassessNotFoundException("enter valid ID to get noOfClasses");
            }
        } catch (ClassessNotFoundException e) {
            e.printStackTrace();
        }
        return classes;
    }

    @Override
    public Subject getSubjectNameByTraineeId(int traineeId) {
        Subject sub = null;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        sub = trainee.getSubject();
                    }
                }
            }
            if (sub == null) {
                throw new SubjectNotFoundException("enter valid ID to get sub");
            }
        } catch (SubjectNotFoundException e) {
            e.printStackTrace();
        }
        return sub;
    }

    @Override
    public long getPhoneNumberByName(String traineeName) {
        long phone = 0;
        try {
            if (traineeName != null) {
                for (Trainee trainee : trainees) {
                    if (trainee.getName().equals(traineeName)) {
                        phone = trainee.getPhoneNumber();
                    }
                }
            }
            if (phone == 0) {
                throw new PhoneNotFOundException("enter valid ID to get noOfClasses");
            }
        } catch (PhoneNotFOundException e) {
            e.printStackTrace();
        }
        return phone;
    }

    @Override
    public int getNoOfClassesTakenByName(String traineeName) {
        int classes = 0;
        try {
            if (traineeName != null) {
                for (Trainee trainee : trainees) {
                    if (trainee.getName().equals(traineeName)) {
                        classes = trainee.getNoOfClassesTaken();
                    }
                }
            }
            if (classes == 0) {
                throw new ClassessNotFoundException("enter valid name to get noOfClasses");
            }
        } catch (ClassessNotFoundException e) {
            e.printStackTrace();
        }
        return classes;
    }

    @Override
    public int getTraineeIdByName(String traineeName) {
        int id = 0;
        try {
            if (traineeName != null) {
                for (Trainee trainee : trainees) {
                    if (trainee.getName().equals(traineeName)) {
                        id = trainee.getId();
                    }
                }
            }
            if (id <= 0) {
                throw new IdNotFoundException("the trainee id is not valid to get tainee name ");
            }
        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public String getTraineeNameById(int traineeId) {
        String name = null;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        name = trainee.getName();
                    }
                }
            }
            if (name == null) {
                throw new TraineeNameNotFoundException("enter valid id to get trainee name");
            }
        } catch (TraineeNameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    //update
    @Override
    public boolean updateNoOfClassesTakenByTraineeId(int traineeId, int newNoOfClasses) {
        boolean isUpdated = false;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        trainee.setNoOfClassesTaken(newNoOfClasses);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new ClassesNotUpdatedException("enter valid id to update Classes");
            }
        } catch (ClassesNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updatePhoneNumberByTraineeId(int traineeId, long newPhoneNumber) {
        boolean isUpdated = false;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        trainee.setPhoneNumber(newPhoneNumber);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new PhoneNoNotUpdatedException("enter valid id to update phone number");
            }
        } catch (
                PhoneNoNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateSubjectByTraineeId(int traineeId, Subject newSubject) {
        boolean isUpdated = false;
        try {
            if (traineeId > 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        trainee.setSubject(newSubject);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new SubjectNotUpdatedException("enter valid id to update subject");
            }
        } catch (SubjectNotUpdatedException e) {
            e.printStackTrace();
        }

        return isUpdated;
    }

    @Override
    public boolean updateTraineeNameById(int traineeId, String newName) {
        boolean isUpdated = false;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        trainee.setName(newName);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new TraineeNameNotUpdatedException("enter a valid id to update the trainee name");
            }
        } catch (TraineeNameNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }
}
