import java.util.ArrayList;

public class Radio implements RadioA{
    private boolean FMAM = false;
    private boolean estado = false;
    private int volumen = 10;
    private float emisora = (float)50.5;
    private int indicecancion = 0;
    private boolean telefono = false;

    private ArrayList<Float> emisoras;
    private ArrayList<Contacto> contactos;
    private ArrayList<Cancion> canciones;
    

    public Radio() {
    }

    public Radio(boolean FMAM, boolean estado, ArrayList<Float> emisoras, ArrayList<Contacto> contactos, ArrayList<Cancion> canciones) {
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

    /**
     * @return float return the volumen
     */
    public int getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    /**
     * @return int return the indicecancion
     */
    public int getIndicecancion() {
        return indicecancion;
    }

    /**
     * @param indicecancion the indicecancion to set
     */
    public void setIndicecancion(int indicecancion) {
        this.indicecancion = indicecancion;
    }

    /**
     * @return boolean return the telefono
     */
    public boolean isTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(boolean telefono) {
        this.telefono = telefono;
    }

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public ArrayList<Float> getEmisoras() {
        return this.emisoras;
    }

    public void setEmisoras(ArrayList<Float> emisoras) {
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

    public Radio emisoras(ArrayList<Float> emisoras) {
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
        boolean estadodef;
        if(this.estado == true){
            estadodef = false;
        }else{
            estadodef = true;
        }

        return estadodef;
    }

    @Override
    public int cambiarVolumen(int cantidad) {
        cantidad += this.volumen;
        return cantidad;
    }
    
    @Override
    public boolean cambiarFMAM() {
        boolean FMAMdef;
        if(this.FMAM == true){
            FMAMdef = false;
        }else{
            FMAMdef = true;
        }
        return FMAMdef;
    }
 
    @Override
    public float cambiarEmisora(boolean masmenos) {
        float emisoradef;
        if(masmenos){
            emisoradef = emisora+ (float)0.5;
        }else{
            emisoradef = emisora- (float)0.5;
        }
        return emisoradef;
    }

    @Override
    public void guardarEmisora() {
        emisoras.add(this.emisora);
    }

    @Override
    public float cargarEmisora(int indice) {
        float emisoracargada = 0;
        if(emisoras.size()<=indice+1){
            emisoracargada = emisoras.get(indice);
        }else{
            emisoracargada = emisora;
        }
        return emisoracargada;
    }

    @Override
    public String seleccionarLista(int indice) {
        return null;
    }

    @Override
    public String cambiarCancion(boolean masmenos) {
        if(masmenos){
            indicecancion = indicecancion+1;
        }else{
            indicecancion = indicecancion-1;
        }
        return canciones.get(indicecancion).getNombre();
    }

    @Override
    public String esucharCancion() {
        return canciones.get(indicecancion).getNombre();
    }

    @Override
    public boolean ConectDesconectTelefono() {
        boolean conect;
        if(this.telefono == true){
            conect = false;
        }else{
            conect = true;
        }

        return conect;
    }

    @Override
    public String MostrarContactos() {
        String lista = null;
        for (Contacto contacto : contactos) {
            lista += contacto.getNombre() + "\n";
        }
        return lista;
    }

    @Override
    public String LlamarContactos(String nombrecontacto) {
        return "En llamada con"+nombrecontacto;
    }

    @Override
    public String FinalizarLlamada() {
        return "Llamada finalizada";
    }

    @Override
    public boolean CambiarSpeaker() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String PlanificarViajes(String texto) {
        return "Se guardo la planificación";
    }

}