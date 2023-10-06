package questao1;

public class Encontrar {
    public static void main(String[] args) {

      AchadoPerdido ap1 = new AchadoPerdido("joao", "eleitor", "3x4", "png", "rua 1030", "10/02/2023", "ativo");

        System.out.println("titulo: " + ap1.getTitulo() +"\nDescricao: " + ap1.getDescricao() + "\nFoto: " + ap1.getFoto() + "\nTipo: " + ap1.getTipo() + "\nlocal achado: " + ap1.getLocal_achado() + "\ndata e hora: " + ap1.getData_hora() + "nStaus: " + ap1.getStatus());

    }
}
