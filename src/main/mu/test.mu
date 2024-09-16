a: integer = 9

println($"Global scope a = #{a}")

func myfunction(i: integer, j: integer): void
  println("This is a function")

  a: integer = 10
  b: integer = 50
  c: integer = 0

  c = a + b + i * 2 + j * 3
  println($"The #{a} + #{b} + #{i} * 2 + #{j} * 3 = #{c}")
end

println($"Global scope a = #{a}")

foo: string = "foobarbazqux"
bar: integer = 1
baz: boolean = true

println($"a = #{a} foo = #{foo} bar = #{bar} baz = #{baz}")

myfunction(1000, 50000)

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

rc: integer = f(10, 20)

println($"Sum from f() = #{rc}")

rc = f(100, 1000)
println($"Sum from f() = #{rc}")

if "mail@server.com" =~ "[a-z0-9]+@[a-z0-9]+\.[a-z]{2,}" then
  println("The regex matches")
else
  println("I expected it to match but it did not")
end if

