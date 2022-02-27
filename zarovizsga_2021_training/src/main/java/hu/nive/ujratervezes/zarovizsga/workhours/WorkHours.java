package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WorkHours {

    public String minWork(String file) {
        List<Person> people = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Path.of(file))) {
            while (br.ready()) {
                String line = br.readLine();
                String[] fields = line.split(",");
                people.add(new Person(fields[0], Integer.parseInt(fields[1]), fields[2]));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot find file");
        }
        return people.stream().sorted().findFirst().orElseThrow(() -> new IllegalArgumentException("No person is the list")).toString();
//        return "John Doe: 2021-01-04";
    }
}
