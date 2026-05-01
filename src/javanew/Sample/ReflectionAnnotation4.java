package javanew.Sample;

public class ReflectionAnnotation4 {
	public static void main(String[] args) {
		String text = "Hello Java";
		
		String className = text.getClass().getName();
		
		System.out.println("完全修飾名:" + className);
	}

}


