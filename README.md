Mu
==

A small interpreted language, using ANTLR 4. It supports most basic operators
and decision and control structures, has variable scoping, and functions. Variables
can have the types integer, float, string, boolean and for functions, these
types as well as void.

Mu has string interpolation with the dollar sign prepended to a string, for
example `println($"Variable is #{varName}");`

It features some built-in utility functions, like print, println, readln, readint,
readfloat, readbool, len, abs, pow and others. Additional helpers cover common
string and math operations—trim, startswith, endswith, contains, sqrt, round,
floor, ceil, min and max—and utility helpers like typeof, isnil and coalesce.

To run [the demo script](https://github.com/jamesbuch/Mu/blob/master/src/main/mu/test.mu):

```
a: integer = 9

println($"Global scope a = #{a}")

func myfunction(i: integer, j: integer): void
  println("This is a function")

  a: integer = 10
  b: integer = 50
  c: integer = 0

  c = a + b + i * 2 + j * 3
  println($"The #{a} + #{b} + #{i} * 2 + #{j} * 3 = #{c}")
  println($"Local scope a = #{a}")
end

foo: string = "foobarbazqux"
bar: integer = 1
baz: boolean = true

println($"a = #{a} foo = #{foo} bar = #{bar} baz = #{baz}")

myfunction(1000, 50000)

println($"Global scope a = #{a}")

j: integer = 0

for j = 1 to 10
  println($"Hello, World j = #{j}")
next

b: integer = 0
while b < 5
  b = b + 1
  println($"The value of b is #{b}")
end

func f(a: integer, b: integer): integer
  println("In function f")
  return a + b
end

rc: integer = f(10, b)

println($"Sum from f() = #{rc}")

rc = f(100, 1000)
println($"Sum from f() = #{rc}")

if "mail@server.com" =~ "[a-z0-9]+@[a-z0-9]+\.[a-z]{2,}" then
  println("The regex matches")
else
  println("I expected it to match but it did not")
end if

name: string = input("Enter your name: ")
nameUpper: string = upper(name)
nameLower: string = lower(name)
nameLength: integer = len(name)
println($"Hello, #{nameUpper}! Your name has #{nameLength} characters.")

print("Enter an integer: ")
x: integer = readint()
print("Enter another integer: ")
y: integer = readint()

print("Enter a floating point number: ")
measurement: float = readfloat()

print("Is the feature enabled (true/false)? ")
active: boolean = readbool()

z: integer = x + y
println($"The sum of #{x} and #{y} is #{z}")
distance: float = abs(x - y)
println($"Absolute difference as float: #{distance}")
power: float = pow(2, 8)
println($"2 ^ 8 = #{power}")
measurementSquared: float = pow(measurement, 2)
println($"Measurement squared = #{measurementSquared}")
println($"Lowercase name: #{nameLower} and active? #{active}")
```

do:

```
git clone git://github.com/jamesbuch/Mu.git
mvn clean install
mvn -q exec:java # Or  java -jar target/mu-0.5.0.jar src/main/mu/test.mu
```

which will print the following to your console:

```
parsing: src/main/mu/test.mu
Global scope a = 9
a = 9 foo = foobarbazqux bar = 1 baz = true
This is a function
The 10 + 50 + 1000 * 2 + 50000 * 3 = 152060
Local scope a = 10
Global scope a = 9
Hello, World j = 1
Hello, World j = 2
Hello, World j = 3
Hello, World j = 4
Hello, World j = 5
Hello, World j = 6
Hello, World j = 7
Hello, World j = 8
Hello, World j = 9
Hello, World j = 10
The value of b is 1
The value of b is 2
The value of b is 3
The value of b is 4
The value of b is 5
In function f
Sum from f() = 15
In function f
Sum from f() = 1100
The regex matches
Enter your name: James
Hello, JAMES! Your name has 5 characters.
Enter an integer: 55
Enter another integer: 23
Enter a floating point number: 3.14159
Is the feature enabled (true/false)? true
The sum of 55 and 23 is 78
Absolute difference as float: 32.0
2 ^ 8 = 256.0
Measurement squared = 9.869587728099999
Lowercase name: james and active? true
```

Also see [this stackoverflow Q&A](http://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners).
