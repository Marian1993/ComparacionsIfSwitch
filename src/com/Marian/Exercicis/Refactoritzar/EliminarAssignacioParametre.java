package com.Marian.Exercicis.Refactoritzar;

public class EliminarAssignacioParametre {

    public static float evaluateTerm(float homeworkMark, float examMark, float attitude) {
        float tempExam = examMark;
        float tempHomework = homeworkMark;

        if (tempExam < 5) {
            tempExam = 1;
        }
        if (tempHomework < 4) {
            tempHomework = 1;

        }
        return (tempHomework + tempExam) / 2 + attitude;
    }
}
