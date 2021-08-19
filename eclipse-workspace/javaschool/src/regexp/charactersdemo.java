package regexp;
import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class charactersdemo {

private static final String REGEX = "a";

private static final String INPUT = "dbcabcabc";

public static void main(String[] args) {

// create a pattern

Pattern pattern = Pattern.compile(REGEX);

// get a matcher object

Matcher matcher = pattern.matcher(INPUT);

if(matcher.find()) {

//Prints the start index of the match.

System.out.println("Match String start(): "+matcher.start());

//Prints the end index of the match.

System.out.println("Match String end(): "+matcher.end());

//print the matched subsequence

System.out.println("Match String group(): "+matcher.group());

}

}

}