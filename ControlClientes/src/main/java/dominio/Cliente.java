package dominio;

public class Cliente {
    private int id_cliente;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private double saldo;

    //CONSTRUCTORES
    
    public Cliente() {
    }

    public Cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente(String nombre, String apellido, String email, String telefono, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public Cliente(int id_cliente, String nombre, String apellido, String email, String telefono, double saldo) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }
    
    //GETTER AND SETTER

    public int getId_cliente() {
        return this.id_cliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //TO STRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ");
        sb.append("\nId_cliente: ").append(id_cliente);
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nApellido: ").append(apellido);
        sb.append("\nEmail: ").append(email);
        sb.append("\nTelefono: ").append(telefono);
        sb.append("\nSaldo: ").append(saldo);
        sb.append('}');
        return sb.toString();
    }
    
    

    
    
    
    
}
