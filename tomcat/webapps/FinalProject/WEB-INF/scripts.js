function validate(){
    if (document.loginForm.Username.value == "" ) {
        alert( "Please provide your email!" ); 
        document.loginForm.Username.focus(); 
        return false;
    }

    if (document.loginForm.Password.value == "" ) {
        alert( "Please provide your Password!" ); 
        document.loginForm.Password.focus(); 
        return false;
    }
    return( true );
}