/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.packages.my.school;

/**
 *
 * @author wsen
 */
public class Classroom {
    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor = 3;
    //public Classroom(int r, String t) {
    Classroom(int r, String t) {
       roomNumber = r;
       teacherName = t;
    }
}
