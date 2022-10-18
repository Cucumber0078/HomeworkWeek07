package homeworkweek7_ashish;

public class ArrayAndStringArrayProgramme17 {
    public static void main(String[] args) {
        // int a=10;
        // int b=20;
        // int c=30;

        //int x[] ;
        // String name[];
        int x[] = {30, 40, 50, 60, 70};
        //Approach 2
        int a[] = new int[5];
        a[0] = 30;
        a[1] = 40;
        a[2] = 50;
        a[4] = 60;
        System.out.println(a[2]);
        System.out.println(a[0]);
        System.out.println(x[3]);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);


        }

        String[] name = {"java", "Paython", "PHR "};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }


    }}





