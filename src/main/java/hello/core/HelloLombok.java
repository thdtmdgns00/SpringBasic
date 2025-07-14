package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok lb = new HelloLombok();
        lb.setName("asss");

        String name = lb.getName();

    }
}
