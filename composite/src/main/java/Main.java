import components.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Department> allDepts = new ArrayList<>();
        //Component
        HeadDepartment headDept = new HeadDepartment();
        //Components
        headDept.addSubDepartments(new HRDepartment(), new MarketingDepartment());
        //Leaf
        FinanceDepartment finDept = new FinanceDepartment();
        allDepts.add(finDept);
        allDepts.add(headDept);

        callManage(allDepts);
    }

    public static void callManage(List<Department> department){
        department.forEach(Department::manage);
    }
}
