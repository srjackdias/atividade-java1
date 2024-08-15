public class Ingrediente {

    private String nome;
    private double quantidade;

    public Ingrediente(){}


    public Ingrediente(String nome, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade(){
        return quantidade;




    }

    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;



    }
    public void setQuantidade(String quantidade){
        this.quantidade = Double.parseDouble(quantidade);




    }


}