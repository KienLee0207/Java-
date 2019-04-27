package Exam;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.util.Scanner;
import java.io.FileFilter;


public class student {
    static   String studentID;
    static   String studentName;
    static  String Address;
    static   int Phone;
    static  ResultSet resultSet;

    public student(String studentID, String studentName, String address, int phone) {
        this.studentID = studentID;
        this.studentName = studentName;
        Address = address;
        Phone = phone;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public static void main(String[] args) {
        try {
            Connector connector = new Connector();
            boolean start = true;
            Scanner sc = new Scanner(System.in);
            while (start) {
                System.out.println("Run App !!!");
                System.out.println("1: Add student");
                System.out.println("2: Display student records");
                System.out.println("3: Save");
                System.out.println("4: Exit");
                int menu = sc.hasNextInt() ? sc.nextInt() : 0;
                switch (menu) {
                    case 1:
                        AddStudent(connector);
                        break;
                    case 2:
                        DisplayStudent(connector);
                        break;
                    case 3:
                        String save = Save(connector);
                        try {
                            BufferedWriter writer = new BufferedWriter(new FileWriter("StudentSaved.txt"));
                            writer.write(save);
                            writer.close();
                            System.out.println("save Success!");
                        } catch (Exception e) {
                            System.out.println("fail!");
                            break;
                        }
                        break;
                    case 4:
                        start = false;
                        connector.close();
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public  static  void AddStudent(Connector connector)throws  Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("StudentID: ");
        studentID = scanner.nextLine();
        System.out.println("Student Name: ");
        studentName= scanner.nextLine();
        System.out.println("Address: ");
        Address = scanner.nextLine();
        System.out.println("Phone: ");
        Phone = scanner.nextInt();
        String sql= "INSERT INTO exam_student(StudentID,StudentName,Address,Phone) VALUES('"+studentID+"','"+studentName+"','"+Address+"','"+Phone+"')";
        connector.updateQuery(sql);
        System.out.println("Add success !!");
    }
    public  static  void  DisplayStudent(Connector connector) throws  Exception{
        String sql = "SELECT * FROM exam_student";
        System.out.println("Display Student: ");
        resultSet = connector.getQuery(sql);
        while (resultSet.next()) {
            System.out.println("Student ID: " + resultSet.getString("StudentID"));
            System.out.println("Student Name:" + resultSet.getString("StudentName"));
            System.out.println("Address: " + resultSet.getString("Address"));
            System.out.println("Phone :" + resultSet.getInt("Phone"));
        }
    }
    public  static  String  Save(Connector connector ) throws  Exception{
        String saveString = "";
        String sql = "SELECT * FROM exam_student";
        resultSet = connector.getQuery(sql);
        while (resultSet.next()) {
            saveString+= "Student ID: " + resultSet.getString("StudentID")+"Student Name:" + resultSet.getString("StudentName")+"Address: " + resultSet.getString("Address")+"Phone :" + resultSet.getInt("Phone");
        }
return saveString;
    }
}


