import java.util.*;
class Veiwer{
    int Id;
    String name;
    int roolid;
    String Department;
    Veiwer(int Id,String name,int roolid,String Department){
        this.Id=Id;
        this.name=name;
        this.roolid=roolid;
        this.Department=Department;
    }
}
public class Collections {    

public static void main(String[] args) {
Veiwer vrs=new Veiwer(21,"lakshmi",34,"ECE");
Veiwer vrs1=new Veiwer(23,"sanmugam",34,"ECE");
Veiwer vrs2=new Veiwer(20,"ravi",34,"ECE");
Veiwer vrs3=new Veiwer(22,"murugan",34,"ECE");
List<Veiwer> obj= new ArrayList<>();
obj.add(vrs);
obj.add(vrs1);
obj.add(vrs2);
obj.add(vrs3);
for (Veiwer vei : obj) {
    System.out.println(vei.Id+" "+vei.name+" "+vei.roolid+" "+vei.Department);
}
}
}