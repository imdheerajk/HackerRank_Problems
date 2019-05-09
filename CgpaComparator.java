import java.util.Comparator;

public class CgpaComparator implements Comparator {

    public int compare(Object o1,Object o2)
    {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if(s2.getCgpa() == s1.getCgpa())
        {
            return 0;
        }
        else if(s2.getCgpa() > s1.getCgpa())
        {
            return 1;
        }
        else
            return -1;

    }

}
