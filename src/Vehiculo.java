public class Vehiculo {
    private String modelo;
    private String num_motor;
    private String serial;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String num_motor, String serial) {
        this.modelo = modelo;
        this.num_motor = num_motor;
        this.serial = serial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(String num_motor) {
        this.num_motor = num_motor;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", num_motor='" + num_motor + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }

    public void arrancar (){
        System.out.println("Soy carro y arranco");
    }

}
