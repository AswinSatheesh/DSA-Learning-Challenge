class Student{
    public int roll_no;
    public String name;
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ArrayObjectsEx2 {
    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[5];

        arr[0] = new Student(1,"Aswin");
        arr[1] = new Student(2,"Kannan");
        arr[2] = new Student(3, "Ambu");
        arr[3] = new Student(4, "Achu");
        arr[4] = new Student(5, "Appu");

        for (int i = 0; i < arr.length; i++){
            System.out.println("Roll no " + arr[i].roll_no + ", Name is : " + arr[i].name);
        }

    }
}
