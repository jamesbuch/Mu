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

paddedName: string = "   " + name + "   "
trimmedName: string = trim(paddedName)
println($"Trimmed name '#{trimmedName}' has length #{len(trimmedName)}")
println($"Name starts with 'J'? #{startswith(trimmedName, "J")}")
println($"Name ends with 's'? #{endswith(trimmedName, "s")}")
println($"Name contains 'am'? #{contains(trimmedName, "am")}")

println($"sqrt(81) = #{sqrt(81)}")
println($"round(measurement) = #{round(measurement)}")
println($"floor(measurement) = #{floor(measurement)}")
println($"ceil(measurement) = #{ceil(measurement)}")
println($"min(x, y) = #{min(x, y)}")
println($"max(x, measurement) = #{max(x, measurement)}")

nickname: string = nil
displayName: string = coalesce(nickname, trimmedName)
println($"Display name is #{displayName}")
println($"nickname is nil? #{isnil(nickname)}")
println($"Type of displayName = #{typeof(displayName)}")
