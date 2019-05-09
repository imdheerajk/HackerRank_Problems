import java.util.*;

//Complete the code
public class Comparator_sort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);


            testCases--;
        }

        Collections.sort(studentList, new CgpaComparator().thenComparing(new NameComparator()).thenComparing(new IdComparator()));

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



