interface FirstInterface {
  	public void JavaLang(); 		// interface method
}

interface SecondInterface {
  	public void PythonLang(); 		// interface method
}

// Languages "implements" FirstInterface and SecondInterface


class Languages implements FirstInterface, SecondInterface {
  	public void JavaLang() {
    		System.out.println("Java is used to build large enterprise class applications.");
  	}
  	public void PythonLang() {
    		System.out.println("Python is a general-purpose coding language—which means that, unlike HTML, CSS, and JavaScript, it can be used for other types of programming and software development besides web development.");
  	}
}

class MultipleInterfaceEx1 {
  	public static void main(String[] args) {
    		Languages lang = new Languages();
    		lang.JavaLang();
    		lang.PythonLang();
  	}
}