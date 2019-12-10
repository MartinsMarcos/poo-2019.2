import java.util.ArrayList;

class Usuario {
    String id;
    ArrayList<Usuario> seguidores;
    ArrayList<Usuario> seguidos;

    public Usuario(String id){
        this.id = id;
        seguidores = new ArrayList<Usuario>();
        seguidos = new ArrayList<Usuario>();
    }

    public void seguir(Usuario other){
        for(Usuario user : seguidos){
            if(user.id.equals(other.id)){
                return;
            }
        this.seguidos.add(other);
        other.seguidores.add(this);
        }
    }

    @Override
    public String toString() {
        String saida = id + "\n";
        saida += "<- [";
        for(Usuario user : seguidos) //{
            saida += user.id + " ";
        saida += "]\n-> [ ";
        for(Usuario use : seguidores) //{
            saida += use.id + " ";
        saida += "]";
        return saida;
        //}
        //}
    }
}

