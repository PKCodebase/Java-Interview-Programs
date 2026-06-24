package kaushik;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

    public static void main(String []args){
        List<Employee> employeeList = List.of(
                new Employee("Priya",20),
                new Employee("Raj",30),
                new Employee("Ravi",19)
        );
       Map<String,Integer> collect = employeeList.stream()
                .collect(
                        Collectors.toMap(
                                Employee::getName,
                                Employee::getAge
                        )
                );
         System.out.println(collect);
    }
}
