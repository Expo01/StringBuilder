public class Main {
    public static void main(String[] args) {
        //string is immutable. Each method call returns new instance of a string
        //StringBuilder is a mutable Class for creating 'strings'
        //four ways to build a string: pass a string, pass no arg, pass int, pass other type of character sequence like stringbuilder

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");
        //when .concat used, it creates another object in memory for 'and Goodbye' such that the original hello
        //world value is not a mutable object. To get the new string.length of helloWorld, we must assign the .concat
        //method result as a variable

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        //String build cannot be directly assigned to string value, new object must be created
        helloWorldBuilder.append(" and Goodbye");
        //stringBuilder objects are mutable such that the existing memory is changed and no new object/variable/memory location needed

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder(); //default capacity of 16 but still is empty
        StringBuilder emptyStart32 = new StringBuilder(32); //defined capacity but still empty
        printInformation(emptyStart);
        printInformation(emptyStart32);

        emptyStart.append("a".repeat(17)); //when object assigned to have value greater than the
            // default, the capacity automatically changes
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");
        builderPlus.deleteCharAt(16).insert(16,'g'); //method chaining. deletes char at index then inserts char at index
        builderPlus.replace(16,17,"G"); // index 17 is exclusive, not inclusive
        builderPlus.reverse().setLength(7); //reverses the content and again uses method chaining to truncate the assigned text to 7 places
        System.out.println(builderPlus);
    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}