public class DifferentScopes {
    
    int instanceVariable = 10;
    double instancevariableDouble = 1.0;
    String instanceVariableString = "This is a string";

    static int instanceVariableStatic = 20;

    public void showLocalVariable() {
        String localStringVariables = "Finish!";
        int localVariable = 30;
        System.out.println("My local variable is : " + localVariable + " "+ localStringVariables);
    }

    public static void main(String[] args) {
        DifferentScopes example = new DifferentScopes();
        example.showLocalVariable();
        System.out.println("My local variable is : " + example.instanceVariable + " "+ example.instanceVariableString);
    }

        
    }