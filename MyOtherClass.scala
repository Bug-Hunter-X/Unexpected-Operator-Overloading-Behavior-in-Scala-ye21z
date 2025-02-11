```scala
//Improved Design:
//It is better to avoid overloading the operator if its behavior differs significantly from the typical meaning. Instead, use a more descriptive method name.
class MyClass(val value: Int) {
  def add(other: MyClass): MyClass = new MyClass(this.value + other.value)
}

val a = new MyClass(5)
val b = new MyClass(10)
val c = a.add(b)
println(c.value) // Output: 15

class MyOtherClass(val value: Int) {
  def subtract(other: MyOtherClass): MyOtherClass = new MyOtherClass(this.value - other.value)
}

val x = new MyOtherClass(5)
val y = new MyOtherClass(10)
val z = x.subtract(y)
println(z.value) // Output: -5
```