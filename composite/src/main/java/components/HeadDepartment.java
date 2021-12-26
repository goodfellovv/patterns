package components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeadDepartment implements Department {
    List<Department> subDepartments = new ArrayList<>();

    public void addSubDepartments(Department ...departments){
        subDepartments.addAll(Arrays.asList(departments));
    }

    public void removeSubDepartment(int index){
        subDepartments.remove(index);
    }

    public Department getSubDepartment(int index){
        return  subDepartments.get(index);
    }

    @Override
    public void manage() {
        System.out.println("Head department instructed management in sub-departments:");
        subDepartments.forEach(Department::manage);
    }
}
