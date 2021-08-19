package regexp;
class removenonalp {
	  
    // Function to remove non-alphanumeric
    // characters from string
    public static String
      removeNonAlphanumeric(String str)
    {
        // replace the given string
        // with empty string
        // except the pattern "[^a-zA-Z0-9]"
        str = str.replaceAll(
          "[^a-zA-Z0-9]", "");
  
        // return string
        return str;
    }
  
    public static void main(String args[])
    {
  
        // Test Case 1:
        String str1 
          = "test_ one@123";
        System.out.println(
          removeNonAlphanumeric(str1));
  
        // Test Case 2:
        String str2 
          = "test_two@123";
        System.out.println(
          removeNonAlphanumeric(str2));
  
        // Test Case 3:
        String str3 
          = "test_tthree$@123";
        System.out.println(
          removeNonAlphanumeric(str3));
    }
}