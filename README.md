# Unexpected Operator Overloading Behavior in Scala

This example demonstrates a potential pitfall in Scala when overloading operators. While operator overloading offers concise syntax, it is crucial to ensure consistent and predictable behavior to prevent unexpected results.

## The Issue

The code defines two classes, `MyClass` and `MyOtherClass`, both overloading the `+` operator. However, the overloaded operator performs addition in `MyClass` and subtraction in `MyOtherClass`. This inconsistency can lead to confusion and difficult-to-debug issues when used interchangeably.

## Solution

The solution involves careful consideration of operator overloading and maintaining consistency in the operator's behavior across classes. If possible, only overload operators where their standard mathematical or logical meaning can be intuitively applied.

## Reproduction

1. Save the code in two separate `.scala` files (MyClass.scala and MyOtherClass.scala). 
2. Compile and run each file. Observe the outputs for both classes, noting the difference in how the `+` operator behaves.