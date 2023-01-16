package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttendanceService{
    private Integer numberGroup;
    private StudentsGroup students;
    
    public AttendanceService(Integer numberGroup) {
        this.numberGroup = numberGroup;
        this.students = generateGrup();
    }

    private StudentsGroup generateGrup(){
        StudentsGroup group = new StudentsGroup(239);
        group.add(new Student("John Rockefeller"));
        group.add(new Student("Steve Jobs"));
        group.add(new Student("Henry Ford"));
        group.add(new Student("Tyler Durden"));
        group.add(new Student("Luke Skywalker"));
        return group;
    }

    private StudentsGroup getStudents() {
        return students;
    }

    public List<String> getDataMode1(){
        List<String> data = new ArrayList<>();

        List<Student> group = getStudents().getStudents();
        for(Student student: group){
            String line = "";
            line += student.getNameStudent() + " class attendance - " + student.getAttendancePercentage() + "%";
            data.add(line);
        }
        return data;
    }

    public List<String> getDataMode2(){
        return sortedStudentsMode2(getStudents().getStudents());
    }

    private List<String> sortedStudentsMode2(List<Student> group){
        Map<String, Float> data = new HashMap<>();
        List<String> sortedGroup = new ArrayList<>();
        int count = group.size();

        for(Student student: group)
            data.put(student.getNameStudent(), student.getAttendancePercentage());

        while(count != 0){
            String bestStudent = "";
            float grade = 0;
            for(String name: data.keySet()){
                if(data.get(name) > grade)
                {
                    bestStudent = name;
                    grade = data.get(name);
                }
            }
            sortedGroup.add(bestStudent + " class attendance - " +  grade + "%");
            data.remove(bestStudent);
            count--;
        }
        return sortedGroup;
    }

    public List<String> getDataMode3(){
        List<Student> group = getStudents().getStudents();
        Map<String, Float> data = new HashMap<>();
        List<String> sortedGroup = new ArrayList<>();

        for(Student student: group)
            data.put(student.getNameStudent(), student.getAttendancePercentage());

        for(String name: data.keySet()){
            if(data.get(name) < 25)
            {
                sortedGroup.add(name + " class attendance - " +  data.get(name) + "%");
            }
            
        }
        if(sortedGroup.size() == 0) sortedGroup.add("Таких студентов нет");
        return sortedGroup;
    }
    
    @Override
    public String toString() {
        return students.toString();
    }

}
