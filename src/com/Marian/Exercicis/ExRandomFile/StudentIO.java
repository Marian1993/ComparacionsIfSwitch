package com.Marian.Exercicis.ExRandomFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class StudentIO {

    private static final int STUDENT_SIZE = 1 + 4 + (Student.getMaxString() * 2); // 45
    // active + id + name

    private RandomAccessFile f;
    private long studentCount;

    public StudentIO(String fileName, String mode) throws IOException {
        f = new RandomAccessFile(fileName, mode);
    }


    public void add(Student student) throws IOException {
        f.seek(f.length());
        f.writeBoolean(student.isActive());
        f.writeInt(student.getId());
        f.writeChars(student.getAdjustedName());
    }

    public Student getStudent(int id) throws IOException {
        int index = getStudentIndex(id);
        f.seek(index * STUDENT_SIZE);
        return readStudent();
    }


    public void resign(int id) throws IOException {
        int index = getStudentIndex(id);
        f.seek((long) index * STUDENT_SIZE);
        f.writeBoolean(false);
    }


    private int getStudentIndex(int id) throws IOException {
        for (int i = 0; i < getStudentCount(); i++) {
            f.seek((long) i * STUDENT_SIZE + 1);
            if (id == f.readInt()) {
                return i;
            }
        }
        return -1;
    }

    private Student readStudent() throws IOException {
        Student student = new Student();
        if (f.getFilePointer() % STUDENT_SIZE == 0) {
            student.setActive(f.readBoolean());
            student.setId(f.readInt());
            student.setName(readString(Student.getMaxString()));
        }
        return student;
    }

    public void displayActiveStudents() throws IOException {
        Student student = new Student();
        for (int i = 0; i < getStudentCount(); i++) {
            f.seek((long) i * STUDENT_SIZE);
            student = readStudent();
            if (student.isActive()) {
                System.out.println(student);
            }
        }
    }

    private String readString(int stringLength) throws IOException{
        String name = "";
        for (int i = 0; i < stringLength; i++) {
            name += f.readChar();
        }
        return name;
    }

    private int getStudentCount() throws IOException {
        return (int) f.length() / STUDENT_SIZE;
    }

    public void close() throws IOException {
        f.close();
    }
}
