package com.amigoscode.examples;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class GettingStarted {

    @Test
    public void imperativeApproach() throws IOException {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        List<Person> people = MockData.getPeople();
        //System.out.println(""+ List.of(people));
//        people.stream()
//                .filter(p->p.getAge()<=18)
//                .limit(10)
//                .collect(Collectors.toList())
//                .forEach(p->System.out.println(p));
    }


    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person> people = MockData.getPeople();
        people.stream()
                .filter(p->p.getAge()<=18)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(p->System.out.println(p));
    }
}
