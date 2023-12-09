public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Lívia", 120433);
        Medico m1 = new Medico("Breno", 1223);
        Consulta consulta = m1.agendarConsulta("10/10/2023", "10:30", p1);

        m1.exibirInfo();

        m1.cancelarConsulta(consulta);

        m1.exibirInfo();
    }

}