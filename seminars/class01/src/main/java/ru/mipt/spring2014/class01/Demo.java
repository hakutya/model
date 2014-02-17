
package ru.mipt.spring2014.class01;

public class Demo
{

	public static void main (String[] args)
	{

		ComplexNumber c1 = new ComplexNumber (5, 3), c2 = new ComplexNumber (5, 3), c3 = new ComplexNumber (3, 3);

		System.out.println ("1 и 2" + ((c1.equals (c2)) ? " Равны" : " Не равны"));
		System.out.println ("1 и 3" + ((c1.equals (c3)) ? " Равны" : " Не равны"));
		System.out.println ("3 и 2" + ((c3.equals (c2)) ? " Равны" : " Не равны"));

	}
}
