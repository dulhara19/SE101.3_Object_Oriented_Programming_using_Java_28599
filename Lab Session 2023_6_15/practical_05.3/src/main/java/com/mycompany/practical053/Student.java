
package com.mycompany.practical053;

final class Student  
{
    final int marks =100;
    final void display();
}

/*
1.
The "final" keyword is used incorrectly in the class declaration.The "final" keyword can only be applied to a class to 
indicate that it cannot be extended by other classes. In the given code, the "final" keyword is used before the "class" keyword,
which is not allowed.

2.The "display()" method declaration ends with a semicolon, which is not valid syntax for a method. Methods should have a body
enclosed within curly braces {}.

3.The class named "Undergraduate" is defined inside the "Student" class. If you want to define an inner class, it should be
declared within the outer class. In this case, the "Undergraduate" class should be declared outside the "Student" class.
*/