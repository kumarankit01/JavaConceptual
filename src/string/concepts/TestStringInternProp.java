/*
 * Java automatically interns String literals i.e whatever is within "". This means that in many cases, 
 * the == operator appears to work for Strings in the same way that it does for 
 * ints or other primitive values.Since interning is automatic for String literals, 
 * the intern() method is to be used on Strings constructed with new String()
 * 
 * This example illustrates six points:

Literal strings within the same class (§8) in the same package (§7) represent references to the same String object (§4.3.1).

Literal strings within different classes in the same package represent references to the same String object.

Literal strings within different classes in different packages likewise represent references to the same String object.

Strings computed by constant expressions (§15.28) are computed at compile time and then treated as if they were literals.

Strings computed by concatenation at run time are newly created and therefore distinct.

The result of explicitly interning a computed string is the same string as any pre-existing literal string with the same contents.

 */


package string.concepts;

class TestStringInternProp {
    public static void main(String[] args) {
    	
        String hello = "Hello", lo = "lo";
        System.out.print((hello == "Hello") + " "); //true
        System.out.print((Other.hello == hello) + " "); // true
        System.out.print((other.Other.hello == hello) + " "); // true
        System.out.print((hello == ("Hel"+"lo")) + " "); //true
        System.out.print((hello == ("Hel"+lo)) + " ");//false
        System.out.println(hello == ("Hel"+lo).intern()); // true
        
        //------------ new creates new String ---------//
        
        String s1 = "Rakesh";
        String s2 = "Rakesh";
        String s3 = "Rakesh".intern();
        String s4 = new String("Rakesh");
        String s5 = new String("Rakesh").intern();

        if ( s1 == s2 ){
            System.out.println("s1 and s2 are same");  // 1.
        }

        if ( s1 == s3 ){
            System.out.println("s1 and s3 are same" );  // 2.
        }

        if ( s1 == s4 ){
            System.out.println("s1 and s4 are same" );  // 3.
        }

        if ( s1 == s5 ){
            System.out.println("s1 and s5 are same" );  // 4.
        }
    }
}
class Other { static String hello = "Hello"; }