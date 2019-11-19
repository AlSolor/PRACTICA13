public class MainBuilder {

    public static void main (String[] args) {

        // este codigo debe compilar
        Persona madre = new Persona.Builder("Maria")
                .setMunicipio("Selva")
                .setMayor(37, "OXXO")
                .setLugarTrabajo("Google")
                .build();

        Persona hijo = new Persona.Builder("Pedro")
                .setMenor(4, "Bacho 7")
                .setColegio("Colegio de Selva")
                .build();
    }
}
