public class NullPointer3 {
    
    public static void main(String[] args)
    {
        String str = null;

        // System.out.println(str.toUpperCase()); //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "<local1>" is null
        // at NullPointer3.main(NullPointer3.java:7)

        
        try
        {
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Can't be Casted ");
        }
    }
}
