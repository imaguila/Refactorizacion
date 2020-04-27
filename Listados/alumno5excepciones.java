//...
try {
    numeroPruebas = Integer.valueOf(input.trim());
}
catch(Exception e) {
    throw new RuntimeException("Valor no valido para numero de casos");
}
//...
try {
    datos = input.split(" ");
    burrosDisponibles = Integer.valueOf(datos[0]);
    cantidadSacos = Integer.valueOf(datos[1]);
}
catch(Exception e) {
    throw new RuntimeException("Valores no validos");
}
//...
try {
    datos = input.split(" ");
    for(int saco = 0; saco < datos.length; saco++) {
        pesosSacos.add(Integer.valueOf(datos[saco]));
    }
}
catch(Exception e) {
    throw new RuntimeException("Valores no v�lidos");
}
//...