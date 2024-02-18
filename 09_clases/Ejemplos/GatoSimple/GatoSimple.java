package GatoSimple;

public class GatoSimple {

    // atributos ////////
    String color, raza, sexo;
    int edad;
    double peso;

    // metodos ////////

    // constructor
    GatoSimple(String sexo) {
        this.sexo = sexo;
    }

    //getter
    String getSexo(){
        return this.sexo;
    }
}
