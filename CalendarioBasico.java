public class CalendarioBasico{
    private int dia;
    private int mes;
    private int ano;
    
    public CalendarioBasico(){
        dia = 1;
        mes = 1;
        ano = 1;
    }
    
    public String obtenerFecha(){
        String diaNuevo = "" + dia;
        if ( dia < 10){
            diaNuevo = "0" + dia;
        }
        String mesNuevo = "" + mes;
        if (mes < 10){
            mesNuevo = "0" + mes;
        }
        String anoNuevo = "" + ano;
        if ( ano < 10){
            anoNuevo = "0" + ano;
        }
        String fechaObtenida = diaNuevo + "-" + mesNuevo + "-" + anoNuevo;
        return fechaObtenida;
        }
        
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
    
    public void avanzarFecha(){
        dia +=1;
    if (dia > 30){
        dia = 1;
        mes +=1;
        if (mes > 12){
            mes = 1;
            ano +=1;
            if ( ano > 99){
                ano = 01;
            }
        }
    }
    }
}