Mu
==

A small expression parser, using ANTLR 4. It supports most basic operators
and `for`-, `while`- and `log`- (print) statements. It is just a basic
demonstration of how to use the `-visitor` functionality of ANTLR 4.

To run [the demo script](https://github.com/bkiers/Mu/blob/master/src/main/mu/test.mu):

Mu has string interpolation with the dollar sign prepended to a string, for
example `log $"Variable is {varName}";`

```
n = 9;
m = true;

foo = "foo";
bar = 1;
baz = true;

log $"foo = {foo} bar = {bar} baz = {baz}";

unless !m log $ "m is {m}";

while n > 0 {

  # expressions can be surrounded by parenthesis, of course
  if (n % 2 == 0) {
    log $ "{n} -> even";
  }
  else {
    log $ "{n} -> odd";
  }

  n = n - 1;
}

unless n == 0 log "n is not 0";
```

do:

```
git clone git://github.com/bkiers/Mu.git
mvn clean install
mvn -q exec:java
```

which will print the following to your console:

```
9.0 -> odd
8.0 -> even
7.0 -> odd
6.0 -> even
5.0 -> odd
4.0 -> even
3.0 -> odd
2.0 -> even
1.0 -> odd
```

Also see [this stackoverflow Q&A](http://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners).
