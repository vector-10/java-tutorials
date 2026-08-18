

//Object oriented Programming
// There are 4 core concepts in OOP: encapsulation, inheritance, polymorphism and abstraction
// Encapsulation: This hides the implementation details from users, it can be achived through public and private methods in Java
//The implementation below hides the balance variable enabling access to it only through
// the deposit method which validates the amount before modifying the variable

//    class BankAccount {
//        private double balance = 0;
//        public void deposit(double amount) {
//            if (amount>0) {
//                balance += amount;
//            }
//        }
//    }

//Inheritance is the process that enables one class to acquire the properties of another one
// With inheritance information is placed in a more manageable, hierachical order. The claass inheriting the properties of another is the subclass
// The class passing on the properties to another is called the superclass or parentclass
//    class Animal {
//        public void makeSound() {
//            System.out.println("Hi");
//        }
//    }
//    class Dog extends Animal {
//    }
//    class A {
//        public static void main (String[] args ) {
//            Dog dog = new Dog();
//            dog.makeSound();
//        }
//    }


//Polymorphism refers to the idea of having many forms,it occurs when there is a hierarchy of classes related to each other through inheritance
//A call to a member method will cause a different implementation to be executed, depending on the type of the object invoking the method
//When methods have the same name but different parameters, it is called method overloading
class Program {
    static double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(8, 17));
        System.out.println(max(3.14, 7.68));
    }

}

//Abstraction provides the outside world with only essential information,
// in a process of representing essential features without including implementation details


