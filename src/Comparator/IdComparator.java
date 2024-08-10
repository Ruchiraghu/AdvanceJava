package Comparator;

import java.util.*;

public class IdComparator implements Comparator<Employee>{

    public int compare(Employee e1, Employee e2) {
//        if(e1.empId==e2.empId){
//            return 0;
//        } else if (e1.empId> e2.empId) {
//            return 1;
//        }
//        else {
//            return -1;
//        }
        return Integer.compare(e1.empId, e2.empId);
    }

}
