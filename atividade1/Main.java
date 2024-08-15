public class Main {
    



    public static void main(String[] args) {
        
        System.out.println("Informações da Receita");

        Receita receita = new Receita();
        receita.setCategoria("Salgado");
        System.out.println("Ingrediente: " + receita.getCategoria());



        System.out.println("Informações do ingrediente!");

        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome("Brigadeiro");
        ingrediente.setQuantidade(23);
      
        System.out.println("Nome: " + ingrediente.getNome());

        System.out.println("Informações do cliente");

        Cliente cliente = new Cliente();
        cliente.setClienteNome("flash");
        cliente.setEmail("sr.flash@gmail.com");
        cliente.setSenha("123456");

        System.out.println("Nome:" + cliente.getClienteNome());
        System.out.println("Email:" + cliente.getEmail());
        System.out.println("Senha:" + cliente.getSenha());



    }
}
