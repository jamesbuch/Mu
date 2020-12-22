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
