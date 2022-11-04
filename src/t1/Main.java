package t1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        //read values from keyboard here
        String key;
        while (true) {
            key = reader.readLine();
            boolean u = key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("programmer");
            if (!u) break;

            switch (key) {
                case "user" -> person = new Person.User();
                case "loser" -> person = new Person.Loser();
                case "coder" -> person = new Person.Coder();
                case "programmer" -> person = new Person.Programmer();
            }
            doWork(person);
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User user) {
            user.live();
        } else if (person instanceof Person.Loser loser) {
            loser.doNothing();
        } else if (person instanceof Person.Coder coder) {
            coder.writeCode();
        } else if (person instanceof Person.Programmer programmer) {
            programmer.enjoy();
        }
    }
}
