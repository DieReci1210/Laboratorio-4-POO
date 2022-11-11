import java.util.ArrayList;

public class Radio implements RadioA{
    private boolean FMAM = false;
    private boolean estado = false;

    private ArrayList<Emisora> emisoras;
    private ArrayList<Contacto> contactos;
    private ArrayList<Cancion> canciones;
    

    public Radio() {
    }

    public Radio(boolean FMAM, boolean estado, ArrayList<Emisora> emisoras, ArrayList<Contacto> contactos, ArrayList<Cancion> canciones) {
        this.FMAM = FMAM;
        this.estado = estado;
        this.emisoras = emisoras;
        this.contactos = contactos;
        this.canciones = canciones;
    }

    public boolean isFMAM() {
        return this.FMAM;
    }

    public boolean getFMAM() {
        return this.FMAM;
    }

    public void setFMAM(boolean FMAM) {
        this.FMAM = FMAM;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Emisora> getEmisoras() {
        return this.emisoras;
    }

    public void setEmisoras(ArrayList<Emisora> emisoras) {
        this.emisoras = emisoras;
    }

    public ArrayList<Contacto> getContactos() {
        return this.contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public ArrayList<Cancion> getCanciones() {
        return this.canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public Radio FMAM(boolean FMAM) {
        setFMAM(FMAM);
        return this;
    }

    public Radio estado(boolean estado) {
        setEstado(estado);
        return this;
    }

    public Radio emisoras(ArrayList<Emisora> emisoras) {
        setEmisoras(emisoras);
        return this;
    }

    public Radio contactos(ArrayList<Contacto> contactos) {
        setContactos(contactos);
        return this;
    }

    public Radio canciones(ArrayList<Cancion> canciones) {
        setCanciones(canciones);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " FMAM='" + isFMAM() + "'" +
            ", estado='" + isEstado() + "'" +
            ", emisoras='" + getEmisoras() + "'" +
            ", contactos='" + getContactos() + "'" +
            ", canciones='" + getCanciones() + "'" +
            "}";
    }

    @Override
    public boolean encenderApagar() {
        boolean estado;
        
        return false;
    }

    @Override
    public void cambiarVolumen() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean cambiarFMAM() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public float cambiarEmisora() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void guardarEmisora() {
        // TODO Auto-generated method stub
    }

    @Override
    public String cargarEmisora() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String seleccionarLista(int indice) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String cambiarCancion() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String esucharCancion() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean ConectDesconectTelefono() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String MostrarContactos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String LlamarContactos(String numcontacto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String FinalizarLlamada() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean CambiarSpeaker() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String PlanificarViajes(String texto) {
        // TODO Auto-generated method stub
        return null;
    }

}
