String alphabeticShift(String inputString) {
    char [] letras = inputString.toCharArray();
    for ( int i = 0; i < letras.length; i++ ){
        if ( letras[ i ] != 'z' ){
            letras[ i ]++;
        } else {
            letras[ i ] = 'a';
        }
    }

    return String.valueOf( letras );
}
