package ExceptionHandling;

public class StackOverflow {
public void test1()
{
	test2();
}
public void test2()
{
	test1();
}
}
