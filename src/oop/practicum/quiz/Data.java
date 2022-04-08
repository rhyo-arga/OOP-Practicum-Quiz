/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.practicum.quiz;

/**
 *
 * @author ASUS
 */
public class Data {
    private String Nik, Name;
    private double writing, coding, interview;

    public Data(String Name, String nik, double writing, double coding, double interview) {
        this.Name = Name;
        this.Nik = Nik;
        this.writing = writing;
        this.coding = coding;
        this.interview = interview;
    }

    public String getNik() {
        return Nik;
    }

    public String getName() {
        return Name;
    }

    public double getWriting() {
        return writing;
    }

    public void setWriting(double writing) {
        this.writing = writing;
    }

    public double getCoding() {
        return coding;
    }

    public void setCoding(double coding) {
        this.coding = coding;
    }

    public double getInterview() {
        return interview;
    }

    public void setInterview(double interview) {
        this.interview = interview;
    }
}
