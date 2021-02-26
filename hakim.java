import java.util.*;
import java.util.stream.Collectors;
/*
source---array,collection,generator,function,I/O,channel etc.
intermidate operations(op-1---op-n) iterate over and process these chunks in parallel........
stateless--map(),filter(),unsorted(),peek(),mapToInt()
statefull---distinct(),sorted(),limit()
each intermidate operation creates a new stream but does not iterate elements and performs operations
until the terminal operation is invoked-------stream lazy operation

terminal operation
min(),max(),sum(),count(),average(),reduce(),collect(),foreach,toArray,anymatch,allmatch,nonmatch,findfirst,findany
 */


//map --->salr increase 5000
public class EmplMain {
    public static void main (String args[]){

        List<Employee> employeeList= Arrays.asList(
                new Employee(1,"Yeshital","wende",25,10000),
                new Employee(2,"hakim","muze",35,15000),
                new Employee(3,"Mengi","beti",45,25000),
                new Employee(4,"dagne","Sara",50,35000),
                new Employee(5,"Helen","belay",25,10000),
                new Employee(6,"Melkam","Aster",28,15000),
                new Employee(7,"Beki","Bisrat",45,25000),
                new Employee(7,"Beki","zola",24,25000),
                new Employee(8,"Yirge","Moha",22,35000));
        employeeList.forEach(x->System.out.println(x));

      List<String> listfilEmp=employeeList.stream()
                    .filter(e->e.getAge()>35)
                    .map(Employee::getFirstName)
                    .collect(Collectors.toList());

        listfilEmp.forEach(Name->System.out.println(Name);


    }
}

