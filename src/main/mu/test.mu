n = 9;
m = true;

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
