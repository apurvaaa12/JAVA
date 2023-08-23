import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filter {

    public static void main(String[] args){
        List<String> names= Arrays.asList("Apurva","bunny","cat","dog","monkey","elephant","Jayesh");
//        Arrays.sort(new List[]{names});
//        names.stream()
//                .filter(name->!name.equals("elephant"))
//                .forEach(name->System.out.println(name));
        names.stream().map(u->u.replace("Apurva","apu")).forEach(System.out::println);


        names.stream().filter(name->names.contains("Jayesh"))
                .forEach(System.out::println);

    }




}
