```scala
class MyClass(val value: Int) {
  def +(other: MyClass): MyClass = new MyClass(this.value + other.value)
}

val a = new MyClass(5)
val b = new MyClass(10)
val c = a + b
println(c.value) // Output: 15

// The following code compiles and runs without error but produces an unexpected result:
class MyOtherClass(val value: Int) {
  def +(other: MyOtherClass): MyOtherClass = new MyOtherClass(this.value - other.value) // Note the subtraction here
}

val x = new MyOtherClass(5)
val y = new MyOtherClass(10)
val z = x + y
println(z.value) // Output: -5
```