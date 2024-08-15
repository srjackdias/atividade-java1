public class Cliente {
    

    private String clienteNome;
    private String email;
    private String senha;

    public Cliente(){}



    public Cliente (String clienteNome, String email,String senha){

            this.clienteNome = clienteNome;
            this.email = email;
            this.senha = senha;






    }

    public String getClienteNome(){
        return clienteNome;




    }

    public void setClienteNome(String clienteNome){
        this.clienteNome = clienteNome;





    }


    public String getEmail(){
        return email;




    }


    public void setEmail(String email){
        this.email = email;





    }

    public String getSenha(){

        return senha;



    }

    public void setSenha (String senha){

        this.senha = senha;


    }
}
