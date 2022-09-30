public class Padre extends Abuelo {

    String CI;

    public Padre(String nombre, String primerApellido, String segundoApellido, String CI) {
        super(nombre, primerApellido, segundoApellido);
        this.CI = CI;
    }



    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    @Override
    public String toString() {
        return "Padre{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", CI='" + CI + '\'' +
                '}';
    }
}
