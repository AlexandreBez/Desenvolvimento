package Aula2.Obras.src;

public class Engenheiro extends Pedreiro{
    
    private String crc;

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    @Override
    public String toString() {
        return "Engenheiro [crc=" + crc + "]";
    }
    
}
