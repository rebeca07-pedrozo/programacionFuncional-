package com.platzi.functional._15_streams_intro;
import com.platzi.functional._06_reference_operator.NombresUtils;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList(
                "Java",
                "FrontEnd",
                "Backend",
                 "FullStack");
        for(String course: courseList){
            String newCourseName = course.toLowerCase().replace("!", "!!");
            System.out.println("Platzi: " + newCourseName);
        }
        Stream<String> coursesStream = Stream.of("Java",
                "FrontEnd",
                "Backend",
                "FullStack");
        //Stream<Integer>courseLenghtStream = coursesStream.map(course -> course.length());
        //Optional<Integer> longest = courseLenghtStream.max((x, y) -> y-x);
        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
        Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("java"));
        justJavaCourses.forEach(System.out::println);
    }
}
