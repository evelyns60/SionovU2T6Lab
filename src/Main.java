public class Main {
    public static void main (String[] args) {

      /*  System.out.println("Cows say \"moo\"!");
        System.out.println("Brooklyn Tech \n29 Ft. Greene\nBrooklyn");
        System.out.println("An \"i\"\nfor\nan eye");
        System.out.println("The string \"\"\nis an empty string.");
        System.out.println("The escape sequence for \\ is \\\\");
        System.out.println("The escape sequence for \" is \\\"");
        System.out.println("Use \"\\n\" \nfor a new line.");
        System.out.println("My favorite punctuation mark is \"\\\"");
        System.out.println("Now I know my\n A\n  B\n   C's");
        System.out.println ("¯\\_(\"\\)_/¯");
        System.out.println("Dear Jen,\nYou got an \"A\"!\nSincerely,\nThe teacher.");
        System.out.println(" * *\n* * *\n * *");
        System.out.println("Define the word \"balance\".\nHint: it is  a synonym for equilibrium \\ stability/");


        BabyParrot baby = new BabyParrot("Toucan", 3, 4.25);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo(); // store returned string in variable
        System.out.println(info);        // print the returned string

        */

        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());


    }
}
