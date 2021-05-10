function CheckandSubmit () 
  {
  var userName = document.getElementById ("exampleInputEmail3");
  if (userName.value.length < 3) 
     { 
     alert ("Email must be at least 3 characters in length!");
     return false;
     }
  var password = document.getElementById ("exampleInputPassword3");
  if (password.value.length < 6) 
     {
     alert ("Password must be at least 6 characters in length!");
     return false;
     }
  return true;
  }
