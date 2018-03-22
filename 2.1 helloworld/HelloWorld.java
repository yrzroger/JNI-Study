/**
 * JNI hello world。java application invokes functions writed by c/c++ programming language.
 */

class HelloWorld {
	private native void print();
	
	public static void main(String[] args) {
		new HelloWorld().print();
	}
	
	static {
		System.loadLibrary("HelloWorld");
	}
}