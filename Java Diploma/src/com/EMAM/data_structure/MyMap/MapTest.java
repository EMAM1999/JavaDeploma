/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.data_structure.MyMap;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class MapTest {


    static enum DaysOfWeek {
        SAt, SON, MON, TUE, WED, THU, FRI
    }

    public static void main(String[] args) {
        Map<LocalTime, Subject> satTable = new HashMap();
        satTable.put(LocalTime.of(9, 0), new Subject("Logic", "Ahmed"));
        satTable.put(LocalTime.of(10, 30), new Subject("Math", "Mohamed"));
        satTable.put(LocalTime.of(12, 30), new Subject("automata", "Khalid"));


        Map<DaysOfWeek, Map<LocalTime, Subject>> table = new HashMap();
        table.put(DaysOfWeek.SAt, satTable);
    }


}

class Subject {
    String name;
    String teacherName;

    public Subject(String name, String teacherName) {
        this.name = name;
        this.teacherName = teacherName;
    }
}
