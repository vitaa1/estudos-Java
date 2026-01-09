package maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serial;
    private String marca;

    public Smartphone(String serial, String marca) {
        this.serial = serial;
        this.marca = marca;
    }
    // reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simetrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x, y, z diferentes de null, se x.equals(y) == true,e x.equals(z) == true logo y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false;

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serial != null && serial.equals(smartphone.serial);
    }

    // SE X.equals(y) == true, y.hashCode(x) == x.hashCode()
    // y.hashcode() == x.hashCode() nao necessariamente o equals de y.equals(x) tem que ser true
    // x.equals(y) == false
    // y.hashCode() !=  x.hashCode() x.equals(y) devera ser false
    // hashCode vai ser um numero que vai ser gerado, de preferencia ele tem que ser unico para os objetos
    // quando voce implementa o hashCode ele tem que dar match com o equals
    @Override
    public int hashCode() {
        return serial == null ? 0 : this.serial.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
