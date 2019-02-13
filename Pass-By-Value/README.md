# Java is Pass-by-Value, Damnit!

http://www.javadude.com/articles/passbyvalue.htm

"In Java, Objects are passed by reference, and primitives are passed by value."

This is half incorrect. Primitives are indeed passed by value; there is no suc thing in Java as a pointer/reference to a primitive.

However, Objects are NOT passed by reference. A correct statement would be Object references are passed by value.

A "Pointer" is a variable that indirectly tracks the location of some piece of data. The value of a pointer is often the memory address of the data you're insterested in.

Java has pointers.

Calling 

foo(d);

passes the value of d to foo(); it does not pass the object that d points to!

In Java, 

Dog d;

is exactly like C++'s

Dog * d;

And using

d.setName("Fifi");

is exactly like C++'s

d->setName("Fifi");

Java works exactly like C. You can assign a pointer, pass the pointer to a method, follow the pointer in the method and change the data that was pointed to. However you can't change where that pointer points, like in C++, Ada, Pascal and other languages that support pass-by-reference.

If Java had pass-by-reference semantic, the foo method would have changed where myDog was pointing when it assigned someDog on line CCC.

Think of reference parameters as aliases for the variable passed in. When that alias is assigned, so is the variable that was passed in.