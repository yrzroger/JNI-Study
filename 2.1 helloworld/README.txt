Java应用程序使用JNI调用native方法的步骤：

1. 创建Java类（HelloWorld.java）并在类中使用关键字native声明native方法；

2. 使用javac命令编译HelloWorld.java源文件，生成HelloWorld.class文件：
    javac HelloWorld.java
	
3. 使用javah命令生成含有native 方法函数原型的头文件HelloWorld.h;

4. 根据native方法原型，写作HelloWorld.cpp实现native方法功能；
    javah -jni HelloWorld
	
	
5. 编译c++源文件，得到HelloWorld.dll动态链接库：
	// Windows平台Visual Studio编译： 
	// cl -I "E:\Program Files\Android\Android Studio\jre\include" -I "E:\Program Files\Android\Android Studio\jre\include\win32"  -LD HelloWorld.cpp -FeHelloWorld.dll
	// 解析：
	// cl : visual C++ 编译指令
	// -I ：添加要检索头文件的目录路径
	// -LD ：创建DLL动态链接库
	// -Fe ：指定编译结果文件名称
	
6. 运行HelloWorld验证
	java HelloWorld
	
7. 可以看到如下的输出字符
    Hello World!





