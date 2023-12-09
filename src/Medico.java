import java.util.ArrayList;

public class Medico {
    String nome;
    int crm;
    ArrayList<Consulta> consultas;
    ArrayList<Paciente> pacientes;

    public Medico(String nome, int crm) {
        this.nome = nome;
        this.crm = crm;
        this.consultas = new ArrayList<>();
        this.pacientes = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String toString(){
        return "Nome: " + getNome() + "CRM: " + getCrm();
    }

    public Consulta agendarConsulta(String data, String hora, Paciente paciente){
        Consulta consulta = new Consulta(data, hora, paciente);
        consultas.add(consulta);
        System.out.println("Consulta agendada com sucesso!");
        return consulta;
    }
    public void cancelarConsulta(Consulta consulta){
        consultas.remove(consulta);
        System.out.println("Consulta cancelada com sucesso!");
    }

    public void exibirInfo(){
        System.out.println("As consultas agendadas para o médico " + getNome() + " são:");
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
            System.out.println("Paciente: " + consulta.getPaciente());
        }
    }
}
