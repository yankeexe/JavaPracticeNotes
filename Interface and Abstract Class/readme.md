# Interface
* Interface is basically a replacement for for extending classes since we can implement as many interfaces as we want in a Class. 
* Interface basically has two main components
    - Constants (By default)
    - Methods (They do not have data type)
* When we implement the **Interface** to a class then we need to define all the **methods** of the Interface.

# Abstract
* It is any class having one or more abstract methods.
* Abstract is similar to Interface. The difference: Not all methods need to be over-ridden; common methods can be defined within the Abstract class itself.
* Objects of Abstract classes cannot be made. It can only be inherited.
* If one or more method is declared abstract, its class must also be abstract.
* When we extend an Abstract Class to a Class, we need to define all the **methods** defined in the Abstract Class else the derived class again should be Abstract. 
* It can have final methods i.e. methods that cannot be over-ridden.
