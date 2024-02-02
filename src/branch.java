public class branch {
    private static String university_name;
    private static String college_name;

    private String student_name;
    private String student_roll;

    private String student_dept;

    public void Studentobject(String student_name,String student_dept,String student_roll)
    {
        this.student_name=student_name;
        this.student_dept=student_dept;
        this.student_roll=student_roll;

    }
    static
    {
        university_name="SRM University";
        college_name="SDM_IT";
    }
    public static void main(String args[])

    {
        branch b=new branch();
        b.Studentobject("sharath","CS","201819");
        System.out.println("Student univeristy="+university_name+" "+"Student college="+college_name+" "+"Student name="+
                b.student_name+" "+"student dept="+b.student_dept+" "+"student roll="+ b.student_roll);

        b.Studentobject("prakash","CIVIL","637733");
        System.out.println("Student univeristy="+university_name+" "+"Student college="+college_name+" "+"Student name="+
                b.student_name+" "+"student dept="+b.student_dept+" "+"student roll="+ b.student_roll);
    }
}
