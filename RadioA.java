public interface RadioA{
    public boolean encenderApagar();
    public void cambiarVolumen();

    public boolean cambiarFMAM();
    public float cambiarEmisora();
    public void guardarEmisora();
    public String cargarEmisora();

    public String seleccionarLista(int indice);
    public String cambiarCancion();
    public String esucharCancion();
    
    public boolean ConectDesconectTelefono();
    public String MostrarContactos();
    public String LlamarContactos(String numcontacto);
    public String FinalizarLlamada();
    public boolean CambiarSpeaker();
    
    public String PlanificarViajes(String texto);
    
}
