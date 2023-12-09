public class Consulta {
    String data;
    String hora;
    Paciente paciente;

    public Consulta(String data, String hora, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String toString(){
        return "Data: " + getData() + "Hora: " + getHora();
    }


}
