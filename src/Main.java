public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(28);
        cliente.setNombre("Carlos");
        cliente.setTelefono(75455456);
        cliente.setCredito(400000);
        System.out.println("El cliente "+cliente.getNombre()+" tiene "+cliente.getEdad()+" años con número de teléfono "+cliente.getTelefono()+" y solicitó un crédito de "+cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(20);
        trabajador.setNombre("Fernando");
        trabajador.setTelefono(75454521);
        trabajador.setSalario(354000);
        System.out.println("El trabajador "+trabajador.getNombre()+" tiene "+trabajador.getEdad()+" años con número de teléfono "+trabajador.getTelefono()+" tiene un salario de "+trabajador.getSalario());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    private int credito;
    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    int salario;
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}