import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class SetStructures {

    public static void main(String[] args) {

        // Set (Interface):
        // 'Set' is an interface in Java that does NOT contain duplicate elements. It does not
        // guarantee any specific order of elements. We cannot directly instantiate an interface.
        // Only with his concrete implementations, like HashSet or EnumSet.
        System.out.println("--- Demonstrating Set (Interface) ---");
        System.out.println("Set is an interface; it cannot be instantiated directly.");
        System.out.println("It defines the behavior for collections that do not allow duplicates.\n");

        // TODO: HashSet (Set Implementation) and
        //  EnumSet (Set Implementation for Enums)

    }
}