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
public class WebDevelopment extends Data implements Calculate {
    private double finalScore;
    public WebDevelopment(String Nik, String Name, double writing, double coding, double interview) {
        super(Nik, Name, writing, coding, interview);
    }

    public double getFinalScore() {
        return finalScore;
    }

    @Override
    public double finalScore() {
        return ((this.getWriting() * 0.4) + (this.getCoding() * 0.35) + (this.getInterview() * 0.25));
    }
}
