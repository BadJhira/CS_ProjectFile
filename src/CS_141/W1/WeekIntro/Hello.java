package CS_141.W1.WeekIntro;

public class Hello {
    public static void main(String[] args){
        // single line comment
        System.out.println("Hello World!");
        System.out.println();
        /* Multiple line comment
        Even more comment */
        System.out.println("This is a \"third\" line of code.");
        System.out.println(5);
        System.out.println("Making a \nnew line within the string");
        System.out.println("Inserting a \ttab within the string");
        System.out.println("\\hello\nhow \tare \"you\"?\\\\");
        System.out.println("/ \\ // \\\\ /// \\\\\\");
        System.out.println("\"Four score and seven years ago,\nour 'fore fathers' brought forth on\nthis continent a new nation.\"");
        Hello.fancyHello();
        Hello.fancyHello();
        Hello.fancyHello();
   }

    public static void topLine() {
        System.out.println("///*************\\\\\\");
   }

    public static void midLine() {
        System.out.println("||| hello world |||");
   }

    public static void botLine() {
        System.out.println("\\\\\\*************///");
   }

    public static void fancyHello() {
        Hello.topLine();
        Hello.midLine();
        Hello.botLine();
   }

}
